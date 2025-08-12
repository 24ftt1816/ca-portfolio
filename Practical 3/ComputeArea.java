public class ComputeArea {
    public static void main(String[] args) {
        double base = 4.0;
        double height = 6.0;
        double pi = 3.14;
        double radius = 8.0;
        double areaOfSquare;
        double areaOfTriangle;
        double areaOfCircle;

        areaOfSquare = base * base;
        areaOfTriangle = (base * height) / 2;
        areaOfCircle = pi * radius * radius;

        System.out.println(
            "The area of square is " + areaOfSquare + "\n" +
            "The area of triangle is " + areaOfTriangle + "\n" +
            "The area of circle is " + areaOfCircle);
    
    }
    
}