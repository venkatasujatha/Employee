package com.tec.studentController;

import com.tec.StudentView.StudentView;
import com.tec.entity.Student;

public class StudentController 
{
	private Student move;
	private StudentView details;
	public StudentController(Student move, StudentView details) {
		super();
		this.move = move;
		this.details = details;
	}
	public void setStudentName(String Name)
	{
		 move.setName(Name);
	}
	public void setId(int id)
	{
		 move.setId(id);
	}
	public void setRollNo(int RollNo)
	{
		 move.setRollNo(RollNo);
	}
	public String getName()
	{
		return  move.getName();
	}
	public int getId()
	{
		return move.getId();
	}
	public int getRollNo()
	{
		return move.getRollNo();
	}
	
	public void update()
	{
		details.details(getId(),getName(),getRollNo());
	}
	
	
}
