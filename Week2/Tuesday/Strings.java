import java.io.Console;
import java.util.concurrent.Flow.Subscriber;

public class Strings {


    public static void main(String[] args){
        String name = "James";

        //Concatenate
        name.concat(" Bond");
        System.out.println(name);

        //Concatenate with +
        // name += " Bond";
        // System.out.println(name); 
        
        //Concatenative integers
        name += 7;
        System.out.println(name);         

        // System.out.println(name.charAt(2));
        // // name.charAt(2) = 'x';
    
    }
    
}