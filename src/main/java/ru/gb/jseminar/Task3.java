package ru.gb.jseminar;

public class Task3 {

    //Дан массив двоичных чисел, например [1,1,1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        double [] arr = {1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
        int result = count(arr);
        System.out.println(result);

    }


   public static int count(double[] array) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count += 1;
            }
            else {
                if (count > max) {
                    max = count;
                    count = 0;
                }
            }
        }
        if (count > max) {
            max = count;
        }
        return max;
    } 
}