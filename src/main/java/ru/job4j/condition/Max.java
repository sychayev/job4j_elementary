package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = 0;
        result = (first > second) ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = first;
        result = (second > first) && (second > third) ? second : third;
        result = (third > first) && (third > second) ? third : first;
        int temp = max(first, second);
        return max(temp, third);

    }

    public static int max(int first, int second, int third, int fourth) {
        int result = 0;
        result = (fourth > first) && (fourth > third)
                && (fourth > second) ? fourth : third;
        int temp = max(first, second, third);
        return max(temp, fourth);

    }

    public static void main(String[] args) {
        System.out.println(Max.max(10, 5));
        System.out.println(Max.max(1, 5, 2));
        System.out.println(Max.max(10, 5, 3, 11));
    }
}
