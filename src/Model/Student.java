/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.File;

/**
 *
 * @author Dell
 */
public class Student extends User{
    
    public Student(String email, String password, String name) {
        super(email, password, name);
    }
    
    private String ra;
    private ExtensionActivity activities;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public ExtensionActivity getActivities() {
        return activities;
    }

    public void setActivities(ExtensionActivity activities) {
        this.activities = activities;
    }
    
    public void addExtensionActivity(String title, String description, float hour, File document){
         ExtensionActivity newActivity = new ExtensionActivity(title, description, hour, document);
          this.activities = newActivity;
    }
    
    
}
