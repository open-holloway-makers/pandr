package controllers;

import play.*;
import play.mvc.*;
import play.libs.Json;

import models.User;

public class UserController extends Controller {

  public Result addUser(String username, String firstName, 
      String surname, String email) {

    User newUser = new User(username, firstName, surname, email);
   
    // Save user to database etc...

    return ok();
  }
}
