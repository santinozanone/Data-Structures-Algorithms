package SecondProblem;

public class Main {
    /*
        Write a recursive function that finds and returns the minimum element in an array, where the array and its size are given as parameters.
        return the minimum element in a[]
        int findmin(int a[], int n)
    */
    public static void main(String[] args) {
        int array [] = {10,5,20,30};
        System.out.println(findMin(array,3));
    }
    public static int findMin(int array[], int size){

        if (size == 0){
           // System.out.println(array[0]);
            return  array[0];
        }
        System.out.println("comp " + array[size] + " " + array[size-1]);
        //return Math.min(array[size-1],array[size]);
        return Math.min(array[size],findMin(array, size-1));
    }
}
