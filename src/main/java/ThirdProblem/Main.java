package ThirdProblem;

public class Main {
    /*
        Write a recursive function that computes and returns the sum of all elements in an array, where the array and its size are given as parameters.
        return the sum of all elements in a[]
        int findsum(int a[], int n)
    *
    *
    * */
    public static void main(String[] args) {
        int array [] = {20,10,5};
        System.out.println(findSum(array,2));
    }
    public static int findSum(int array[], int size){
        if (size == 0) return array[0];
        int sum = array[size] + findSum(array, size-1);
        return sum;
    }
}
