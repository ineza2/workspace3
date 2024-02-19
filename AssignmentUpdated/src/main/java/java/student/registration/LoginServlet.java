package java.student.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserDao userDao = new UserDao();
//		if (RegistrationValidator.validateEmail(email) &&
//				RegistrationValidator.validatePhone(password)) {
			
			User user = userDao.checkCredentialsAndRole(email, password);


			HttpSession oldSession = request.getSession(false);
			if (oldSession != null) {
				oldSession.invalidate();
			}
			HttpSession newSession = request.getSession(true);

			newSession.setMaxInactiveInterval(10*60);

			Cookie message = new Cookie("message", "Welcome");
			response.addCookie(message);

			if (user != null) {
				newSession.setAttribute("user", user);
				String role = userDao.determineUserRole(user);
				newSession.setAttribute("role", role);

				if ("admin".equals(role)) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/index.jsp");
					dispatcher.forward(request, response);
				} else if ("guest".equals(role)) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/guest.jsp");
					dispatcher.forward(request, response);
				} else {
					response.sendRedirect("login.jsp");	
				}

			} else {
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
				PrintWriter out = response.getWriter();
				out.println("<font color=red>Invalid Credentials.</font>");
				rd.include(request, response);
			}
//		} else {
//			response.sendRedirect("registration-failure.jsp");
//		}

	}
}
