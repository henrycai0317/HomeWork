package com.post;


import java.util.Scanner;

public class PostOffice {

    public static void main(String[] args) {
        float length,width;int height;String s;
        Box5 box5 = new Box5();
        Box3 box3 = new Box3();
        Scanner scn = new Scanner(System.in);
        int num=0;
        do {
            System.out.println("Please enter your Box size that you want ");
            System.out.print("Please enter object's length:");
            s=scn.next();
            length = Float.parseFloat(s);
            System.out.print("Please enter object's  width: ");
            s=scn.next();
            width = Float.parseFloat(s);
            System.out.print("Please enter object's height: ");
            s=scn.next();
            height = Integer.parseInt(s);

           if(box5.validate(length,width,height) && box3.validate(length,width,height)) {
               System.out.print("Box5 and Box3 you can use ,choose what you want ?");
               String b=scn.next();
               System.out.println("OK buy it ");
                break;
               }else if(box5.validate(length,width,height)){
                   System.out.println("Try Box5");
                    break;
               }else if(box3.validate(length,width,height)){
                    System.out.println("Try Box3");
                    break;
                }else {
                   System.out.print("Sorry that's too big ! try again or you wanna leave (-1) ,continue(1) your answer ?");
                s=scn.next();
                num = Integer.parseInt(s);
               }

        }while (num != -1);



    }

}
