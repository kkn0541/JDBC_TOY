package edu.kh.student.service;

import java.sql.Connection;
import java.util.List;

import org.eclipse.jdt.internal.compiler.ast.ThrowStatement;

import static edu.kh.student.common.JDBCTemplete.*;
import edu.kh.student.dao.StudentDAO;
import edu.kh.student.dao.StudentDaoImpl;
import edu.kh.student.dto.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDAO dao = new StudentDaoImpl();

	@Override
	public List<Student> StudentFullView() throws Exception {

		Connection conn = getConnection();

		List<Student> studentList = dao.StudentFullView(conn);

		close(conn);

		return studentList;
	}

	@Override
	public int studentAdd(String stdName, int stdAge, String stdGender, String stdScore) throws Exception {

		Connection conn = getConnection();

		int result = dao.studentAdd(conn, stdName, stdAge, stdGender, stdScore);

		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}

		close(conn);

		return result;
	}

	@Override
	public Student studentDetailView(int stdNo) throws Exception {
		Connection conn = getConnection();

		Student student = dao.studentDetailView(conn, stdNo);

		close(conn);

		return student;
	}

	@Override
	public int stdudentDelete(int stdNo) throws Exception {

		Connection conn = getConnection();

		int result = dao.stdudentDelete(conn, stdNo);

		System.out.println(stdNo);

		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}

		return result;
	}

	@Override
	public int studentUpdate(String stdName, int stdAge, String stdScore, int stdNo) throws Exception {
		Connection conn = getConnection();

		
		int result = dao.studentUpdate(conn,stdName, stdAge , stdScore,stdNo);
		
		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		
		
		return result;
	}

	
}
