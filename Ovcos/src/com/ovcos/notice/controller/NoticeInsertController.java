package com.ovcos.notice.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ovcos.loginRegister.model.vo.Member;
import com.ovcos.notice.model.service.NoticeService;
import com.ovcos.notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeInsertController
 */
@WebServlet("/insert.no")
public class NoticeInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeInsertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		String noticeTitle = request.getParameter("title");
		String noticeContent = request.getParameter("content");
		
		HttpSession session = request.getSession();
		String ntcWriter = ((Member)session.getAttribute("loginUser")).getMemId(); //현재로그인한 유저아이디(관리자여야함)
		
		
		Notice n = new Notice();
		n.setNtcTitle(noticeTitle);
		n.setNtcCnt(noticeContent);
		n.setNtcWriter(ntcWriter);
		
		int result = new NoticeService().insertNotice(n);
		
		if(result>0) {//조회성공 => 목록조회 화면으로 url 재요청  성공하면 공지사항 목록으로 ->띄워본거니까 url 재요청
			
			response.sendRedirect(request.getContextPath() + "/list.no");
			
			
		}else {//실패 => 에러문구(공지사항 등록 실패) 담아서 에러메세지 포워딩 
			
			session.setAttribute("alertMsg","게시글 등록 실패");
			
			response.sendRedirect(request.getContextPath() + "/list.no");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
