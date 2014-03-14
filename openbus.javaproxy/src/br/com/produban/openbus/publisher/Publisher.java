package br.com.produban.openbus.publisher;

import java.util.List;

import br.com.produban.openbus.model.AgentData;

public interface Publisher {

	void publish(AgentData agentData);
	void publishAll(List<AgentData> agentData);
}
