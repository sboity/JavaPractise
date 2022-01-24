package ConstructorConcept;

import java.util.ArrayList;

public class TestUniversity {

	public static void main(String[] args) {
		
		
		ArrayList<String> delhiUnivCourseList = new ArrayList<String>();
		delhiUnivCourseList.add("physics");
		delhiUnivCourseList.add("Chemistry");
		delhiUnivCourseList.add("Bio");
		
		University univ = new University("Delhi University", "New Delhi", delhiUnivCourseList);
		System.out.println(univ.getName()+" "+univ.getHq());
		System.out.println(univ.getCourseList());

	}

}
