package controllers;

import models.User;
import models.UserDAO;
import play.*;
import play.mvc.*;
import play.libs.Json;

public class TestController extends Controller {

  public Result test() {
    // Test logic here!
    System.out.println("Testing...");
    UserDAO userDAO = new UserDAO();
    User testUser = new User("testUser", "test", "user", "testuser@email.com");
    userDAO.insertUser(testUser);
    return ok("Test has been run"); // or whatever
  }
}
