package ru.job4j.condition.Sq;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double L = h * k;
        double S = L * h;
        return S;
    }

    public static void main(String[] arg){
        double result = SqArea.square(6,2);
        System.out.println(" p = 6,k = 2, " + result );
    }

}
