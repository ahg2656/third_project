package chat;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ChatListServlet")
public class ChatListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");	//파라미터로 전달되는 데이터의 한글 처리
		response.setContentType("text/html;charset=UTF-8");	//브라우저로 보내는 데이터의 한글 처리
		
		String listType = request.getParameter("listType");
		if(listType == null || listType.equals("")) {
			response.getWriter().write("");
		} else if(listType.equals("today")) {
			response.getWriter().write(getToday());
		} else if(listType.equals("ten")) {
			response.getWriter().write(getTen());
		} else {
			try {
				Integer.parseInt(listType);
				response.getWriter().write(getId(listType));
			} catch (Exception e) {
				response.getWriter().write("");
			}
		}
	}
	
	public String getToday() {
		StringBuffer result = new StringBuffer("");
		result.append("{\"result\":[");
		ChatDao chatDao = new ChatDao();
		
		ArrayList<ChatDto> chatList = chatDao.getChatList(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		for(int i = 0; i < chatList.size(); i++) {
			result.append("[{\"value\": \"" + chatList.get(i).getChatName() + "\"},");
			result.append("{\"value\": \"" + chatList.get(i).getChatContent() + "\"},");
			result.append("{\"value\": \"" + chatList.get(i).getChatTime() + "\"}]");
			
			if(i != chatList.size() - 1) {
				result.append(",");
			}						
		}
		result.append("], \"last\":\"" + chatList.get(chatList.size() - 1).getChatId() + "\"}");
		
		return result.toString();
	}
	
	public String getTen() {
		StringBuffer result = new StringBuffer("");
		result.append("{\"result\":[");
		ChatDao chatDao = new ChatDao();
		
		ArrayList<ChatDto> chatList = chatDao.getChatListByRecent(10);
		for(int i = 0; i < chatList.size(); i++) {
			result.append("[{\"value\": \"" + chatList.get(i).getChatName() + "\"},");
			result.append("{\"value\": \"" + chatList.get(i).getChatContent() + "\"},");
			result.append("{\"value\": \"" + chatList.get(i).getChatTime() + "\"}]");
			
			if(i != chatList.size() - 1) {
				result.append(",");
			}						
		}
		result.append("], \"last\":\"" + chatList.get(chatList.size() - 1).getChatId() + "\"}");
		
		return result.toString();
	}
	
	public String getId(String chatId) {
		StringBuffer result = new StringBuffer("");
		result.append("{\"result\":[");
		ChatDao chatDao = new ChatDao();
		
		ArrayList<ChatDto> chatList = chatDao.getChatListByRecent(chatId);
		for(int i = 0; i < chatList.size(); i++) {
			result.append("[{\"value\": \"" + chatList.get(i).getChatName() + "\"},");
			result.append("{\"value\": \"" + chatList.get(i).getChatContent() + "\"},");
			result.append("{\"value\": \"" + chatList.get(i).getChatTime() + "\"}]");
			
			if(i != chatList.size() - 1) {
				result.append(",");
			}						
		}
		result.append("], \"last\":\"" + chatList.get(chatList.size() - 1).getChatId() + "\"}");
		
		return result.toString();
	}

}
