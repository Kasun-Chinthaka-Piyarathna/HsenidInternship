package hsenid.beyondm.chinthaka;

import java.util.Scanner;

/**
 * Created by chinthaka on 9/11/17.
 */
public class MyClass {

    public static int years;
    public static int weight;
    public static int height;
    public static boolean male;
    public static boolean female;
    public static double calory_need;
    public static void main(String[] args){


        selectAge();
        selectWeight();
        selectHeight();
        selectGender();
        selectActivity();
        selectCaloric();

    }
    static void selectAge(){
        System.out.println(" Enter Age in Years");
        years = new Scanner(System.in).nextInt();
        System.out.println(" Saved: "+years);
    }
    static  void selectWeight(){
        System.out.println(" Select suitable weight format");
        System.out.println(" kg -->1 lb-->2");
        String input1 = new Scanner(System.in).next();
        if(input1.equals("1")){
            System.out.println(" Enter your weight");
            weight = new Scanner(System.in).nextInt();
            System.out.println(" Saved: "+weight+" kg");

        }else if(input1.equals("2")){

            System.out.println(" Enter your weight");
            weight = new Scanner(System.in).nextInt();
            System.out.println(" Saved: "+weight+" lb");
        }else{
            System.out.println(" Sorry You have chosen an invalid format");
        }
    }
    static void selectHeight(){
        System.out.println(" Select suitable Height format");
        System.out.println(" cm-->1 or in-->2");
        String input2 = new Scanner(System.in).next();
        if(input2.equals("1")){
            System.out.println(" Enter your height");
            height = new Scanner(System.in).nextInt();
            System.out.println(" Saved: "+height+" cm");

        }else if(input2.equals("2")){

            System.out.println(" Enter your height");
            height = new Scanner(System.in).nextInt();
            System.out.println(" Saved: "+height+" in");
        }else{
            System.out.println(" Sorry You have chosen an invalid format");
        }

    }
    static void selectGender(){

        System.out.println(" Select suitable Patient Gender format");
        System.out.println(" Male -->1 or Female-->2");
        String input3 = new Scanner(System.in).next();
        if(input3.equals("1")){
            male=true;
            System.out.println(" Saved:  Male");

        }else if(input3.equals("2")){
            female=true;
            System.out.println(" Saved:  Female");
        }else{
            System.out.println(" Sorry You have chosen an invalid format");
        }
    }
    static  void selectActivity(){

        System.out.println(" Select suitable Activity Level format");
        System.out.println(" Sedentary -->1 || Lightly active -->2 || Moderately active -->3 || Very active -->4 || Heavy physical training -->5");
        System.out.println("Type relevant index");
        String input4 =  new Scanner(System.in).next();
        if(input4.equals("1")){
            System.out.println(" Saved:  Sedentary");

        }else if(input4.equals("2")){
            System.out.println(" Saved:  Lightly active");
        }else if(input4.equals("3")){
            System.out.println(" Saved:  Moderately active");

        }else if(input4.equals("4")){
            System.out.println(" Saved:  Very active");
        }else if(input4.equals("5")){
            System.out.println(" Saved:  Heavy physical training");
        }else{
            System.out.println(" Sorry You have chosen an invalid format");
        }
    }
    static void selectCaloric(){

        if(male) {
            System.out.println(" Estimated Caloric Needs - kcal/day");
            calory_need =  (66.5 + (13.75 * weight) + (5.003 * height) - (6.775 * years));
            System.out.println(" Saved: "+calory_need);
        }else{
            System.out.println(" Estimated Caloric Needs - kcal/day");
            calory_need = 655.1 + (9.563 * weight) + (1.850 * height) - (4.676 * years);
            System.out.println(" Saved: "+calory_need);
        }



    }

}
