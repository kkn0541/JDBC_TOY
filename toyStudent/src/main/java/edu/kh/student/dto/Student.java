package edu.kh.student.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

	private int stdNo;
	private String stdName;
	private int stdAge;
	private String stdGender;
	private String stdScore;
	
	
}
