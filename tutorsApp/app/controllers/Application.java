package controllers;

import play.*;
import play.data.*;
import play.mvc.*;
import models.*;

import views.html.*;

public class Application extends Controller {
	
	private static Student student = new Student(); //DIT MOET ZEKER NOG VERANDEREN, WANNEER WE EEN LOGIN HEBBEN!
	private static Tutor tutor = new Tutor("Hans", "De Vos");
	
    public static Result index() {
        return redirect(routes.Application.start());
    }
    
    public static Result start(){
    	return ok(views.html.start.render(student));
    }
    
    public static Result profile(){
    	return ok(views.html.profileGeneral.render(student));
    }
    
    public static Result profileTutor(){
    	if(student.isTutor())
    		return ok(views.html.profileTutorActive.render(student));
    	else
    		return ok(views.html.profileTutorNotActive.render(student));
    }
    
    public static Result searchTutor(){
    	return ok(views.html.myCourses.render(student));
    }
    
    public static Result availableTutors(String course){
    	return ok(views.html.availableTutors.render(student, course));
    }
    
    public static Result reviewsGiven(){
    	return ok(views.html.reviewsGiven.render(student));
    }
    
    public static Result reviewsReceived(){
    	return ok(views.html.reviewsGet.render(student));
    }
    
    public static Result calendar(){
    	return TODO;
    }
    
    public static Result mySubjects(){
    	return TODO;
    }

}
