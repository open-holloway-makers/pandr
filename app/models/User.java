package models;

import java.util.ArrayList;

/**
 * Created by vasua on 19/10/2015.
 */

public class User {

    public int    _id;
    public String username;
    public String firstName;
    public String surname;
    public String email;

    public ArrayList<Project> ownedProjects;
    public ArrayList<Project> rightSwipes;

    public User(String username, String firstName, String surname, String email) {
        this.username  = username;
        this.firstName = firstName;
        this.surname   = surname;
        this.email     = email;
        ownedProjects  = new ArrayList<>();
        rightSwipes    = new ArrayList<>();
    }

    public void addOwnedProject(Project project) {
        ownedProjects.add(project);
    }

    public void addRightSwipe(Project project) {
        rightSwipes.add(project);
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Project> getOwnedProjects() {
        return ownedProjects;
    }

    public ArrayList<Project> getRightSwipes() {
        return rightSwipes;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
