/*
  Name: Alexandre Paquette
  Date: 01/14/2022
  Program: Find Largest and Smallest Numbers

*/

import java.util.Scanner;

public class LargeAndSmall{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int max;
    int min;

    //BIG BRAIN VERSION
    /*int[] nums = new int[5];
    for(int x = 0; x < 5; x++){
      System.out.print("Enter a Number: ");
      nums[x] = in.nextInt();
    }

    max = nums[0];
    min = nums[0];

    for(int x = 1; x < 5; x++){
      if(nums[x] > max){
        max = nums[x];
      }
      if(nums[x] < min){
        min = nums[x];
      }
    }

    System.out.printf("The largest value was: %d%n", max);
    System.out.printf("The smallest value was: %d%n", min);*/


    //TEXTBOOK VERSION
    System.out.print("Enter a first num: ");
    int num1 = in.nextInt();

    System.out.print("Enter a second num: ");
    int num2 = in.nextInt();

    System.out.print("Enter a third num: ");
    int num3 = in.nextInt();

    System.out.print("Enter a fourth num: ");
    int num4 = in.nextInt();

    System.out.print("Enter a fifth num: ");
    int num5 = in.nextInt();

    max = num1;
    min = num2;*/

    //find the max

    if(num2 > max){
      max = num2;
    }
    if(num3 > max){
      max = num3;
    }
    if(num4 > max){
      max = num4;
    }
    if(num5 > max){
      max = num5;
    }

    // find the min

    if(num2 < min){
      min = num2;
    }
    if(num3 < min){
      min = num3;
    }
    if(num4 < min){
      min = num4;
    }
    if(num5 < min){
      min = num5;
    }

    System.out.printf("The largest value was: %d%n", max);
    System.out.printf("The smallest value was: %d%n", min);

  }
}
