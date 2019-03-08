/**
 * Created by ortegaj2 on 3/8/19.
 */
public class Main {
    public static void main(String[] args){
        //StarPower recursion = new StarPower();
        //recursion.print(3);

        BinarySearch intArray = new BinarySearch();
        int[] testArray = {1, 3, 4, 5, 7, 8, 10, 13, 14};
        int result = intArray.search(testArray,8,0,7);
        System.out.println(result);
    }
}
