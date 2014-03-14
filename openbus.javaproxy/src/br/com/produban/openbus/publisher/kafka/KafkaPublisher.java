package br.com.produban.openbus.publisher.kafka;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import br.com.produban.openbus.model.AgentData;
import br.com.produban.openbus.publisher.Publisher;
import br.com.produban.openbus.utils.AvroEncoder;

public class KafkaPublisher implements Publisher {

	private Producer<String, byte[]> producer;

	public KafkaPublisher(Properties properties) {
		producer = new Producer<String, byte[]>(new ProducerConfig(properties));
	}

	public KafkaPublisher(String brokerList, boolean requiredAcks) {
		Properties props = new Properties();
		props.put("metadata.broker.list", brokerList);
		props.put("request.required.acks", requiredAcks ? "1" : "0");
		props.put("serializer.class", "kafka.serializer.DefaultEncoder");

		producer = new Producer<String, byte[]>(new ProducerConfig(props));
	}

	@Override
	public void publish(AgentData agentData) {
		producer.send(AvroEncoder.getKeyedMessage(agentData));
	}

	@Override
	public void publishAll(List<AgentData> agentDataList) {
		if (agentDataList.size() > 0)
			System.out.println(Thread.currentThread().getName() + " processing " + agentDataList.size() + " messages.");
		List<KeyedMessage<String, byte[]>> keyedMessages = new ArrayList<KeyedMessage<String, byte[]>>();
		for (AgentData agentData : agentDataList) {
			keyedMessages.add(AvroEncoder.getKeyedMessage(agentData));
		}
		producer.send(keyedMessages);
	}

}
