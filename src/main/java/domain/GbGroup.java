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
public class GbGroup {
    public int id;
    public String naam;
    public Collection<User> groupmembers;
    public User teacher;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Collection<User> getGroupmembers() {
        return groupmembers;
    }

    public void setGroupmembers(Collection<User> groupmembers) {
        this.groupmembers = groupmembers;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }
    
}
