import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])
{
    Scanner scanner=new Scanner(System.in);
    char char1 =scanner.next().charAt(0);
    if(char1>='0' && char1<='9')
    {
        System.out.println(" Digit");

    }
    else if((char1>='a' && char1<='z')||(char1>='A' && char1<='Z'))
    {
        System.out.println(" Alphabet");
    }
    else
    {
        System.out.println(" special character");

    }
}
}
