/*NAME          :SWAPNA MUKKAMALLA
  DATE          :10-21-2019
  COURSE        :IT-516 DATA STRUCTURES AND ALGORITHMS
  HOMEWORK      :HW05
  TITLE         :Binary Search Symbol Table
  DESCRIPTION   :This application takes the input data from command prompt
                 and tests different methods - put,get,rank,delete,
                 ceiling,floor..... and display the keys and values after each
                 test*/

import edu.princeton.cs.algs4.BinarySearchST;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearchTester {


    public static void main(String[] args) {

        //  Building the BinarySearchST
        StdOut.println();
        StdOut.println("Building a simple BinarySearchST");
        StdOut.println("Getting all items from file");
        StdOut.println("---------------------");
        BinarySearchST<String, Integer> test01 = new BinarySearchST<String, Integer>();

        //inserting key and values to BinarySearch ST
        for (int i = 0; !StdIn.isEmpty(); i++) {
            String key = StdIn.readString();
            test01.put(key, i);
        }

        //Displaying the Key and values
        StdOut.print("keys  = ");
        for (String s : test01.keys())
            StdOut.print(s + "  ");
        StdOut.println();
        StdOut.print("vals  = ");
        for (String s : test01.keys()) {
            int l = s.length();
            for (int j = 0; j < l - 1; j++) {
                System.out.print(" ");
            }
            StdOut.print(test01.get(s) + "  ");
        }
        StdOut.println();
        StdOut.println();

        //Displaying the size of the Binary Search ST
        StdOut.println("Size of the binary search ST....  " + test01.size());
        StdOut.println();
        StdOut.println();

        //Putting the Consonant S into Binary Search ST
        test01.put("S", test01.size());


        //Displaying the keys and values after putting S
        StdOut.println("Putting S into BinarySearchST....");
        StdOut.println("---------------------");
        StdOut.print("keys  = ");
        for (String s : test01.keys())
            StdOut.print(s + "  ");
        StdOut.println();
        StdOut.print("vals  = ");
        for (String s : test01.keys()) {
            int l = s.length();
            for (int j = 0; j < l - 1; j++) {
                System.out.print(" ");
            }
            StdOut.print(test01.get(s) + "  ");
        }
        StdOut.println();
        StdOut.println();

        //Displaying the  grown size of Binary Search ST
        StdOut.println("Size of grown BinarySearchST ....  " + test01.size());
        StdOut.println();
        StdOut.println();

        //Putting S again
        test01.put("S", test01.size());

        //Displaying the keys and values after putting S again
        StdOut.println("Putting S (again) into BinarySearchST....");
        StdOut.println("---------------------");
        StdOut.print("keys  = ");
        for (String s : test01.keys())
            StdOut.print(s + "  ");
        StdOut.println();
        StdOut.print("vals  = ");
        for (String s : test01.keys()) {
            int l = s.length();
            for (int j = 0; j < l - 1; j++) {
                System.out.print(" ");
            }
            StdOut.print(test01.get(s) + "  ");
        }
        StdOut.println();
        StdOut.println();
        //Deleting S from the Binary Search ST
        test01.delete("S");

        //Displaying the keys and values after deleting S
        StdOut.println("Deleting  S from BinarySearchST....");
        StdOut.println("---------------------");
        StdOut.print("keys  = ");
        for (String s : test01.keys())
            StdOut.print(s + "  ");
        StdOut.println();
        StdOut.print("vals  = ");
        for (String s : test01.keys()) {
            int l = s.length();
            for (int j = 0; j < l - 1; j++) {
                System.out.print(" ");
            }
            StdOut.print(test01.get(s) + "  ");
        }

        StdOut.println();
        StdOut.println();

        //Displaying the rank of the consonant S
        StdOut.println("Rank of consonant S ....       " + test01.rank("S"));
        StdOut.println();
        StdOut.println();

        //Displaying the Ceiling for consonant N
        StdOut.println("Ceiling for  consonant N ....  " + test01.ceiling("N"));
        StdOut.println();
        StdOut.println();

        //Displaying the floor for consonant v
        StdOut.println("Floor for consonant V ....     " + test01.floor("V"));
        StdOut.println();
        StdOut.println();

        //Displaying the keys and value with minimum pointer
        StdOut.println("The ^ shows the min() (" + test01.min() + ") from BinarySearchST...");
        StdOut.println("---------------------");
        StdOut.print("keys  = ");
        for (String s : test01.keys())
            StdOut.print(s + "  ");
        StdOut.println();
        StdOut.print("vals  = ");
        for (String s : test01.keys()) {
            int l = s.length();
            for (int j = 0; j < l - 1; j++) {
                System.out.print(" ");
            }
            StdOut.print(test01.get(s) + "  ");
        }
        StdOut.println();
        StdOut.print(" min  = ");

        String a = test01.min();

        for (String s : test01.keys()) {

            int l = s.length();
            for (int j = 0; j < l - 1; j++) {
                System.out.print(" ");
            }

            if (s == a) {

                StdOut.print("^");
            } else {
                StdOut.print();
            }
        }
        StdOut.println();
        StdOut.println();

        //Displaying the keys and value with maximum pointer
        StdOut.println("The ^ shows the max() (" + test01.max() + ") from BinarySearchST...");
        StdOut.println("---------------------");
        StdOut.print("keys  = ");
        for (String s : test01.keys())
            StdOut.print(s + "  ");
        StdOut.println();
        StdOut.print("vals  = ");
        for (String s : test01.keys()) {

            int l = s.length();
            for (int j = 0; j < l - 1; j++) {
                System.out.print(" ");
            }
            StdOut.print(test01.get(s) + "  ");
        }
        StdOut.println();
        StdOut.print(" max  = ");
        String b = test01.max();
        //StdOut.println(b);
        for (String s : test01.keys()) {

            int l = s.length();
            for (int j = 0; j < l - 1; j++) {
                System.out.print(" ");
            }

            if (s == b) {
                StdOut.print("^");
            } else {
                StdOut.print("   ");
            }
        }
        StdOut.println();
        StdOut.println();

        test01.deleteMin(); // deleting minimum key

        //Displaying  the Binary Search ST after deleting the minimum key
        StdOut.println("Deleting the minimum key and its value from BinarySearchST.... ");
        StdOut.println("---------------------");

        StdOut.print("keys  = ");
        for (String s : test01.keys())
            StdOut.print(s + "  ");
        StdOut.println();
        StdOut.print("vals  = ");
        for (String s : test01.keys()) {
            int l = s.length();
            for (int j = 0; j < l - 1; j++) {
                System.out.print(" ");
            }
            StdOut.print(test01.get(s) + "  ");
        }
        StdOut.println();
        StdOut.println();

        test01.deleteMax(); // Deleting the maximum key and its value

        //Displaying the binary Search ST after deleting maximum key and its value
        StdOut.println("Deleting the maximum key  and its value fromBinarySearchST.... ");
        StdOut.println("---------------------");

        StdOut.print("keys  = ");
        for (String s : test01.keys())
            StdOut.print(s + "  ");
        StdOut.println();
        StdOut.print("vals  = ");
        for (String s : test01.keys()) {
            int l = s.length();
            for (int j = 0; j < l - 1; j++) {
                System.out.print(" ");
            }
            StdOut.print(test01.get(s) + "  ");
        }
        StdOut.println();


    }
}
