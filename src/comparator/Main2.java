package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparable.Student;

public class Main2 {

	public static void main(String[] args) {
		List<Student> lis = new ArrayList<>();
		lis.add(new Student(15,"Udhaya",98,2018));
		lis.add(new Student(18,"Soorya",100,2012));
		lis.add(new Student(13,"Aravind",92,2017));
		lis.add(new Student(8,"Rahul",83,2004));
		lis.add(new Student(17,"Msd",89,2007));
		
		System.out.println("before sorting");
		for (Student student : lis) {
			
			System.out.println(student.getsId()+ " "+student.getsName()+" "+student.getRollNo()+" "+student.getYear());
		}
		
		//comparator will work if comparable is present and either not.
		Comparator<Student> stu = new Comparator<Student>() {
			
			public int compare(Student s1,Student s2)
			{
				/*
				 * if(s1.getRollNo()<s2.getRollNo()) { return 1;
				 * 
				 * }else { return -1; }
				 */
				return s1.getsName().compareTo(s2.getsName());
			}
		};
		Collections.sort(lis,stu);
		System.out.println("After sorting");
		for (Student student : lis) {
			
			System.out.println(student.getsId()+ " "+student.getsName()+" "+student.getRollNo()+" "+student.getYear());
		}
		

	}

	

}
