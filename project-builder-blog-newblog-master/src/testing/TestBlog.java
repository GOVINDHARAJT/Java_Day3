package testing;

//Uncomment the below code to test your application

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import model.Blog;

public class TestBlog {
	LocalDate ld = LocalDate.of(2005, 4, 9);
	Blog blog = new Blog("Java","ProgrammingLanguage",ld);
	
	 @Test
	 public void testSetterGetter() {
		 blog.setdescription("ProgrammingLanguage");
		 blog.settitle("Java");
		 blog.setpostedOn(ld);
		 assertEquals("ProgrammingLanguage",blog.getdescription());
		 assertEquals("Java",blog.gettitle());
		 assertEquals(ld,blog.getpostedOn());
		 try {
			 blog.setdescription(null);
			 blog.settitle(null);
			 blog.settitle(null);
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
}

