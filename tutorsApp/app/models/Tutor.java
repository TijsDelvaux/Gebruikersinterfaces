package models;

import java.util.*;

import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model.Finder;

public class Tutor{
	
	@Id
	public Long id;
	
	public Student student;
	
	public List<Language> teachingLanguages =new ArrayList<Language>();
	
	public List<Course> myTeachingCourses = new ArrayList<Course>();
	
	private int price;
	
	private String description;
	
	public Tutor(Student student){
		this.student = student;
		teachingLanguages.add(student.language);
	}
	
	//TEST
	public Tutor(String firstName, String lastName){
//		this.firstName = firstName;
//		this.lastName = lastName;
		addTeachingCourse("Modelering van Complexe Systemen");
		
	}
	
	public static Finder<Long,Tutor> find = new Finder<Long,Tutor>(
			Long.class, Tutor.class);

	public List<Language> getTeachingLanguage() {
		return teachingLanguages;
	}

	public void addLanguage(Language language) {
		teachingLanguages.add(language);
	}
	
	public boolean deleteLanguage(Language language){
		if(teachingLanguages.size()==1)
			return false;
		teachingLanguages.remove(language);
		return true;
	}
	
	public void addTeachingCourse(String courseName){
		this.myTeachingCourses.add(new Course(courseName));
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getDescription(){
		return description;
	}
	
}
