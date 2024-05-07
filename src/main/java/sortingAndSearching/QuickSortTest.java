package main.java.sortingAndSearching;

public class QuickSortTest {
    static void quicksort(int[] num, int i, int j)
    {
        int pivot_index = partition(num, i, j);

        //if 'i' is less than pivot_index-1,
        //then the element(s) at left are to be sorted
        if(i < pivot_index-1)
        {
            quicksort(num, i, pivot_index-1);
        }

        //if 'j' is greater than pivot_index-1,
        //then the element(s) at right are to be sorted
        if(pivot_index < j)
        {
            quicksort(num, pivot_index, j);
        }

    }
    static int partition(int[] num, int i, int j)
    {
        // i -> pointer on the leftmost element (for smaller elements)
        // j -> pointer on the rightmost element (for greater elements)

        //taking pivot at the middle of the array
        int pivot = num[(i+j)/2];


        while(i < j)
        {
            //The pointer 'i' moves ahead till num[i] < pivot,
            //it stops at when num[i] >= pivot
            while(num[i] < pivot)
            {
                i++;
            }

            //The pointer 'j' moves back till num[j] > pivot,
            //it stops at when num[j] <= pivot
            while(pivot < num[j])
            {
                j--;
            }

            //When i<=j holds true, the elements will be swapped
            if(i <= j)
            {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;

                //Now, the pointers will be moved to their next position
                i++;
                j--;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] num = {27, 23, 11, 7, 9, 17, 6};
        //Printing unsorted elements
        System.out.println("Unsorted array:");
        for(int i: num)
        {
            System.out.print(i + " ");
        }
        //Calling quicksort method to sort the elements
        quicksort(num, 0, num.length-1);
        //Printing sorted elements
        System.out.println("\nSorted array:");
        for(int i: num)
        {
            System.out.print(i + " ");
        }
    }
}
