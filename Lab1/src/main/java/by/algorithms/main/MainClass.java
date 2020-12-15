//Стаганович А.Л. 2 гр
//1 лабораторная работа


package by.algorithms.main;
import by.algorithms.sortings.Sortings;

public class MainClass {
    public static void main(String[] args) {
        //Создание массива случайных чисел 2^8 элеметов
        int massive_256[] = new int[256];
        for(int i = 0; i < 256; i++){
            massive_256[i] = (int)(Math.random()*256);
        }
        //Создание массива случайных чисел 2^17 элеметов
        int massive_131072[] = new int[131072];
        for(int i = 0; i < 131072; i++){
            massive_131072[i] = (int)(Math.random()*131072);
        }
        //Создание почти упорядоченного массива 2^17 элеметов
        int almostSortedMassive_131072[] = new int[131072];
        for (int i = 0; i < 1000; i++){
            almostSortedMassive_131072[i] = i;
        }
        for(int i = 1000; i < 131072; i++){
            almostSortedMassive_131072[i] = (int)(Math.random()*131072);
        }
        //Создание массива с малым размахом выборки(от 0 до 100)
        int smallScopedMassive_256[] = new int[256];
        for(int i = 0; i < 256; i++){
            smallScopedMassive_256[i] = (int)(Math.random()*101);
        }
        int sortedMassive_256[];
        int sortedMassive_131072[];
        //Сортировка и вычисление времени сортировки массива 2^8 элементов
        double start = System.nanoTime();
        sortedMassive_256 = Sortings.BubbleSorting(massive_256);
        double finish = System.nanoTime();
        double timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 256 elements using Bubble Sort: " + timeConsumedMillis/1000000 + " ms.");
        start = System.nanoTime();
        sortedMassive_256 = Sortings.InsertSorting(massive_256);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 256 elements using Insertion Sort: " + timeConsumedMillis/1000000 + " ms.");
        start = System.nanoTime();
        sortedMassive_256 = Sortings.MergeSort(massive_256, 0, massive_256.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 256 elements using Merge Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_256 = Sortings.HybridSort(massive_256, 0, massive_256.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 256 elements using Hybrid Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_256 = Sortings.CountSort(massive_256);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 256 elements using Count Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_256 = Sortings.QuickSort(massive_256, 0, massive_256.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 256 elements using Quick Sort: " + timeConsumedMillis/1000000 + " ms.");
        System.out.println();

        //Сортировка и вычисление времени сортировки массива 2^17 элементов
        start = System.nanoTime();
        sortedMassive_131072 = Sortings.BubbleSorting(massive_131072);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 131072 elements using Bubble Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_131072 = Sortings.InsertSorting(massive_131072);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 131072 elements using Insertion Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_131072 = Sortings.MergeSort(massive_131072, 0, massive_131072.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 131072 elements using Merge Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_131072 = Sortings.HybridSort(massive_131072, 0, massive_131072.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 131072 elements using Hybrid Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_131072 = Sortings.CountSort(massive_131072);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 131072 elements using Count Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_131072 = Sortings.QuickSort(massive_131072, 0, massive_131072.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 131072 elements using Quick Sort: " + timeConsumedMillis/1000000 + " ms.");
        System.out.println();

        //Сортировка и вычисление времени сортировки массива почти упорядоченных 2^17 элементов
        start = System.nanoTime();
        sortedMassive_131072 = Sortings.BubbleSorting(almostSortedMassive_131072);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting almost sorted massive of 131072 elements using Bubble Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_131072 = Sortings.InsertSorting(almostSortedMassive_131072);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting almost sorted massive of 131072 elements using Insertion Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_131072 = Sortings.MergeSort(almostSortedMassive_131072, 0, almostSortedMassive_131072.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting almost sorted massive of 131072 elements using Merge Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_131072 = Sortings.HybridSort(almostSortedMassive_131072, 0, almostSortedMassive_131072.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting almost sorted massive of 131072 elements using Hybrid Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_131072 = Sortings.CountSort(almostSortedMassive_131072);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting almost sorted massive of 131072 elements using Count Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_131072 = Sortings.QuickSort(almostSortedMassive_131072, 0, almostSortedMassive_131072.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting almost sorted massive of 131072 elements using Quick Sort: " + timeConsumedMillis/1000000 + " ms.");
        System.out.println();

        //Сортировка и вычисление времени сортировки массива с малым размахом выборки 256 элеметов
        start = System.nanoTime();
        sortedMassive_256 = Sortings.BubbleSorting(smallScopedMassive_256);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting small scoped massive of 256 elements using Bubble Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_256 = Sortings.InsertSorting(smallScopedMassive_256);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting small scoped massive of 256 elements using Insertion Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_256 = Sortings.MergeSort(smallScopedMassive_256, 0, smallScopedMassive_256.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting small scoped massive of 256 elements using Merge Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_256 = Sortings.HybridSort(smallScopedMassive_256, 0, smallScopedMassive_256.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting small scoped massive of 256 elements using Hybrid Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_256 = Sortings.CountSort(smallScopedMassive_256);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting small scoped massive of 256 elements using Count Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMassive_256 = Sortings.QuickSort(smallScopedMassive_256, 0, smallScopedMassive_256.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting small scoped massive of 256 elements using Quick Sort: " + timeConsumedMillis/1000000 + " ms.");
    }
}
