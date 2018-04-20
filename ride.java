/*
ID: katedri2
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));                                                
    PrintWriter out = new PrintWriter(new File("ride.out"));
   
    if(number(f.readLine()) % 47 == number(f.readLine()) % 47){
      out.println("GO");
    }
    else{
      out.println("STAY");
    }

    out.close();                                  // close the output file
  }


  public static int number(String name){
     int val=1;
     for(int i=0;i<name.length();i++){
      int c=(name.charAt(i)- 64);
      val*=c;

     }
     return val;
  }
}