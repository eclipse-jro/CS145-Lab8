////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// AUTHOR   |   J. Rene Ortega Jr.
// PROJECT  |   CS145 Lab8
// DATE     |   March 14th, 2019
// FILE     |   BinarySearch.java takes in an ordered integer array and recursively searches for the target.
//          |   Returns -1 if target is not found.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class BinarySearch {
    // highIndex - the maximum index of the part of the array being searched
    // lowIndex - the minimum index of the part of the array being searched
    // target - the value being searched for
    public int search(int[] intsForSearch, int highIndex, int lowIndex, int target) {

        int result = -1;

        // How "middleIndex" is defined
        int middleIndex = (int)((highIndex + lowIndex)/2);

        // return the middle index value if it equals the target
        if (intsForSearch[middleIndex] == target) {
            return middleIndex;
        }
        else {
            // logic to decide to search in the first or second half of the list next
            if (intsForSearch[middleIndex] > target) {

                // if target is less than the value at the lowIndex then return -1
                if (intsForSearch[lowIndex] > target) {
                    return result;
                }

                // search first half of the list
                result = search(intsForSearch, middleIndex - 1, lowIndex, target);
            } else if (intsForSearch[middleIndex] < target) {

                // if target is more than the value at the highIndex then return -1
                if (intsForSearch[highIndex] < target) {
                    return result;
                }

                // search second half of the list
                result = search(intsForSearch, highIndex, middleIndex + 1, target);
            }
        }

    return result;
    }
}
