/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.awt.*;
import java.util.Scanner;
import java.lang.Math;
public class paintCalc {

    public static void main(String[] args){
        final double PAINTCON = 350;
     Scanner sc = new Scanner(System.in);
     System.out.print("What is the length of the wall? ");
     double length = sc.nextDouble();
     System.out.print("What is the width of the wall? ");
     double width = sc.nextDouble();
double sqFeet = length * width;
double paintAmt = sqFeet/ PAINTCON;
    if(sqFeet % PAINTCON != 0){

        paintAmt =  Math.ceil(paintAmt);
    }



     System.out.print("You will need to buy "+(int)paintAmt+" gallons of paint to cover "+(int)sqFeet+" square feet.");

    }



}
