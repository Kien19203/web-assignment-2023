package controller;

import vn.ed.hcmuaf.bean.User;
import vn.ed.hcmuaf.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name="LoginController", value = "/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email") ;
        String pass = request.getParameter("pass") ;
        User user = UserService.getInstance().checkLogin(email,pass);
        if(user!=null) {
         HttpSession session = request.getSession();
         session.setAttribute("auth", user);
            response.sendRedirect("index.jsp");

        }

        else {
            request.setAttribute("error", "Bạn nhập sai email hoặc password  ");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }

    }
}
