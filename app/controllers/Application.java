package controllers;

import play.*;
import play.mvc.*;
import play.libs.Json;

import views.html.*;
import models.Project;

import java.util.ArrayList;
import java.lang.Double;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result list() {
      return ok(list.render());
    }

    public Result signup() {
      return ok(signup.render());
    }

    public Result createProject() {
      return ok(createproject.render());
    }

    public Result getProject(){
        ArrayList<Project> proj = new ArrayList<Project>();

        Project p = new Project("buffalo sim");
        p.desc = "serengeti buffalo are deadly";
        p.lang = "Java";
        p.link = "github.com";
        p.owner = "pandr";

        Project p1 = new Project("buffalo sim 2");
        p1.desc = "serengeti buffalo are deadly";
        p1.lang = "Java";
        p1.link = "github.com";
        p1.owner = "pandr";

        proj.add(p);
        proj.add(p1);

        double dist = Project.distanceBetween(51.426172, -0.5643574, 77.620631, -44.749166);

        return ok(Double.toString(dist));
    }

}
