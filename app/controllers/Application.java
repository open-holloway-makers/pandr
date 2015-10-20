package controllers;

import models.Project;
import models.User;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.util.ArrayList;

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

        Project p = new Project("buffalo sim", "serengeti buffalo are deadly", "Java", "github.com", new User("test", "test1", "test2", "test3"));

        Project p1 = new Project("buffalo sim 2", "serengeti buffalo are deadly", "Java", "github.com", new User("test", "test1", "test2", "test3"));

        proj.add(p);
        proj.add(p1);

        double dist = Project.distanceBetween(51.426172, -0.5643574, 77.620631, -44.749166);

        return ok(Double.toString(dist));
    }

}
