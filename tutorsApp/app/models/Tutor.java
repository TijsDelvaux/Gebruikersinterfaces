package models;

import java.util.*;

import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model.Finder;

public class Tutor{
	
	@Id
	public Long id;
	
	public String firstName;
	
	public String lastName;
	
	public String eMail;
	
	public String Address;
	
	public String studies;
	
	public Language language = Language.English;
	
	public Tutor tutor = null;
	
	public List<Course> myTeachingCourses = new ArrayList<Course>();
	
	public Tutor(){
		
	}
	
	//TEST
	public Tutor(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		addTeachingCourse("Modelering van Complexe Systemen");
		
	}
	
	public static Finder<Long,Student> find = new Finder<Long,Student>(
			Long.class, Student.class);

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
	
	public void addTeachingCourse(String courseName){
		this.myTeachingCourses.add(new Course(courseName));
	}
	
}
