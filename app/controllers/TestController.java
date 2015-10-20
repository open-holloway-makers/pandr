package controllers;

import models.Project;
import models.ProjectDAO;
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
    //userDAO.insertUser(testUser);



    Project testProject = new Project("testProject","This is a test project", "Java", "TestProject.org", testUser);
    ProjectDAO.addNewProject(testProject);

//    userDAO.addNewOwnedProject(testUser, testProject);
    return ok("Test has beenn run"); // or whatever
  }
}
