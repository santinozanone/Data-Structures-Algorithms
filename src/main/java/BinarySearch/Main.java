package BinarySearch;

import java.lang.reflect.Array;

public class Main {
    // Implementing a recursive Binary Search from scratch
    public static void main(String[] args) {
        int array [] = {10,20,30,40};
        System.out.println(binarySearch2(array, 40,0,array.length-1));
    }

    public static int binarySearch(int array[],int numberToFind, int mid){

        if (array[mid] == numberToFind){
            return mid;
        }
        if (mid == array.length-1){ // this is wrong xd
            return -1;
        }

        if (array[mid] > numberToFind){
            mid = mid/2;

        }
        else {
            int positionsLeft = (array.length-1)-mid;
            if (positionsLeft>1) mid = mid + (positionsLeft/2);
            else mid = mid + positionsLeft;
        }
        return  binarySearch(array, numberToFind,mid);
    }

    public static int binarySearch2(int array[],int numberToFind, int low,int high){
        int mid = low +((high-low)/2);

        if ( low > high  ){
            return -1;
        }

        if (array[mid] == numberToFind){
            return mid;
        }


        if (array[mid] > numberToFind){
            return  binarySearch2(array, numberToFind,low,mid-1);
        }

        else {
            return  binarySearch2(array, numberToFind,mid +1 ,high);
        }

    }
}
