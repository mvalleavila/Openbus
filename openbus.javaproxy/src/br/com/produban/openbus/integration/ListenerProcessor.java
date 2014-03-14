package br.com.produban.openbus.integration;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.produban.openbus.model.AgentData;
import br.com.produban.openbus.model.Request;
import br.com.produban.openbus.publisher.Publisher;
import br.com.produban.openbus.publisher.kafka.KafkaPublisher;
import br.com.produban.openbus.utils.MessageTransformer;

import com.github.terma.javaniotcpproxy.TcpProxyRunner;

public class ListenerProcessor {

	private final Publisher publisher;

	public ListenerProcessor() {
		publisher = new KafkaPublisher(TcpProxyRunner.getPublisherConfig().getIntegrationTierServer() + ":"
				+ TcpProxyRunner.getPublisherConfig().getIntegrationTierPort(), false);
	}

	public void compute() {
		LinkedList<ByteBuffer> list = IntegrationQueue.getInstance().getAll();
		List<AgentData> agentDatas = new ArrayList<AgentData>();
		for (ByteBuffer byteBuffer : list) {
			Request request = MessageTransformer.parseByteBufferToRequest(byteBuffer);
			if (request != null) {
				if (request.getRequest().equals("agent data")) {
					agentDatas.addAll(request.getData());
				}
			}
		}
		publisher.publishAll(agentDatas);
	}

}