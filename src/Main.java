////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// AUTHOR   |   J. Rene Ortega Jr.
// PROJECT  |   CS145 Lab7
// DATE     |   March 8th, 2019
// FILE     |   Main.java creates an instance of both StarPower && BinarySearch classes and executes their methods.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Main {
    public static void main(String[] args){
        //StarPower recursion = new StarPower();
        //recursion.print(3);

        BinarySearch intArray = new BinarySearch();
        int[] testArray = {1, 3, 4, 5, 7, 8, 10, 13, 14};
        int result = intArray.search(testArray,8,0,100);
        System.out.println(result);
    }
}
