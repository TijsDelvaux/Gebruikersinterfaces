package models;

import java.util.*;

import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model.Finder;

public class Course{
	
	@Id
	Long id;
	
	public String name;
	
	public List<Tutor> tutors = new ArrayList<Tutor>();
	
	public Course(String name){
		this.name = name;
	}
	
	public String getCourseName(){
		return this.name;
	}
	
	public void addTutor(Tutor tutor){
		tutors.add(tutor);
	}
	
	public void removeTutor(Tutor tutor){
		tutors.remove(tutor);
	}

}
