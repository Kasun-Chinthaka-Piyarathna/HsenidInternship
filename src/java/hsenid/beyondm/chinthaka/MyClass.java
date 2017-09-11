package hsenid.beyondm.chinthaka;

import java.util.Scanner;

/**
 * Created by chinthaka on 9/11/17.
 */
public class MyClass {

    //TODO: Include javadocs for methods
    //TODO: Make methods private as possible
    //TODO: Avoid static methods
    //TODO: Avoid static variables
    //TODO: Move constant values to constant variables


    private  int years;
    private int weight;
    private int height;
    private boolean male;
    private boolean female;
    private double calory_need;
    private double m1=66.5;
    private double m2=13.75;
    private double m3=5.003;
    private double m4=6.775;
    private double fm1=655.1;
    private double fm2=9.563;
    private double fm3=1.850;
    private double fm4=4.676;

    /**
     *
     * @param args
     */

    public static void main(String[] args){

        MyClass obj = new MyClass();

        obj.selectAge();
        obj.selectWeight();
        obj.selectHeight();
        obj.selectGender();
        obj.selectActivity();
        obj.selectCaloric();
        System.out.println("FINISHED");

    }

    /**
     *@param null
     */

    private void selectAge(){
        System.out.println(" Enter Age in Years");
        years = new Scanner(System.in).nextInt();
        System.out.println(" Saved: "+years);
    }

    /**
     *@param null
     */
    private   void selectWeight(){
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

    /**
     *@param null
     */
    private void selectHeight(){
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

    /**
     *@param null
     */
    private void selectGender(){

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

    /**
     *@param null
     */
    private  void selectActivity(){

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

    /**
     *@param null
     */
    private void selectCaloric(){

        if(male) {

            System.out.println(" Estimated Caloric Needs - kcal/day");
            calory_need =  (m1 + (m2 * weight) + (m3 * height) - (m4 * years));
            System.out.println(" Saved: "+calory_need);
        }else{
            System.out.println(" Estimated Caloric Needs - kcal/day");
            calory_need = fm1 + (fm2 * weight) + (fm3 * height) - (fm4 * years);
            System.out.println(" Saved: "+calory_need);

        }



    }

}
