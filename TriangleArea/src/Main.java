public class Main {
    public static void main(String[] args) {
        double side1 = 1.0d;
        double side2 = 15.0d;
        double side3 = 20.0d;
        System.out.println(
                isValid(side1, side2, side3) ? "Area of Triangle: " + areaTriangle(side1, side2, side3) : "Invalid Triangle" // ternary if statement
        );
    }

    public static boolean isValid (double side1, double side2, double side3){
        if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
            return  true;
        } else  return false;
    }

    public static double areaTriangle(double side1, double side2, double side3){
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s - side1) * (s - side2) * (s - side3));
        return area;
    }
}