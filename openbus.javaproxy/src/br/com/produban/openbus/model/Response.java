package br.com.produban.openbus.model;

public class Response {

	private String response;
	private AgentData data;
	private String info;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public AgentData getData() {
		return data;
	}

	public void setData(AgentData data) {
		this.data = data;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
