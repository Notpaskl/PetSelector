//Import scanner class
import java.util.Scanner;

public class PetSelector {
    public static void main(String[] args) {
    //Variables created
    //Colors variables

    String color1= ("Blue");
    String color2= ("Green");
    String color3= ("Red");
    //Season variables
    String season1= ("Spring");
    String season2= ("Summer");
    String season3= ("Fall");
    String season4= ("Winter");

    //Consonants and vowels 
    String vowel= ("aeiouAEIOU");
    String consonants= ("bcdfghjklmnpqrstvwxyzBCFGHJKLMNPQRSTVWXYZ");
    //take input
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me your favorite color"); 
        String color= scanner.nextLine().toLowerCase();
        System.out.println("What's your favorite season");
        String season=scanner.nextLine().toLowerCase();
        System.out.println("Please give me your name");
        String name=scanner.nextLine().toLowerCase();
    //code to determine what animal they get
    //If statement for alligator
        if(color.equals("blue") && season.equals("fall")){
            System.out.println("Alligator");
            
    }   //If statement for ostrich
        else if(color.equals("blue") && season.equals("spring")) {
            System.out.println("Ostrich");
        }
        //If statement for girrafe
        else if(color.equals("green") && name.substring(0,1).contains(consonants) && season.equals("winter")){
            System.out.println("Girrafe");
        }
    } 
}
