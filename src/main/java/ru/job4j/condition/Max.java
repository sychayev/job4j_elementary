package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = 0;
        if (first > second) {
            return result = first;
        }
        if (second > first) {
            return result = second;
        }
        if (second == first) {
            return result = first;
        }
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            return first;
        }
        if (second > first && second > third) {
            return second;
        }
        if (third > first && third > second) {
            return third;
        }
        int temp = max(first, second);
        return max(temp, third);

    }

    public static int max(int first, int second, int third, int fourth) {
        int result = 0;
        if (first > second && first > third && first > fourth) {
            return result = first;
        }
        if (second > first && second > third && second > fourth) {
            return result = second;
        }
        if (third > first && third > second && third > fourth) {
            return result = third;
        }
        if (fourth > first && fourth > second && fourth > third) {
            return result = fourth;
        }
        int temp = max(first, second, third);
        return max(temp, fourth);

    }

    public static void main(String[] args) {
        System.out.println(Max.max(10,5));
        System.out.println(Max.max(1,5,2));
        System.out.println(Max.max(10,5,3,11));
    }
}
