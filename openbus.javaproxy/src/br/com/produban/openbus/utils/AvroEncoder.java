package br.com.produban.openbus.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import kafka.producer.KeyedMessage;

import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;

import br.com.produban.openbus.model.AgentData;
import br.com.produban.openbus.model.avro.AgentDataAvro;

import com.github.terma.javaniotcpproxy.TcpProxyRunner;

public class AvroEncoder {

	public static KeyedMessage<String, byte[]> getKeyedMessage(AgentData agentData) {
		AgentDataAvro agentDataAvro = parseAgentDataToAvro(agentData);

		GenericDatumWriter<AgentDataAvro> writer = new GenericDatumWriter<AgentDataAvro>();
		writer.setSchema(agentDataAvro.getSchema());
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		Encoder e = EncoderFactory.get().binaryEncoder(outputStream, null);

		try {
			writer.write(agentDataAvro, e);
			e.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
			return null;
		}

		return new KeyedMessage<String, byte[]>(TcpProxyRunner.getPublisherConfig().getDefaultTopic(),
				outputStream.toByteArray());

	}
	
	private static AgentDataAvro parseAgentDataToAvro(AgentData agentData) {
		AgentDataAvro agentDataAvro = AgentDataAvro.newBuilder().setHost(agentData.getHost())
		.setHostMetadata(agentData.getHost_metadata()).setKey(agentData.getKey())
		.setEventid(agentData.getEventid()).setMtime(agentData.getMtime())
		.setSeverity(agentData.getSeverity()).setSource(agentData.getSource())
		.setState(agentData.getState()).setTimestamp(agentData.getTimestamp())
		.setValue(agentData.getValue()).setClock(agentData.getClock())
		.setLastlogsize(agentData.getLastlogsize()).setNs(agentData.getNs()).build();
		return agentDataAvro;
	}
}
