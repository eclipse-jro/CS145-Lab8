////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// AUTHOR   |   J. Rene Ortega Jr.
// PROJECT  |   CS145 Lab8
// DATE     |   March 14th, 2019
// FILE     |   BinarySearch.java takes in an ordered integer array and recursively searches for the target.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class BinarySearch {
    public int search(int[] intsForSearch, int highIndex, int lowIndex, int target) {
        // highIndex - the maximum index of the part of the array being searched
        // lowIndex - the minimum index of the part of the array being searched
        // target - the value being searched for

        int result = -1;

        // How "middleIndex" is defined
        int middleIndex = (highIndex + lowIndex)/2;

        // return the middle index value if it equals the target
        if (intsForSearch[middleIndex] == target) {
            return intsForSearch[middleIndex];
        }

        // logic to decide to search in the first or second half of the list next
        if (intsForSearch[middleIndex] > target) {
            // search first half of the list
            result = search(intsForSearch, lowIndex, middleIndex - 1, target);
        }
        else {
            // search second half of the list
            result = search(intsForSearch, middleIndex + 1, highIndex, target);
        }

    return result;
    }
}
