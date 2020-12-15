package by.algorithms.sortings;

public class Sortings {
    public static int[] BubbleSorting(int[] massive){
        int mas[] = massive.clone();

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if(mas[i] > mas[i + 1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        return mas;
    }

    public static int[] InsertSorting(int[] massive){
        int mas[] = massive.clone();

        for (int i = 1; i < mas.length; i++) {
            int value = mas[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < mas[j]) {
                    mas[j + 1] = mas[j];
                } else {
                    break;
                }
            }
            mas[j + 1] = value;
        }
        return mas;
    }

    public static int[] QuickSort(int[] massive, int startInd, int endInd) {
        int middle = startInd + (endInd - startInd) / 2;
        int midElement = massive[middle];

        int i = startInd, j = endInd;
        while (i <= j) {
            while (massive[i] < midElement) {
                i++;
            }

            while (massive[j] > midElement) {
                j--;
            }

            if (i <= j) {
                int temp = massive[i];
                massive[i] = massive[j];
                massive[j] = temp;
                i++;
                j--;
            }
        }

        if (startInd < j)
            QuickSort(massive, startInd, j);

        if (endInd > i)
            QuickSort(massive, i, endInd);

        return massive;
    }

    public static int[] MergeSort(int[] massive, int startInd, int endInd) {
        if (startInd < endInd) {
            int m = startInd + (endInd - startInd) / 2;

            MergeSort(massive, startInd, m);
            MergeSort(massive, m + 1, endInd);

            MergeAlg(massive, startInd, m, endInd);
        }
        return massive;
    }

    static void MergeAlg(int arr[], int startInd, int m, int endInd)
    {
        int n1 = m - startInd + 1;
        int n2 = endInd - m;

        int massLeft[] = new int[n1];
        int massRight[] = new int[n2];

        for (int i = 0; i < n1; i++)
            massLeft[i] = arr[startInd + i];
        for (int j = 0; j < n2; j++)
            massRight[j] = arr[m + 1 + j];

        int i = 0;
        int j = 0;
        int k = startInd;
        while (i < n1 && j < n2) {
            if (massLeft[i] <= massRight[j]) {
                arr[k] = massLeft[i];
                i++;
            }
            else {
                arr[k] = massRight[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = massLeft[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = massRight[j];
            j++;
            k++;
        }
    }

    public static int[] HybridSort(int[] massive, int startInd, int endInd){
        int middle = startInd + (endInd - startInd) / 2;
        int midElement = massive[middle];

        int i = startInd, j = endInd;
        while (i <= j) {
            while (massive[i] < midElement) {
                i++;
            }

            while (massive[j] > midElement) {
                j--;
            }

            if (i <= j) {
                int temp = massive[i];
                massive[i] = massive[j];
                massive[j] = temp;
                i++;
                j--;
            }
        }

        if (startInd < j && Math.abs(startInd - j)> 8){
            QuickSort(massive, startInd, j);
        }
        else  if (endInd > i && Math.abs(endInd - i) > 8){
            QuickSort(massive, i, endInd);
        }
        else InsertSorting(massive);

        return massive;
    }

    public static int[] CountSort(int[] massive){
        int max = max(massive);

        int[] count = new int[max + 1];
        for (int num: massive) {
            count[num]++;
        }

        int ind = 0;
        int[] sorted = new int[massive.length];

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++){
                sorted[ind] = i;
                ind++;
            }
        }

        return sorted;
    }

    public static int max(int[] massive){
        int max = massive[0];
        for (int i = 1; i < massive.length; i++) {
            if(massive[i] > max) {
               max = massive[i];
            }
        }
        return max;
    }
}
