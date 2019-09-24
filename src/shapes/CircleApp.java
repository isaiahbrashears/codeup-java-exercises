package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();

        do {
            double userRadius = input.getDouble();
            Circle circle = new Circle(userRadius);
            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());
            System.out.println("try another number?");
            input.yesNo();
        }while (input.yesNo());


    }




}
