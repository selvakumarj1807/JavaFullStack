package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DbConnect;
import model.Course;

public class CourseDao {
	Connection connection;
	
	public CourseDao () throws ClassNotFoundException, SQLException{
		connection = DbConnect.getConnection();
	}
	
	public void addCourse(Course course) {
		try {
			PreparedStatement pst = connection.prepareStatement("insert into course(coursename, fees, category, duration)"
					+ " values (?, ?, ?, ?) ");
			
			pst.setString(1, course.getCoursename());
			pst.setInt(2, course.getFees());
			pst.setString(3, course.getCategory());
			pst.setInt(4, course.getDuration());
			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
