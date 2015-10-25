package controllers;

import play.*;
import play.mvc.*;
import play.libs.Json;

import models.Project;

public class ProjectController extends Controller {

  public Result addProject(String name, String desc, String category, String link) {

    String username = session("username");
    // Request User from database and replace it with the null down here->

    Project newProject = new Project(name, desc, category, link, null);
   
    // Save project to database etc...

    return ok();
  }

}
