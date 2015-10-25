package controllers;

import play.*;
import play.mvc.*;
import play.libs.Json;

import models.User;
import models.UserDAO;

public class UserController extends Controller {

  public Result addUser(String username, String firstName, 
    String lastName, String email) {

    User newUser = new User(username, firstName, lastName, email);
   
    // Save user to database etc...
    UserDAO.insertUser(newUser);

    return ok();
  }
}
