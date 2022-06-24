package MathTasks;

public class Solution {
    public boolean discriminantMoreThenZero() {
        int a = 2;
        int b = -3;
        int c = 1;
        int b2 = Math.abs(b);
        int zero = 0;
        int discriminant = b2 - (4 * a * c);
        if (discriminant > zero) {
            double x2 = (-b - Math.sqrt(discriminant)) / (2*a);
            double x1 = (-b + Math.sqrt(discriminant)) / (2*a);
            System.out.println("First root is: " + x1);
            System.out.println("Second root is: " + x2);
            return discriminant > zero;
        }
        return true;
    }

    public boolean discriminantEqualsZero() {
        int a = 9;
        int b = 6;
        int c = 1;
        int b2 = Math.abs(b);
        int zero = 0;
        int discriminant = b2 - (4 * a * c);
        if (discriminant == zero) {
            double x3 = -(b / (2*a));
            System.out.println("Root is: " + x3);
            return discriminant == zero;
        }
        return true;
    }

    public Boolean discriminantLessThenZero() {
        int a = 2;
        int b = -3;
        int c = 4;
        int b2 = Math.abs(b);
        int zero = 0;
        int discriminant = b2 - (4 * a * c);
        if (discriminant < zero) {
            return null;
        }
        return true;
    }
}
