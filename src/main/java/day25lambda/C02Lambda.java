package day25lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C02Lambda {

    public static void main(String[] args) {

        Course c1 = new Course("Java", 124, "Summer", 97.2);
        Course c2 = new Course("SQL", 125, "Winter", 98.4);
        Course c3 = new Course("API", 138, "Spring", 93.8);
        Course c4 = new Course("Selenium", 111, "Winter", 95.1);

        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        System.out.println(courses);

        System.out.println(checkAvgScoresToBeGreaterThanGivenNumber(courses, 91));
        System.out.println(checkCourseNameContainsGivenString(courses, "J"));
        System.out.println(checkWinterSeasonWithGivenAvg(courses, "Winter", 96));
        printCourseNumOfStdHighest(courses);

        printCourseNumOfStdThirdHighest(courses);

    }
    //Example 1:Create a method to check if all average scores are greater than 91
    public static boolean checkAvgScoresToBeGreaterThanGivenNumber(List<Course> list, int n){
        return list.stream().allMatch(t->t.getAvgScore()>n);
    }
    //Example 2:Create a method to check if at least one of the course name has "J" in it.
    public static boolean checkCourseNameContainsGivenString(List<Course> list, String s){
        return list.stream().anyMatch(t->t.getCourseName().contains(s));
    }
    //Example 3:Create a method to check if there is a season which is Winter and the average score is less than 96
    public static boolean checkWinterSeasonWithGivenAvg(List<Course> list, String season, double avg){
        return list.stream().anyMatch(t->t.getSeason().equalsIgnoreCase(season) && t.getAvgScore()<avg);
    }
    //Example 4:Create a method to print the course whose number of students is the highest
    public static void printCourseNumOfStdHighest(List<Course> list){
        System.out.println(list.stream().sorted(Comparator.comparing(Course::getNumOfStd).reversed()).findFirst().get());
    }
    //Example 5:Create a method to print the course whose number of students is the third highest
    public static void printCourseNumOfStdThirdHighest(List<Course> list){
        System.out.println(list.stream().sorted(Comparator.comparing(Course::getNumOfStd).reversed()).skip(2).limit(1).collect(Collectors.toList()));
    }
}