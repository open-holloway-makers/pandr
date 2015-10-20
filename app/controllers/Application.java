package controllers;

import play.*;
import play.mvc.*;
import play.libs.Json;

import views.html.*;
import models.Project;

import java.util.ArrayList;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result getProject(){
        ArrayList<Project> proj = new ArrayList<Project>();

        Project p = new Project("buffalo sim");
        p.desc = "serengeti buffalo are deadly";
        p.lang = "Java";
        p.link = "github.com";

        Project p1 = new Project("buffalo sim 2");
        p1.desc = "serengeti buffalo are deadly";
        p1.lang = "Java";
        p1.link = "github.com";

        proj.add(p);
        proj.add(p1);

        return ok(Json.toJson(proj));
    }

}
