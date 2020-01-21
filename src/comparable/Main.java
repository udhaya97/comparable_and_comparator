package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

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
		Collections.sort(lis);
		System.out.println("After sorting");
		for (Student student : lis) {
			
			System.out.println(student.getsId()+ " "+student.getsName()+" "+student.getRollNo()+" "+student.getYear());
		}
		

	}

}
