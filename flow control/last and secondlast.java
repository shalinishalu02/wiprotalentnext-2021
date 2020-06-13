mport java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'lastLetters' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING word as parameter.
     */

    public static String lastLetters(String word) {
    // Write your code here

    if(word.length()  <2 ){
      return word;
   }
   String lastTwo = word.substring(word.length() - 2);
   return word.charAt(word.length() - 1)+" "
    + word.charAt(word.length() - 2);

    }

}
