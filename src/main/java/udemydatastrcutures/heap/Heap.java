package main.java.udemydatastrcutures.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;
    Heap(List<Integer> heap){
        this.heap = heap;
    }
    public List<Integer> getHeap(){
        return  new ArrayList<>(heap);
    }
    private int leftChild(int index){
        return 2 * index +1;
    }
    private int rightChild(int index){
        return 2 * index + 2;
    }
    private int parent(int index){
        return (index -1)/2;
    }
    public void swap(int index1 , int index2){
        int val  = heap.get(index1);
        heap.set(index1,heap.get(index2));
        heap.set(index2,val);
    }
    public void insert(int value){
        heap.add(value);
        int current = heap.size() - 1;

        while(current > 0 && heap.get(current) > heap.get(parent(current))){
            swap(current,parent(current));
            current = parent(current);
        }
    }
    public Integer remove(){
        if(heap.size() == 0){
            return null;
        }
        if(heap.size() ==1){
            return heap.remove(0);
        }
        int maxValue = heap.get(0);
        heap.set(0,heap.get(heap.size() -1));
        sinkDown(0);
        return maxValue;

    }

    private void sinkDown(int i) {
        int maxIndex = i;
        while (true){
            int leftIndex = leftChild(i);
            int rightIndex = rightChild(i);
            while(leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)){
                maxIndex = leftIndex;
            }
            while (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)){
                maxIndex = rightIndex;
            }
            if(maxIndex != i){
                swap(i, maxIndex);
                i = maxIndex;
            }else{
                return;
            }
        }
    }
}
