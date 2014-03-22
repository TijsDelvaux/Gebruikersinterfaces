package models;

import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model.Finder;

import java.util.*;

public class Student {

	@Id
	public Long id;
	
	public String firstName;
	
	public String lastName;
	
	public String eMail;
	
	public String Address;
	
	public String studies;
	
	public Language language = Language.English;
	
	public Tutor tutor = null;
	
	public List<Course> myCourses = new ArrayList<Course>();
	
	public Student(){
		//TEST
		addCourse("Modelering van Complexe Systemen");
		addCourse("Gedistribueerde Systemen");
		addCourse("Computer Grafieken");
	}
	
	public static Finder<Long,Student> find = new Finder<Long,Student>(
			    Long.class, Student.class
			  ); 
	
	public Language getLanguage(){
		return language;
	}
	
	public void setLanguage(Language language){
		this.language = language;
	}
	
	public boolean isTutor(){
		return false;
	}
	
	//Is dit wel een goed idee?
	public void becomeTutor(){
		tutor = new Tutor();
	}
	
	//Add a course, only a string necessary
	//Used for testing
	public void addCourse(String courseName){
		this.myCourses.add(new Course(courseName));
	}
	
	public List<Course> getCourses() {
		return this.myCourses;
	}
}
