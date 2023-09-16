import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(in);
        out.println("Enter your mark");

        int marks = Integer.parseInt(myObj.nextLine());

        if(marks >=75){
            out.println("A");
        }
        else if(marks>=65){
            out.println("B");
        }
        else if(marks>=55){
            out.println("C");
        }
        else if(marks>=35){
            out.println("S");
        }
        else{
            out.println("F");
        }

    }
}