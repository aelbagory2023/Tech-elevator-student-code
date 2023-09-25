package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;

public HomeworkAssignment(int possibleMarks, String submitterName) {
    this.possibleMarks = possibleMarks;
    this.submitterName = submitterName;
}
public int getEarnedMarks() {
    return earnedMarks;
}
public void setEarnedMarks(int earnedMarks) {
    this.earnedMarks = earnedMarks;
    double calculatedGrade = (double) earnedMarks / possibleMarks;
    double calculatedFinalGrade = calculatedGrade * 100;
  System.out.println(calculatedGrade);
    System.out.println(earnedMarks/possibleMarks);
    System.out.println(calculatedFinalGrade);
    if(calculatedFinalGrade >= 90){
        letterGrade = "A";

    } else if(calculatedFinalGrade >= 80 && calculatedFinalGrade <= 89) {
        letterGrade = "B";
    } else if(calculatedFinalGrade >= 70 && calculatedFinalGrade <= 79) {
        letterGrade = "C";

    } else if(calculatedFinalGrade >= 60 && calculatedFinalGrade <=69) {
        letterGrade = "D";

    } else {
        letterGrade  = "F";
    }

}
public int getPossibleMarks() {
    return possibleMarks;
}
public String getSubmitterName() {
    return submitterName;
}
public String getLetterGrade() {
    return letterGrade;
}

}
