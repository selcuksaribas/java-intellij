package day25lambda;

        /*
            If a class has followings it is called "POJO Class"(Plain OLd Java Object)
            1)Private Variables
            2)Constructor with all parameters
            3)Constructor without parameter
            4)Getters
            5)Setters
            6)toString() method
         */

public class Course {

    private String courseName;
    private int numOfStd;
    private String season;
    private double avgScore;

    public Course(String courseName, int numOfStd, String season, double avgScore) {
        this.courseName = courseName;
        this.numOfStd = numOfStd;
        this.season = season;
        this.avgScore = avgScore;
    }

    public Course() {

    }

    public String getCourseName() {
        return courseName;
    }
    public int getNumOfStd() {
        return numOfStd;
    }
    public String getSeason() {
        return season;
    }
    public double getAvgScore() {
        return avgScore;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setNumOfStd(int numOfStd) {
        this.numOfStd = numOfStd;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "{" +
                "courseName='" + courseName + '\'' +
                ", numOfStd=" + numOfStd +
                ", season='" + season + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }
}