package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListDesendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<Student> l = new ArrayList<Student>();
 l.add(new Student("manju", 35,"rjmc"));
 l.add(new Student("praneeth",4,"Biits"));
 l.add(new Student("theekshana",12,"niet"));
 l.add(new Student("gowthami",27,"svit"));
 System.out.println("-------------------sort by age----------------------");
 Collections.sort(l,new AgeComparator());
 for(Student st: l){  
	 System.out.println(st.name+" "+st.collegeName+" "+st.age); 
 }
	 System.out.println("==============Sort by name===============");
	 Collections.sort(l,new NameComparator());
	 for(Student st1: l){  
		 System.out.println(st1.name+" "+st1.collegeName+" "+st1.age); 
	 }  
	 System.out.println("---------------sort by CollegeName-----------------");
	 Collections.sort(l,new collegeNameComparator());
	 for(Student st2: l){  
		 System.out.println(st2.name+" "+st2.collegeName+" "+st2.age); 
	}
	 
	}
}


class Student {
	public String name;
public	 int age;
	 String collegeName;

	Student(String name, int age, String collegeName) {
		this.name = name;  
		this.age =age;
		this.collegeName = collegeName;

	}

	
}

class AgeComparator implements Comparator<Student> {
	public int compare(Student s1,Student s2){  
		if(s1.age==s2.age)  
		return 0;  
		else if(s1.age<s2.age)  
		return 1;  
		else  
		return -1;  
		}  
}

class NameComparator implements Comparator<Student> {
	public int compare(Student s1,Student s2){  
		return s1.name.compareTo(s2.name);  
	}
}
class collegeNameComparator implements Comparator<Student> {
	public int compare(Student s1,Student s2){  
		return s2.collegeName.compareTo(s1.collegeName);  
	}
}
