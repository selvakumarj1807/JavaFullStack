package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Course;

import java.io.IOException;
import java.sql.SQLException;

import Dao.CourseDao;


@WebServlet("/CourseServlet")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private CourseDao dao;
	
    public CourseServlet() throws ClassNotFoundException, SQLException {
        super();
        // TODO Auto-generated constructor stub
        
        dao = new CourseDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		Course course = new Course();
		
		course.setCoursename(request.getParameter("coursename"));
		course.setFees(Integer.parseInt(request.getParameter("fees")));
		course.setCategory(request.getParameter("category"));
		course.setDuration(Integer.parseInt(request.getParameter("duration")));
		
		String courseid = request.getParameter("courseid");
		
		if(courseid == null || courseid.isEmpty()) {
			dao.addCourse(course);
			
			response.sendRedirect("view.jsp");
			
		} else {
			course.setCourseid(Integer.parseInt(courseid));
		}
	}

}
