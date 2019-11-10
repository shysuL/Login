package controller.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session =  req.getSession();
		// 세션 정보 추가하기(세션 컨텍스트 영역에 추가됨)

//		session.setAttribute(id, req.getParameter("userid"));
//		session.setAttribute(pw, req.getParameter("userpw"));
		
		//TEST
//		System.out.println(resp.encodeURL("/login/login"));
		
		
		
		
		//View
		req.getRequestDispatcher("/WEB-INF/views/login/loginForm.jsp")
		.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 세션 객체 얻기
		HttpSession session =  req.getSession();
		
		//TEST
		System.out.println(resp.encodeURL("/login/login"));
		System.out.println("/login/login;jsessionid=" + session.getId());
		String id = req.getParameter("userid");
		String pw = req.getParameter("userpw");

		
		//로그인 인증
		if(id.equals("abc") && pw.equals("123")){
			// 로그인 성공
			session.setAttribute("userid", id); // 세션 정보 저장
			session.setAttribute("login", "true"); // 세션 정보 저장
			// 로그인정보(입력받은 데이터)
			System.out.println("id: " + id);
			System.out.println("pw: " + pw);
			//View
			req.getRequestDispatcher("/WEB-INF/views/login/loginSuccess.jsp")
			.forward(req, resp);	
			return;
		}else {
			//View
			req.getRequestDispatcher("/WEB-INF/views/login/loginFail.jsp")
			.forward(req, resp);	
		
			
		}
		
		
	}
}
