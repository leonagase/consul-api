package com.ecwid.consul.v1.agent.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author Vasily Vasilkov (vgv@ecwid.com)
 */
public class NewCheck {

	@SerializedName("ID")
	private String id;

	@SerializedName("Name")
	private String name;

	@SerializedName("Notes")
	private String notes;

	@SerializedName("Script")
	private String script;

	@SerializedName("Interval")
	private Integer interval;

	@SerializedName("TTL")
	private Integer ttl;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public Integer getInterval() {
		return interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public Integer getTtl() {
		return ttl;
	}

	public void setTtl(Integer ttl) {
		this.ttl = ttl;
	}

	@Override
	public String toString() {
		return "NewCheck{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", notes='" + notes + '\'' +
				", script='" + script + '\'' +
				", interval=" + interval +
				", ttl=" + ttl +
				'}';
	}
}
