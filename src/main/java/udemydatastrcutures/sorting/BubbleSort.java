package main.java.udemydatastrcutures.sorting;

public class BubbleSort {
    public static void main(String[] args) {

    }
    public void bubbleSort(int[] array){
        for(int i=array.length -1;i >0;i--){
            for(int j=0;j< i;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=i+1;i<arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i!= minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
