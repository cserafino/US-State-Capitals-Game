// Name:	    Clint Serafino
// Class:	    CS 3305 W04
// Term:	    Fall 2023
// Instructor:  Carla McManus
// Assignment:  3 – Part 2 Capitals


import java.util.Random;
import java.util.Scanner;

public class Capitals {
    public static void main(String[] args) {

        //Double Array for Capitals
        String[][] Capitals = new String[][]{
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Maryland", "Annapolis"},
                {"Minnesota", "Saint Paul"},
                {"Iowa", "Des Moines"},
                {"Maine", "Augusta"},
                {"Kentucky", "Frankfort"},
                {"Indiana", "Indianapolis"},
                {"Kansas", "Topeka"},
                {"Louisiana", "Baton Rouge"},
                {"Oregon", "Salem"},
                {"Oklahoma", "Oklahoma City"},
                {"Ohio", "Columbus"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismark"},
                {"New York", "Albany"},
                {"New Mexico", "Santa Fe"},
                {"New Jersey", "Trenton"},
                {"New Hampshire", "Concord"},
                {"Nevada", "Carson City"},
                {"Nebraska", "Lincoln"},
                {"Montana", "Helena"},
                {"Missouri", "Jefferson City"},
                {"Mississippi", "Jackson"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}
        };

        //Create Random
        Random instance = new Random();

        //Create Scanner
        Scanner sc = new Scanner(System.in);

        //Correct answer counter
        int correct = 0;

        //For loop for 5 instances of questions
        for (int i = 0; i < 5; i++){
            //Random integer with max at 49
            int a = instance.nextInt(49);
            //Question
            System.out.println("What is the capital of " + Capitals[a][0]);
            //Save answer to variable
            String answer = sc.nextLine();

            //If answer is correct
            if (answer.equalsIgnoreCase(Capitals[a][1])){
                System.out.println("That is the correct answer");
                //Add to correct answer counter
                correct++;
            }
            //Incorrect answer response
            else {
                System.out.println("That is incorrect. The correct answer is " + Capitals[a][1]);
            }
        }
        //Print amount of correct answers at the end
        System.out.println("Amount of Correct Answers: " + correct);
    }
}