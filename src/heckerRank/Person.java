package heckerRank;

public class Person {

}

class Student extends Person{
    private String firstName;
    private String lastName;
    private int idNumber;
    private int[] scores;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public Student() {
    }

    public Student(String firstName, String lastName, int idNumber, int[] scores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.scores = scores;
    }

    public char calculate(){

        //calc average
        int sum  = 0;
        for(int i : this.scores) {
            sum += i;
        }
        int average = sum/scores.length;

        char result = (average < 40)?'T' : ((average<55)? 'D':((average < 70)? 'P':
                ((average < 80)? 'A':((average<90)?'E' : ((average<=100)?'O':0)))));

        return result;
    }
}