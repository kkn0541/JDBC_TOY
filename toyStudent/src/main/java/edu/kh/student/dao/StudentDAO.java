package edu.kh.student.dao;

import java.sql.Connection;
import java.util.List;

import edu.kh.student.dto.Student;

public interface StudentDAO {

	List<Student> StudentFullView(Connection conn) throws Exception;

	int studentAdd(Connection conn, String stdName, int stdAge, String stdGender, String stdScore)throws Exception;

	Student studentDetailView(Connection conn, int stdNo) throws Exception;

	int stdudentDelete(Connection conn, int stdNo) throws Exception;


	int studentUpdate(Connection conn, String stdName, int stdAge, String stdScore, int stdNo) throws Exception;

}
