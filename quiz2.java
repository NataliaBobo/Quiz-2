package number2;

import java.util.Scanner;

public class quiz2 {
    
public static void main(String[] args) {
    //telling a  user  to ent er ethe marrks of the units
    System.out.println("please enter the marks of the three units:");
    //collecting scanner object


    Scanner ask=new Scanner (System.in);
    System.out.println("please enter marks for java programing:");

    //double values being stored
    Double java_programing=ask.nextDouble();
    System.out.println("please enter marks for networking:");
    Double networking=ask.nextDouble();
    System.out.println("please enter marks for maths:");
    Double maths=ask.nextDouble();
//printing the lines of individual units
System.out.println("marks for java programing is:"+java_programing);
System.out.println("marks for networking is:"+networking);
System.out.println("marks for maths is:"+maths);
System.out.println("the average marks is:" +(java_programing+networking+maths)/3);

//closing program
}


}
