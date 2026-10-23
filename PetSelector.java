//Pascal Somborn 10/15/26
// This code is meant to choose a pet for a person based on their favorite color, season, and depending if the first letter of the given name starts with a vowel or a consonant
//Import scanner class
import java.util.Scanner;

public class PetSelector {
    public static void main(String[] args) {
    
    //take input
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me your favorite color"); 
        String color= scanner.nextLine().toLowerCase();
        //idiot proof color
        if (!color.equals("blue") && !color.equals("green") && !color.equals("red")){

        
            System.out.println("Please add a valid color");
            return;
        }
        System.out.println("What's your favorite season");
        String season=scanner.nextLine().toLowerCase();
        //idiot proof season
        if (!season.equals("spring") && !season.equals("summer") && !season.equals("fall") && !season.equals("winter")){
            System.out.println("Please add a valid seeason");
            return;
            
        }

        System.out.println("Please give me your name");
        String name=scanner.nextLine().toLowerCase();

        //Idiot proof name
         if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 0 + 1).toLowerCase()) < 0) {
            System.out.println("Enter a valid name");
            return;
         }
        
        //Creates consonant and vowel
        boolean consonant = "aeiou".indexOf(name.substring(0,1 ))==-1;
        boolean vowel = "aeiou".indexOf(name.substring(0, 1))>=0;
    //code to determine what animal they get
    //If statement for alligator
        if(color.equals("blue") && season.equals("fall")){
            System.out.println("Alligator");
            
    }   //If statement for ostrich
        else if(color.equals("blue") && season.equals("spring")) {
            System.out.println("Ostrich");
        }
        //If statement for girrafe
        else if(color.equals("green") && consonant && season.equals("winter")){
            System.out.println("Girrafe");
        }
        //If statement for dog if you dont have a girrafe
        else if(color.equals("green") && !season.equals("fall")){
            System.out.println("dog");
        }//If statement for porcupine if name  starts with vowel
        else if(color.equals("red")&& vowel){
            System.out.println("porcupine");
        }//If statement for panda if name starts without vowel
        else if(color.equals("red") && !vowel){
            System.out.println("panda");
        } //If statement for a pony 
        else if (season.equals("summer")){
            System.out.println("pony");
        } // If statement for an axolotl
        else if(consonant && color.equals("blue")&& !season.equals("fall") && !season.equals("summer")){
            System.out.println("axolotl");
        } //else statement for a glorious rock
        else {
            System.out.println("rock");
        }
           
        
    
        } 

    }

