package by.algorithms.sortings;

public class Searches {
    public static int BinarySearch(int[] array, int numberToFind)
    {
        int indexOfElement = -1;

        int start_ind = 0;
        int end_ind = array.length - 1;

        while (start_ind <= end_ind)
        {
            int mid = (start_ind + end_ind) / 2;

            if (array[mid] == numberToFind)
                return mid;

            if (array[mid] < numberToFind)
                start_ind = mid + 1;
            else
                end_ind = mid - 1;
        }

        return indexOfElement;
    }

    public static int InterpolationSearch(int[] array, int numberToFind)
    {
        int start_ind = 0;
        int end_ind = array.length - 1;

        while (array[start_ind] < numberToFind && numberToFind < array[end_ind] && array[start_ind] != array[end_ind])
        {
            int mid = start_ind + (numberToFind - array[start_ind]) * (end_ind - start_ind) / (array[end_ind] - array[start_ind]);

            if (array[mid] < numberToFind)
                start_ind = mid + 1;
            else
                if (array[mid] > numberToFind)
                end_ind = mid - 1;
            else
                if (array[mid] == numberToFind)
                return mid;
        }

        if (array[start_ind] == numberToFind)
            return start_ind;

        if (array[end_ind] == numberToFind)
            return end_ind;

        return -1;
    }

    public static int LinearSearch(int[] array, int numberToFind)
    {
        for (int i = 0; i < array.length; i++)
            if (array[i] == numberToFind)
                return i;

        return -1;
    }
}
