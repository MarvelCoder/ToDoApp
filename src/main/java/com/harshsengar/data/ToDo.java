package com.harshsengar.data;

import org.springframework.data.annotation.Id;

public class ToDo {

	@Id
	private String id;

	private final String title;

	private final String completed;

	public ToDo(String title, String completed) {
		this.title = title;
		this.completed = completed;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCompleted() {
		return completed;
	}

}