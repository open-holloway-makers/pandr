package controllers;

import play.*;
import play.mvc.*;
import play.libs.Json;

import models.Project;

public class ProjectController extends Controller {

  public Result addProject(String name, String desc, String lang, String link) {

    String username = session("username");
    Project newProject = new Project(name);
    newProject.desc = desc;
    newProject.lang = lang;
    newProject.link = link;
    newProject.owner = username;
   
    // Save project to database etc...

    return ok();
  }

}
