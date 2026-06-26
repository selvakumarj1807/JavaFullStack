package web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Course;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

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
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String action = request.getParameter("action");
		
		if ("edit".equals(action)) {

	        int courseid =
	                Integer.parseInt(
	                        request.getParameter("courseid"));

	        Course course =
	                dao.getCourseById(courseid);

	        request.setAttribute("course", course);

	        RequestDispatcher rd =
	                request.getRequestDispatcher("edit.jsp");

	        rd.forward(request, response);
	        return;
	    }

	    if (action != null && action.equals("delete")) {

	        int courseid = Integer.parseInt(
	                request.getParameter("courseid"));

	        dao.deleteCourse(courseid);

	        response.sendRedirect("CourseServlet");
	        return;
	    }
		
		List<Course> courses = dao.getAllCourses();

		System.out.println(courses.size());
		
		request.setAttribute("courses", courses);
		RequestDispatcher view = request.getRequestDispatcher("view.jsp");

		view.forward(request, response);
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
			
			response.sendRedirect("CourseServlet");
			
		} else {
			course.setCourseid(Integer.parseInt(courseid));
			dao.updateCourse(course);
			
			response.sendRedirect("CourseServlet");
		}
	}

}
