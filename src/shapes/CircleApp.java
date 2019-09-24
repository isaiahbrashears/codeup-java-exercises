package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        circleTracker();



    }

    public static void circleTracker(){
        Input input = new Input();
        int count = 0;
        do {
            double userRadius = input.getDouble();
            Circle circle = new Circle(userRadius);
            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());
            System.out.println("try another number?");
            input.yesNo();
            count++;
        }while (input.yesNo());
        System.out.println(count + " Circles created");

    }



}
