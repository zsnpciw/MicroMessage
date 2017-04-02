package com.imooc.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.imooc.bean.Message;
import com.imooc.db.DBAccess;

public class MessageDao {

	public List<Message> queryMessageList(String command, String description) {

		List<Message> messageList = new ArrayList<Message>();

		Message message = new Message();
		message.setCommand(command);
		message.setDescription(description);

		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			messageList = sqlSession.selectList("Message.queryMessageList", message);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return messageList;
	}

	public void addMessage(Message message){
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			sqlSession.insert("Message.addMessage", message);
			sqlSession.commit();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Message message = new Message();
		message.setCommand("插入测试");
		message.setContent("插入测试");
		message.setDescription("插入测试");
		MessageDao messageDao = new MessageDao();
//		messageDao.queryMessageList("", "");
		messageDao.addMessage(message);
	}
}
