package models;

import java.util.ArrayList;

/**
 * Created by vasua on 19/10/2015.
 */

public class User {

    public int    _id;
    public String username;
    public String firstName;
    public String lastName;
    public String email;

    public ArrayList<Project> ownedProjects;
    public ArrayList<Project> likedProjects;
    public ArrayList<Project> dislikedProjects;

    public User(String uName, String fName, String lName, String e) {
        username         = uName;
        firstName        = fName;
        lastName         = lName;
        email            = e;
        ownedProjects    = new ArrayList<>();
        likedProjects    = new ArrayList<>();
        dislikedProjects = new ArrayList<>();
    }
}
