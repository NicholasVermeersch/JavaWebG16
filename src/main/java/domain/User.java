/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Collection;

/**
 *
 * @author rerre
 */
public class User {
    private String naam;
    private String email;
    private int ID;
    private String userName;
    private Collection<Assessement> beoordelingGroepsleden;
    private GbGroup gbGroup;
    private boolean assessementDone;
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Collection<Assessement> getBeoordelingGroepsleden() {
        return beoordelingGroepsleden;
    }

    public void setBeoordelingGroepsleden(Collection<Assessement> beoordelingGroepsleden) {
        this.beoordelingGroepsleden = beoordelingGroepsleden;
    }

    public GbGroup getGbGroup() {
        return gbGroup;
    }

    public void setGbGroup(GbGroup gbGroup) {
        this.gbGroup = gbGroup;
    }

    public boolean isAssessementDone() {
        return assessementDone;
    }

    public void setAssessementDone(boolean assessementDone) {
        this.assessementDone = assessementDone;
    }
    
    
}
