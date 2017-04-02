package com.imooc.service;

import java.util.List;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;

/**
 * List相关服务
 *
 */
public class ListService {
	
	/**
	 * list管理service
	 * 包装提交的Message
	 * @param method
	 * @param id
	 * @param command
	 * @param description
	 * @param content
	 * @return List
	 */
	public List<Message> maintainList(String method,String id, String command, 
			String description, String content,String commandSearch,String descriptionSearch){
		
		//包装Message
		Message message;
		if(id != null && !"".equals(id)){
			message = new Message(Integer.valueOf(id),command,description,content);
		}else{
			message = new Message(command,description,content);
		}
		
		if(method != null && !"".equals(method)){
			if("addMessage".equals(method)){
				addMessage(message);
				return queryMessageList(null,null);
			}
			
			return queryMessageList(commandSearch,descriptionSearch);
		}
		
		return queryMessageList(commandSearch,descriptionSearch);
	}
	
	/**
	 * 添加message
	 * @param message
	 */
	public void addMessage(Message message){
		
		MessageDao messageDao = new MessageDao();
		messageDao.addMessage(message);
	}
	
	/**
	 * 查询messageList
	 * @param command
	 * @param description
	 * @return list
	 */
	public List<Message> queryMessageList(String command, String description) {
		
		MessageDao messageDao = new MessageDao();
		return messageDao.queryMessageList(command, description);
	}
}
