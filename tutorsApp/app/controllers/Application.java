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

}
