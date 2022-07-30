package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(in);




        System.out.println("Shakar narxini kiriting");
        int a= scanner.nextInt();


        for (float i = 1; i <2 ; i+=0.2) {
            System.out.println(i+"kg -> "+(i*a));
        }




















    }
}
