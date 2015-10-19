package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class ProjectController extends Controller {

    public Result index() {
        return ok(index.render("New application woop woop!"));
    }

}
