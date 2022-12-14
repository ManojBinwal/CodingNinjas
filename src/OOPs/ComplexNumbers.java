package OOPs;

import java.util.Scanner;

public class ComplexNumbers {
    // Complete this class
    int real;               //creating variable to store real numbers
    int imaginary;          //creating variables to store imaginary numbers
    ComplexNumbers(int real ,int imaginary) //constructor to set default values of the number
    {
        this.real=real;     //this keyword implies current reference (since this is constructor this refers to properties of class ComplexNumbers
        this.imaginary=imaginary;
    }
    public void plus(ComplexNumbers c2) //method to add two complex numbers
    {
        this.real = this.real+c2.real;   //adding real numbers //here this function was called using reference of c1 therefore "this" refers to properties of object c1
        this.imaginary=this.imaginary+c2.imaginary;  //adding complex numbers

    }
    public void print()  //method to print complex numbers
    {
        System.out.println(this.real+" + i"+this.imaginary);
    }
    public void multiply(ComplexNumbers c2)  // method to multiply complex numbers
    {
        /*
        *multiplying complex numbers is same as real multiplying real numbers however keep few things in mind-
        *  i^2 = -1
        * real and imaginary numbers can be multiplied but not added.
        * product of two complex number is real number
        * product of real number and complex number is complex number
        * (4 + 5i ) * ( 6 + 7i)  = 24 + 28i + 30i -35 = -11 + 58i
         */
        int r = this.real*c2.real-this.imaginary*c2.imaginary;
        this.imaginary=this.real*c2.imaginary+this.imaginary*c2.real;
        this.real =r;
    }
    public static void main(String[] args) { //main method // driver method
        Scanner s = new Scanner(System.in);

        int real1 = 4;          //initialising values of real
        int imaginary1 = 5;

        int real2 = 6;
        int imaginary2 = 7;

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1); //creating object of class complexNumbers
        //objects are real deal made using class blueprint // you can create n number of objects
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);
        //creating second object to store second set of complex numbers

        int choice = 2;    //choice 1 = add   // choice 2 multiply

        if(choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        }
        else if(choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        }
        else {
            return;
        }
    }
}