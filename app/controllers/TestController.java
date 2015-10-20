package controllers;

import play.*;
import play.mvc.*;
import play.libs.Json;

public class TestController extends Controller {

  public Result test() {
    // Test logic here!
    System.out.println("Testing...");
    return ok("Test has been run"); // or whatever
  }
}
