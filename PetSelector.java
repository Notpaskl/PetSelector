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
    //String vowel= ("aeiouAEIOU");
    //String consonants= ("bcdfghjklmnpqrstvwxyzBCFGHJKLMNPQRSTVWXYZ");
    //take input
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me your favorite color"); 
        String color= scanner.nextLine().toLowerCase();
        System.out.println("What's your favorite season");
        String season=scanner.nextLine().toLowerCase();
        System.out.println("Please give me your name");
        String name=scanner.nextLine().toLowerCase();
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
        else if(color.equals("green") && consonant==true && season.equals("winter")){
            System.out.println("Girrafe");
        }
        //If statement for dog if you dont have a girrafe
        else if(color.equals("green") && season!=("fall")){
            System.out.println("dog");
        }//If statement for porcupine if name  starts with vowel
        else if(color.equals("red")&& vowel==true){
            System.out.println("porcupine");
        }//If statement for panda if name starts without vowel
        else if(color.equals("red") && vowel==false){
            System.out.println("panda");
        }
        else if (season.equals("summer")){
            System.out.println("ponie");
        }
        else if(consonant==true && color.equals("blue")&& season!=("fall") && season!=("summer")){
            System.out.println("axolotl");
        }
        else {
            System.out.println("rock");
        }
           
        
    
        } 

    }

