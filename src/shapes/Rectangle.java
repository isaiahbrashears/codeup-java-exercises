package shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double w) {
        super.setWidth(w);
    }

    @Override
    public void setLength(double l) {
        super.setLength(l);
    }

    public static void main(String[] args) {
        String x = "1";

        System.out.println();;

        List<Integer> list = new ArrayList<>();

        int coins[] = {1,2,3};

        System.out.println(coins);

    }
}
