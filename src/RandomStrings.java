/*NAME          :SWAPNA MUKKAMALLA
  DATE          :10-21-2019
  COURSE        :IT-516 DATA STRUCTURES AND ALGORITHMS
  HOMEWORK      :HW05
  TITLE         :Generate Random Strings
  DESCRIPTION   :This application takes the input  minimum,maximum string length
                 and number of strings from command prompt and generate random
                 strings with in range of input.*/

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomStrings {
    public static void main(String[] args) {

        int min = Integer.parseInt(args[0]);   //minimum str length

        int max = Integer.parseInt(args[1]);   //maximum word length

        int n = Integer.parseInt(args[2]);    //number of strings to be generated


        String[] s = new String[n];   // to store strings
        //  Random random = new Random();

        for (int i = 0; i < n; i++) {
            // generating string

            char[] arr = new char[StdRandom.uniform(min, max + 1)];
            for (int j = 0; j < arr.length; j++) {
                //generating random letters
                arr[j] = ((char) StdRandom.uniform(65, 90));
            }
            s[i] = new String(arr);
            StdOut.println(s[i]);  //printing the strings

        }


    }
}
