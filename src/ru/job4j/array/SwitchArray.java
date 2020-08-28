package ru.job4j.array;

public class SwitchArray {
    public static int[] swapBorder(int[] array) {

        int temp = array[0];
        array[0] = array.length;
        array[0] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] rsl = SwitchArray.swapBorder(nums);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
    }
}
