package controllers;

import play.*;
import play.mvc.*;
import play.libs.Json;

public class LoginController extends Controller {

  public Result login(String username) {

    // Currently just logs in regardless...
    
    System.out.println("Logging in...");

    session("username", username.toString());
    return ok(Json.toJson(true));
  }
}
