package models;

import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model.Finder;

public class Student {

	@Id
	public Long id;
	
	public String firstName;
	
	public String lastName;
	
	public String eMail;
	
	public String Address;
	
	public String studies;
	
	public Language language;
	
	public static Finder<Long,Student> find = new Finder<Long,Student>(
			    Long.class, Student.class
			  ); 
	
	public boolean isTutor(){
		return false;
	}
}
