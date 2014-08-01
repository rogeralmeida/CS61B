package www.cs.berkeley.edu.jrs.cs61b.hw.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ralmeid on 8/1/14.
 */
public class Nuke2 {
   public static void main(String[] args) throws IOException {
       BufferedReader keyboard;
       String inputLine;

       keyboard = new BufferedReader(new InputStreamReader(System.in));

       System.out.print("Please enter word (at least 3 characters long): ");
       System.out.flush();        /* Make sure the line is printed immediately. */
       inputLine = keyboard.readLine();
       System.out.println(inputLine.substring(0, 1)+inputLine.substring(2));
   }
}
