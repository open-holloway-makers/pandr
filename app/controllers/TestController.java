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

    User testUser = new User("xpaulnim", "Paul", "Nimusiima", "testuser@email.com");
    UserDAO.insertUser(testUser);

    Project testProject = new Project("Building a dog house",
                    "Just adopted a dog, buidling it a house", 
                    "Manual", "n/a", testUser);
    testProject.latitude = 51.423282;
    testProject.longitude = 51.453137;

    Project testProjectA = new Project("Coke and Mentos Rocket",
                    "Optimising a coke and mentos rocket", 
                    "Science", "n/a", testUser);
     testProjectA.latitude = 51.453137;
     testProjectA.longitude = -0.584004;

    Project testProjectB = new Project("Baboon agression tracker",
                    "How often are baboons agressive towards each other", 
                    "Research", "n/a", testUser);
    testProjectB.latitude = 51.430079;
    testProjectB.longitude = -0.538599;

    // random places
    // 39.27282, -150.51872
    // 31.00995, 114.88550
    // 12.61192, 123.96286
    // -1.75590, -82.78699
    // -80.98347, 68.46493
    // -14.28736, -10.61210

    // places near egham
    // 51.423282, -0.580313
    // 51.453137, -0.584004
    // 51.430079, -0.538599
    // 51.437944, -0.448734
    // 51.450783, -0.469849
    // 51.458432, -0.395348

    ProjectDAO.addNewProject(testProject);
    ProjectDAO.addNewProject(testProjectA);
    ProjectDAO.addNewProject(testProjectB);

    return ok("Test has beenn run"); // or whatever
  }
}
