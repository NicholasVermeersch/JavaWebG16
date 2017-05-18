/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author rerre
 */
public class Assessement {
    private int scoreVraag1;
    private int scoreVraag2;
    private int scoreVraag3;
    private int scoreVraag4;
    private int scoreVraag5;
    private User groupID;

    public int getScoreVraag1() {
        return scoreVraag1;
    }

    public void setScoreVraag1(int scoreVraag1) {
        this.scoreVraag1 = scoreVraag1;
    }

    public int getScoreVraag2() {
        return scoreVraag2;
    }

    public void setScoreVraag2(int scoreVraag2) {
        this.scoreVraag2 = scoreVraag2;
    }

    public int getScoreVraag3() {
        return scoreVraag3;
    }

    public void setScoreVraag3(int scoreVraag3) {
        this.scoreVraag3 = scoreVraag3;
    }

    public int getScoreVraag4() {
        return scoreVraag4;
    }

    public void setScoreVraag4(int scoreVraag4) {
        this.scoreVraag4 = scoreVraag4;
    }

    public int getScoreVraag5() {
        return scoreVraag5;
    }

    public void setScoreVraag5(int scoreVraag5) {
        this.scoreVraag5 = scoreVraag5;
    }

    public User getGroupID() {
        return groupID;
    }

    public void setGroupID(User groupID) {
        this.groupID = groupID;
    }
    
    
}
