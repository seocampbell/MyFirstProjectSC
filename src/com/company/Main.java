package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
            //Variables
            String  name,first, second, last, description, prod;
            int     shoeSize,sum,fst,scd, four;
            double  height;
            boolean isMale = true;
            //Boolean Statement
            if (isMale) {
            //Include variables for the true statement
            first = "Stephen";
            second = "Campbell";
            name = first + second;
            height = 5.9;
            shoeSize = 7;

            int[] myArray = new int[10];

            //for(int i = 0; i<10; i++) {
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = i * 10;
            }
            for (int i = 0; i < myArray.length; i++) {
                //System.out.println("Element " + i + ", value is " + myArray[i]);


                if (height > 5.9) {
                    {
                        description = "Tall";
                    }
                } else if (height < 5.8) {
                    description = "Small";

                } else {
                    description = "Average height";
                }

                //Write the output
                System.out.println("Name: " + name);
                System.out.println("Height: " + height);
                System.out.println("Shoe size: " + shoeSize);
                System.out.println("MALE= " + isMale);
                System.out.println("First: " + myArray[0]);
                System.out.println("Last: " + myArray[9]);
                System.out.println("Description: "+ description);
                System.out.println("Sum Value: " + i + " *10");
                System.out.println("Prod, myArray[i] = i * 10: (answer= " + myArray[i] + ")");
            }

        }
    }
}
