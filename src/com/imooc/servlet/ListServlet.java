package com.imooc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.service.ListService;

/**
 * 列表初始化服务类
 */
@SuppressWarnings("serial")
public class ListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//编码设置
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		//接受数据
		String method = request.getParameter("method");
		String id = request.getParameter("id");
		String command = request.getParameter("command");
		String description = request.getParameter("description");
		String content = request.getParameter("content");
		String commandSearch = request.getParameter("commandSearch");
		String descriptionSearch = request.getParameter("descriptionSearch");
		
		//通过request将数据传回页面
		request.setAttribute("method", method);
		request.setAttribute("command", command);
		request.setAttribute("description", description);
		request.setAttribute("id", id);
		request.setAttribute("content", content);
		request.setAttribute("commandSearch", commandSearch);
		request.setAttribute("descriptionSearch", descriptionSearch);
		
		//查询列表并传回页面
		ListService listService = new ListService();
		request.setAttribute("messageList", listService.maintainList(method,id,command,description,content,commandSearch,descriptionSearch));

		//向页面跳转
		request.getRequestDispatcher("/WEB-INF/jsp/back/list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
