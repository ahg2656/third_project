package chat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ChatDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public ChatDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<ChatDto> getChatList(String nowTime){
		ArrayList<ChatDto> chatList = new ArrayList<>();
		pstmt = null;
		rs = null;
		String sql = "select * from chat where chatTime > ? order by chatTime";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, nowTime);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ChatDto dto = new ChatDto();
				dto.setChatId(rs.getInt("chatId"));
				dto.setChatName(rs.getString("chatName"));
				dto.setChatContent(rs.getString("chatContent").replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>"));
				int chatTime = Integer.parseInt(rs.getString("chatTime").substring(11, 13));
				String timeType = "오전";
				if(Integer.parseInt(rs.getString("chatTime").substring(11, 13)) >= 12) {
					timeType = "오후";
					chatTime -= 12;
				}
				dto.setChatTime(rs.getString("chatTime").substring(0, 11) + " " + timeType + " " + chatTime + ":" + rs.getString("chatTime").substring(14, 16) + "");
				
				chatList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}		
		}
		return chatList;
	}
	
	public ArrayList<ChatDto> getChatListByRecent(int number){
		ArrayList<ChatDto> chatList = new ArrayList<>();
		pstmt = null;
		rs = null;
		String sql = "select * from chat where chatId > (select max(chatId) - ? from chat) order by chatTime";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ChatDto dto = new ChatDto();
				dto.setChatId(rs.getInt("chatId"));
				dto.setChatName(rs.getString("chatName"));
				dto.setChatContent(rs.getString("chatContent").replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>"));
				int chatTime = Integer.parseInt(rs.getString("chatTime").substring(11, 13));
				String timeType = "오전";
				if(Integer.parseInt(rs.getString("chatTime").substring(11, 13)) >= 12) {
					timeType = "오후";
					chatTime -= 12;
				}
				dto.setChatTime(rs.getString("chatTime").substring(0, 11) + " " + timeType + " " + chatTime + ":" + rs.getString("chatTime").substring(14, 16) + "");
				
				chatList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}		
		}
		return chatList;
	}
	
	public ArrayList<ChatDto> getChatListByRecent(String chatId){
		ArrayList<ChatDto> chatList = new ArrayList<>();
		pstmt = null;
		rs = null;
		String sql = "select * from chat where chatId > ? order by chatTime";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, chatId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ChatDto dto = new ChatDto();
				dto.setChatId(rs.getInt("chatId"));
				dto.setChatName(rs.getString("chatName"));
				dto.setChatContent(rs.getString("chatContent").replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>"));
				int chatTime = Integer.parseInt(rs.getString("chatTime").substring(11, 13));
				String timeType = "오전";
				if(Integer.parseInt(rs.getString("chatTime").substring(11, 13)) >= 12) {
					timeType = "오후";
					chatTime -= 12;
				}
				dto.setChatTime(rs.getString("chatTime").substring(0, 11) + " " + timeType + " " + chatTime + ":" + rs.getString("chatTime").substring(14, 16) + "");
				
				chatList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}		
		}
		return chatList;
	}
	
	public int submit(String chatName, String chatContent) {
		pstmt = null;
		rs = null;
		String sql = "insert into chat values(NULL,?,?,now())";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, chatName);
			pstmt.setString(2, chatContent);
			
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}		
		}
		return -1;
	}
	
}

