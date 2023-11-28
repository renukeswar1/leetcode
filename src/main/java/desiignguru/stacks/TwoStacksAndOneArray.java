package main.java.desiignguru.stacks;

//This program is to give memory efficiency of array by having 2 pointers in array
public class TwoStacksAndOneArray {
    int size;
    int top1,top2;
    int array[];
    TwoStacksAndOneArray(int n){
        array = new int[n];
        size = n;
        top1 = -1;
        top2= size;
    }
    public static void main(String[] args) {

    }
    public void push1(int x){
        if(top1 < top2-1){
            top1++;
            array[top1] = x;
        }else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    public void push2(int x){
        if(top1 < top2-1){
            top2--;
            array[top2] = x;
        }else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    public int pop1(){
        if(top1 >= 0) {
            int ele = array[top1];
            top1--;
            return ele;
        }
        return 0;
    }
    public int pop2(){
        if(top2 < size) {
            int ele = array[top2];
            top2++;
            return ele;
        }
        return 0;
    }
}
