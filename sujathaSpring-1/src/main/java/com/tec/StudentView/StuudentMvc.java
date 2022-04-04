package com.tec.StudentView;

import com.tec.entity.Student;
import com.tec.studentController.StudentController;

public class StuudentMvc 
{
	public static Student setData()
	{
		Student student1=new Student();
		student1.setId(1);
		student1.setName("bharathi");
		student1.setRollNo(203);
		return student1;
	}
		public static void main(String[] args)
		{
			Student model=setData();
			StudentView view1=new StudentView();
			StudentController Controller=new StudentController(model,view1);
			Controller.update();
			Controller.setId(4);
			Controller.update();
					
		}
	}

