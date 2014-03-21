package controllers;

import play.*;
import play.data.*;
import play.mvc.*;
import models.*;

import views.html.*;

public class Application extends Controller {
	
	private static Student student = new Student(); //DIT MOET ZEKER NOG VERANDEREN, WANNEER WE EEN LOGIN HEBBEN!

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
    	return TODO;
    }
    
    public static Result reviews(){
    	return TODO;
    }
    
    public static Result calendar(){
    	return TODO;
    }

}
