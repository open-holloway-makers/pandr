package controllers;

import models.Project;
import models.ProjectDAO;
import models.User;
import models.UserDAO;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.util.ArrayList;

import play.libs.Json;



public class Application extends Controller {

  public Result index() {
    return ok(index.render());
  }

  public Result list() {
    String currentUser = session("username");

    if(currentUser != null) {
      System.out.println(currentUser);

      UserDAO.userFromUsername(currentUser);

      return ok(list.render(currentUser));
    } else {
      return unauthorized("Oops, you are not connected");
    }
}

  public Result signup() {
    return ok(signup.render());
  }

  public Result signin(){
    return ok(signin.render());
  }

  public Result createProject() {
    return ok(createproject.render());
  }

  public Result findProject(){
    return ok(find_project.render());
  }

  public Result fetchProject(){
    return ok(ProjectDAO.retreiveRandomProject());
  }

}
