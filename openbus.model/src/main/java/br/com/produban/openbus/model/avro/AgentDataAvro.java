/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package br.com.produban.openbus.model.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AgentDataAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AgentDataAvro\",\"namespace\":\"br.com.inmetrics.openbus.model.avro\",\"fields\":[{\"name\":\"host\",\"type\":\"string\"},{\"name\":\"host_metadata\",\"type\":[\"string\",\"null\"]},{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"string\"},{\"name\":\"lastlogsize\",\"type\":[\"string\",\"null\"]},{\"name\":\"mtime\",\"type\":[\"string\",\"null\"]},{\"name\":\"timestamp\",\"type\":[\"string\",\"null\"]},{\"name\":\"source\",\"type\":[\"string\",\"null\"]},{\"name\":\"severity\",\"type\":[\"string\",\"null\"]},{\"name\":\"eventid\",\"type\":[\"string\",\"null\"]},{\"name\":\"state\",\"type\":[\"string\",\"null\"]},{\"name\":\"clock\",\"type\":\"string\"},{\"name\":\"ns\",\"type\":[\"string\",\"null\"]}],\"aliases\":[\"AgentData\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence host;
  @Deprecated public java.lang.CharSequence host_metadata;
  @Deprecated public java.lang.CharSequence key;
  @Deprecated public java.lang.CharSequence value;
  @Deprecated public java.lang.CharSequence lastlogsize;
  @Deprecated public java.lang.CharSequence mtime;
  @Deprecated public java.lang.CharSequence timestamp;
  @Deprecated public java.lang.CharSequence source;
  @Deprecated public java.lang.CharSequence severity;
  @Deprecated public java.lang.CharSequence eventid;
  @Deprecated public java.lang.CharSequence state;
  @Deprecated public java.lang.CharSequence clock;
  @Deprecated public java.lang.CharSequence ns;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public AgentDataAvro() {}

  /**
   * All-args constructor.
   */
  public AgentDataAvro(java.lang.CharSequence host, java.lang.CharSequence host_metadata, java.lang.CharSequence key, java.lang.CharSequence value, java.lang.CharSequence lastlogsize, java.lang.CharSequence mtime, java.lang.CharSequence timestamp, java.lang.CharSequence source, java.lang.CharSequence severity, java.lang.CharSequence eventid, java.lang.CharSequence state, java.lang.CharSequence clock, java.lang.CharSequence ns) {
    this.host = host;
    this.host_metadata = host_metadata;
    this.key = key;
    this.value = value;
    this.lastlogsize = lastlogsize;
    this.mtime = mtime;
    this.timestamp = timestamp;
    this.source = source;
    this.severity = severity;
    this.eventid = eventid;
    this.state = state;
    this.clock = clock;
    this.ns = ns;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return host;
    case 1: return host_metadata;
    case 2: return key;
    case 3: return value;
    case 4: return lastlogsize;
    case 5: return mtime;
    case 6: return timestamp;
    case 7: return source;
    case 8: return severity;
    case 9: return eventid;
    case 10: return state;
    case 11: return clock;
    case 12: return ns;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: host = (java.lang.CharSequence)value$; break;
    case 1: host_metadata = (java.lang.CharSequence)value$; break;
    case 2: key = (java.lang.CharSequence)value$; break;
    case 3: value = (java.lang.CharSequence)value$; break;
    case 4: lastlogsize = (java.lang.CharSequence)value$; break;
    case 5: mtime = (java.lang.CharSequence)value$; break;
    case 6: timestamp = (java.lang.CharSequence)value$; break;
    case 7: source = (java.lang.CharSequence)value$; break;
    case 8: severity = (java.lang.CharSequence)value$; break;
    case 9: eventid = (java.lang.CharSequence)value$; break;
    case 10: state = (java.lang.CharSequence)value$; break;
    case 11: clock = (java.lang.CharSequence)value$; break;
    case 12: ns = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'host' field.
   */
  public java.lang.CharSequence getHost() {
    return host;
  }

  /**
   * Sets the value of the 'host' field.
   * @param value the value to set.
   */
  public void setHost(java.lang.CharSequence value) {
    this.host = value;
  }

  /**
   * Gets the value of the 'host_metadata' field.
   */
  public java.lang.CharSequence getHostMetadata() {
    return host_metadata;
  }

  /**
   * Sets the value of the 'host_metadata' field.
   * @param value the value to set.
   */
  public void setHostMetadata(java.lang.CharSequence value) {
    this.host_metadata = value;
  }

  /**
   * Gets the value of the 'key' field.
   */
  public java.lang.CharSequence getKey() {
    return key;
  }

  /**
   * Sets the value of the 'key' field.
   * @param value the value to set.
   */
  public void setKey(java.lang.CharSequence value) {
    this.key = value;
  }

  /**
   * Gets the value of the 'value' field.
   */
  public java.lang.CharSequence getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.CharSequence value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'lastlogsize' field.
   */
  public java.lang.CharSequence getLastlogsize() {
    return lastlogsize;
  }

  /**
   * Sets the value of the 'lastlogsize' field.
   * @param value the value to set.
   */
  public void setLastlogsize(java.lang.CharSequence value) {
    this.lastlogsize = value;
  }

  /**
   * Gets the value of the 'mtime' field.
   */
  public java.lang.CharSequence getMtime() {
    return mtime;
  }

  /**
   * Sets the value of the 'mtime' field.
   * @param value the value to set.
   */
  public void setMtime(java.lang.CharSequence value) {
    this.mtime = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   */
  public java.lang.CharSequence getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.CharSequence value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'source' field.
   */
  public java.lang.CharSequence getSource() {
    return source;
  }

  /**
   * Sets the value of the 'source' field.
   * @param value the value to set.
   */
  public void setSource(java.lang.CharSequence value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'severity' field.
   */
  public java.lang.CharSequence getSeverity() {
    return severity;
  }

  /**
   * Sets the value of the 'severity' field.
   * @param value the value to set.
   */
  public void setSeverity(java.lang.CharSequence value) {
    this.severity = value;
  }

  /**
   * Gets the value of the 'eventid' field.
   */
  public java.lang.CharSequence getEventid() {
    return eventid;
  }

  /**
   * Sets the value of the 'eventid' field.
   * @param value the value to set.
   */
  public void setEventid(java.lang.CharSequence value) {
    this.eventid = value;
  }

  /**
   * Gets the value of the 'state' field.
   */
  public java.lang.CharSequence getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(java.lang.CharSequence value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'clock' field.
   */
  public java.lang.CharSequence getClock() {
    return clock;
  }

  /**
   * Sets the value of the 'clock' field.
   * @param value the value to set.
   */
  public void setClock(java.lang.CharSequence value) {
    this.clock = value;
  }

  /**
   * Gets the value of the 'ns' field.
   */
  public java.lang.CharSequence getNs() {
    return ns;
  }

  /**
   * Sets the value of the 'ns' field.
   * @param value the value to set.
   */
  public void setNs(java.lang.CharSequence value) {
    this.ns = value;
  }

  /** Creates a new AgentDataAvro RecordBuilder */
  public static br.com.produban.openbus.model.avro.AgentDataAvro.Builder newBuilder() {
    return new br.com.produban.openbus.model.avro.AgentDataAvro.Builder();
  }
  
  /** Creates a new AgentDataAvro RecordBuilder by copying an existing Builder */
  public static br.com.produban.openbus.model.avro.AgentDataAvro.Builder newBuilder(br.com.produban.openbus.model.avro.AgentDataAvro.Builder other) {
    return new br.com.produban.openbus.model.avro.AgentDataAvro.Builder(other);
  }
  
  /** Creates a new AgentDataAvro RecordBuilder by copying an existing AgentDataAvro instance */
  public static br.com.produban.openbus.model.avro.AgentDataAvro.Builder newBuilder(br.com.produban.openbus.model.avro.AgentDataAvro other) {
    return new br.com.produban.openbus.model.avro.AgentDataAvro.Builder(other);
  }
  
  /**
   * RecordBuilder for AgentDataAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AgentDataAvro>
    implements org.apache.avro.data.RecordBuilder<AgentDataAvro> {

    private java.lang.CharSequence host;
    private java.lang.CharSequence host_metadata;
    private java.lang.CharSequence key;
    private java.lang.CharSequence value;
    private java.lang.CharSequence lastlogsize;
    private java.lang.CharSequence mtime;
    private java.lang.CharSequence timestamp;
    private java.lang.CharSequence source;
    private java.lang.CharSequence severity;
    private java.lang.CharSequence eventid;
    private java.lang.CharSequence state;
    private java.lang.CharSequence clock;
    private java.lang.CharSequence ns;

    /** Creates a new Builder */
    private Builder() {
      super(br.com.produban.openbus.model.avro.AgentDataAvro.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(br.com.produban.openbus.model.avro.AgentDataAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.host)) {
        this.host = data().deepCopy(fields()[0].schema(), other.host);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.host_metadata)) {
        this.host_metadata = data().deepCopy(fields()[1].schema(), other.host_metadata);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.key)) {
        this.key = data().deepCopy(fields()[2].schema(), other.key);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.value)) {
        this.value = data().deepCopy(fields()[3].schema(), other.value);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.lastlogsize)) {
        this.lastlogsize = data().deepCopy(fields()[4].schema(), other.lastlogsize);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.mtime)) {
        this.mtime = data().deepCopy(fields()[5].schema(), other.mtime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[6].schema(), other.timestamp);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.source)) {
        this.source = data().deepCopy(fields()[7].schema(), other.source);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.severity)) {
        this.severity = data().deepCopy(fields()[8].schema(), other.severity);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.eventid)) {
        this.eventid = data().deepCopy(fields()[9].schema(), other.eventid);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.state)) {
        this.state = data().deepCopy(fields()[10].schema(), other.state);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.clock)) {
        this.clock = data().deepCopy(fields()[11].schema(), other.clock);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.ns)) {
        this.ns = data().deepCopy(fields()[12].schema(), other.ns);
        fieldSetFlags()[12] = true;
      }
    }
    
    /** Creates a Builder by copying an existing AgentDataAvro instance */
    private Builder(br.com.produban.openbus.model.avro.AgentDataAvro other) {
            super(br.com.produban.openbus.model.avro.AgentDataAvro.SCHEMA$);
      if (isValidValue(fields()[0], other.host)) {
        this.host = data().deepCopy(fields()[0].schema(), other.host);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.host_metadata)) {
        this.host_metadata = data().deepCopy(fields()[1].schema(), other.host_metadata);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.key)) {
        this.key = data().deepCopy(fields()[2].schema(), other.key);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.value)) {
        this.value = data().deepCopy(fields()[3].schema(), other.value);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.lastlogsize)) {
        this.lastlogsize = data().deepCopy(fields()[4].schema(), other.lastlogsize);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.mtime)) {
        this.mtime = data().deepCopy(fields()[5].schema(), other.mtime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[6].schema(), other.timestamp);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.source)) {
        this.source = data().deepCopy(fields()[7].schema(), other.source);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.severity)) {
        this.severity = data().deepCopy(fields()[8].schema(), other.severity);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.eventid)) {
        this.eventid = data().deepCopy(fields()[9].schema(), other.eventid);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.state)) {
        this.state = data().deepCopy(fields()[10].schema(), other.state);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.clock)) {
        this.clock = data().deepCopy(fields()[11].schema(), other.clock);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.ns)) {
        this.ns = data().deepCopy(fields()[12].schema(), other.ns);
        fieldSetFlags()[12] = true;
      }
    }

    /** Gets the value of the 'host' field */
    public java.lang.CharSequence getHost() {
      return host;
    }
    
    /** Sets the value of the 'host' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder setHost(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.host = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'host' field has been set */
    public boolean hasHost() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'host' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder clearHost() {
      host = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'host_metadata' field */
    public java.lang.CharSequence getHostMetadata() {
      return host_metadata;
    }
    
    /** Sets the value of the 'host_metadata' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder setHostMetadata(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.host_metadata = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'host_metadata' field has been set */
    public boolean hasHostMetadata() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'host_metadata' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder clearHostMetadata() {
      host_metadata = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'key' field */
    public java.lang.CharSequence getKey() {
      return key;
    }
    
    /** Sets the value of the 'key' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder setKey(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.key = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'key' field has been set */
    public boolean hasKey() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'key' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder clearKey() {
      key = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'value' field */
    public java.lang.CharSequence getValue() {
      return value;
    }
    
    /** Sets the value of the 'value' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder setValue(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.value = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'value' field has been set */
    public boolean hasValue() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'value' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder clearValue() {
      value = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'lastlogsize' field */
    public java.lang.CharSequence getLastlogsize() {
      return lastlogsize;
    }
    
    /** Sets the value of the 'lastlogsize' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder setLastlogsize(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.lastlogsize = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'lastlogsize' field has been set */
    public boolean hasLastlogsize() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'lastlogsize' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder clearLastlogsize() {
      lastlogsize = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'mtime' field */
    public java.lang.CharSequence getMtime() {
      return mtime;
    }
    
    /** Sets the value of the 'mtime' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder setMtime(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.mtime = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'mtime' field has been set */
    public boolean hasMtime() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'mtime' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder clearMtime() {
      mtime = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'timestamp' field */
    public java.lang.CharSequence getTimestamp() {
      return timestamp;
    }
    
    /** Sets the value of the 'timestamp' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder setTimestamp(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.timestamp = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'timestamp' field has been set */
    public boolean hasTimestamp() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'timestamp' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'source' field */
    public java.lang.CharSequence getSource() {
      return source;
    }
    
    /** Sets the value of the 'source' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder setSource(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.source = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'source' field has been set */
    public boolean hasSource() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'source' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder clearSource() {
      source = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'severity' field */
    public java.lang.CharSequence getSeverity() {
      return severity;
    }
    
    /** Sets the value of the 'severity' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder setSeverity(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.severity = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'severity' field has been set */
    public boolean hasSeverity() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'severity' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder clearSeverity() {
      severity = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'eventid' field */
    public java.lang.CharSequence getEventid() {
      return eventid;
    }
    
    /** Sets the value of the 'eventid' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder setEventid(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.eventid = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'eventid' field has been set */
    public boolean hasEventid() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'eventid' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder clearEventid() {
      eventid = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'state' field */
    public java.lang.CharSequence getState() {
      return state;
    }
    
    /** Sets the value of the 'state' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder setState(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.state = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'state' field has been set */
    public boolean hasState() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'state' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder clearState() {
      state = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'clock' field */
    public java.lang.CharSequence getClock() {
      return clock;
    }
    
    /** Sets the value of the 'clock' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder setClock(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.clock = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'clock' field has been set */
    public boolean hasClock() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'clock' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder clearClock() {
      clock = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'ns' field */
    public java.lang.CharSequence getNs() {
      return ns;
    }
    
    /** Sets the value of the 'ns' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder setNs(java.lang.CharSequence value) {
      validate(fields()[12], value);
      this.ns = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'ns' field has been set */
    public boolean hasNs() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'ns' field */
    public br.com.produban.openbus.model.avro.AgentDataAvro.Builder clearNs() {
      ns = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    @Override
    public AgentDataAvro build() {
      try {
        AgentDataAvro record = new AgentDataAvro();
        record.host = fieldSetFlags()[0] ? this.host : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.host_metadata = fieldSetFlags()[1] ? this.host_metadata : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.key = fieldSetFlags()[2] ? this.key : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.value = fieldSetFlags()[3] ? this.value : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.lastlogsize = fieldSetFlags()[4] ? this.lastlogsize : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.mtime = fieldSetFlags()[5] ? this.mtime : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.timestamp = fieldSetFlags()[6] ? this.timestamp : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.source = fieldSetFlags()[7] ? this.source : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.severity = fieldSetFlags()[8] ? this.severity : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.eventid = fieldSetFlags()[9] ? this.eventid : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.state = fieldSetFlags()[10] ? this.state : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.clock = fieldSetFlags()[11] ? this.clock : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.ns = fieldSetFlags()[12] ? this.ns : (java.lang.CharSequence) defaultValue(fields()[12]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
