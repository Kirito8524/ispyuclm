package ispychallenge;

import java.util.*;
import java.lang.Character;


public class ISpyChallenge {
     
    static Scanner xerth = new Scanner(System.in);
    public static void main(String[] args) {
        //initialization
        String word,fWord="";   
        System.out.println("Key in word: ");
        word = xerth.nextLine();
        String[] splitW1 = word.split("");
        if(word.contains(" ") && word.contains(",")){
        ArrayList<String> splitW = splitter(splitW1);
        String cWord = concat(word);
        
        for(int c = splitW.size(); c>0; c--){
            fWord += splitW.get(c-1);
        }
        if(cWord.equals(fWord)){
            
            System.out.println("Palendrome!!");
        }
        else System.out.println("Not a Palendrome!");
        }
        else{
            for(int c = splitW1.length; c>0; c--){
                fWord += splitW1[c-1];
            }
            if(word.equals(fWord)){

                System.out.println("Palendrome!!");
            }
            else System.out.println("Not a Palendrome!");
        }
        
       }
   
    
    public static ArrayList<String> splitter(String[] splitW1){
        ArrayList<String> returnWord = new ArrayList<>();
        
        for(int c=0; c<splitW1.length; c++){
            if(!splitW1[c].equals(",")){
                if(!splitW1[c].equals(" "))
                returnWord.add(splitW1[c]);
            }
        }
        
        return returnWord;
    }
    public static String concat(String word){
    String fWord = "";
        for(int c=0; c<word.length(); c++){
            if(word.charAt(c) != ' '){
                if(word.charAt(c) != ',')
                fWord += word.charAt(c);
            }
        }
        return fWord;
    }
}
