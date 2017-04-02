package com.imooc.bean;

/**
 * 与消息表对应的实体类
 *
 */
public class Message {

	public Message(){
		
	}
	
	
	public Message(int id, String command, String description, String content) {
		super();
		this.id = id;
		this.command = command;
		this.description = description;
		this.content = content;
	}

	public Message(String command, String description, String content) {
		super();
		this.command = command;
		this.description = description;
		this.content = content;
	}




	/**
	 * 主键
	 */
	private int id;

	/**
	 * 指令名称
	 */
	private String command;

	/**
	 * 描述
	 */
	private String description;
	
	/**
	 * 内容
	 */
	private String content;

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
