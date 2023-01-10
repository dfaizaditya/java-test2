/*
    Algo :
    - Time complexity : O log(n)
    - 
* */
public class performance1 {

    static double areaFold(double side, double n) {
        double area = side * side;

        return area * 1.0 / Math.pow(2, n);
    }

    public static void main(String[] args) {

        double side = 20, n = 4;
        System.out.println(areaFold(side, n));

    }
}
