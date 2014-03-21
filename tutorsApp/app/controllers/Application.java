package controllers;

import play.*;
import play.data.*;
import play.mvc.*;
import models.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return redirect(routes.Application.start());
    }
    
    public static Result start(){
    	return ok(views.html.start.render(new Student()));
    }
    
    public static Result profile(){
    	return TODO;
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
