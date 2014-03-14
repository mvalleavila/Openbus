package br.com.produban.openbus.model;

public class AgentData {

	private String host;
	private String host_metadata;
	private String mtime;
	private String timestamp;
	private String source;
	private String severity;
	private String eventid;
	private String state;
	private String key;
	private String value;
	private String lastlogsize;
	private String clock;
	private String ns;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getHost_metadata() {
		return host_metadata;
	}

	public void setHost_metadata(String host_metadata) {
		this.host_metadata = host_metadata;
	}

	public String getMtime() {
		return mtime;
	}

	public void setMtime(String mtime) {
		this.mtime = mtime;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getEventid() {
		return eventid;
	}

	public void setEventid(String eventid) {
		this.eventid = eventid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLastlogsize() {
		return lastlogsize;
	}

	public void setLastlogsize(String lastlogsize) {
		this.lastlogsize = lastlogsize;
	}

	public String getClock() {
		return clock;
	}

	public void setClock(String clock) {
		this.clock = clock;
	}

	public String getNs() {
		return ns;
	}

	public void setNs(String ns) {
		this.ns = ns;
	}

	@Override
	public String toString() {
		return "AgentData [host=" + host + ", host_metadata=" + host_metadata + ", mtime=" + mtime + ", timestamp="
				+ timestamp + ", source=" + source + ", severity=" + severity + ", eventid=" + eventid + ", state="
				+ state + ", key=" + key + ", value=" + value + ", lastlogsize=" + lastlogsize + ", clock=" + clock
				+ ", ns=" + ns + "]";
	}

}
