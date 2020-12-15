//Стаганович А.Л. 2 гр
//2 лабораторная работа



package by.algorithms.main;
import by.algorithms.sortings.Searches;

public class MainClass {
    public static void main(String[] args) {

        //Создание массива 2^20 элеметов
        int massive_1048576[] = new int[1048576];
        for(int i = 0; i < 256; i++){
            massive_1048576[i] = (int)(Math.random()*1048575);
        }

        int numToFind = (int)(Math.random()*1048575);

        System.out.println("Number we need to find:" + numToFind);

        //Вычисление времени поиска в массиве 2^20 элементов с помощью Линейного Поиска:
        double start = System.nanoTime();
        int ind = Searches.LinearSearch(massive_1048576, numToFind);
        double finish = System.nanoTime();
        double timeConsumedMillis = finish - start;
        System.out.println("Time of search on massive of 2^20 elements using Linear Search: " + timeConsumedMillis/1000000 + " ms.");

        //Вычисление времени поиска в массиве 2^20 элементов с помощью Интерполяционного Поиска:
        start = System.nanoTime();
        ind = Searches.InterpolationSearch(massive_1048576, numToFind);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of search on massive of 2^20 elements using Interpolation Search: " + timeConsumedMillis/1000000 + " ms.");

        //Вычисление времени поиска в массиве 2^20 элементов с помощью Бинарного Поиска:
        start = System.nanoTime();
        ind = Searches.BinarySearch(massive_1048576, numToFind);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of search on massive of 2^20 elements using Binary Search: " + timeConsumedMillis/1000000 + " ms.");
    }
}
