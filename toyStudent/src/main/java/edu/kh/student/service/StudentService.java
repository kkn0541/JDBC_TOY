package edu.kh.student.service;

import java.util.List;

import edu.kh.student.dto.Student;

public interface StudentService {

	List<Student> StudentFullView() throws Exception;

	int studentAdd(String stdName, int stdAge, String stdGender, String stdScore)throws Exception;

	Student studentDetailView(int stdNo) throws Exception;

	int stdudentDelete(int stdNo) throws Exception;


	int studentUpdate(String stdName, int stdAge, String stdScore, int stdNo) throws Exception;



	

}
