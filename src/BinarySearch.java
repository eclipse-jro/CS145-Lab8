////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// AUTHOR   |   J. Rene Ortega Jr.
// PROJECT  |   CS145 Lab7
// DATE     |   March 8th, 2019
// FILE     |   BinarySearch.java takes in an ordered integer array and recursively searches for the target.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// Not sure about lowbound and high bound relationship recursively, or if need to
// update lowbound and high bound before they are passed(probs do).


public class BinarySearch {
    public int search(int[] intsForSearch, int highIndex, int lowIndex, int target) {
        // highIndex - the maximum index of the part of the array being searched
        // lowIndex - the minimum index of the part of the array being searched
        // target - the value being searched for

        int result = -1;

        // logic for an array with even number of elements
        if (intsForSearch.length % 2 == 0) {
            // look in both "middles"
            int middleIndex1 = (highIndex + lowIndex)/2;
            int middleIndex2 = middleIndex1 + 1;

            // return the middle index values if either equal the target
            if (intsForSearch[middleIndex1] == target) {
                return middleIndex1;
            }
            else if (intsForSearch[middleIndex2] == target){
                return middleIndex2;
            }

            // logic to decide to search in the first or second half of the list next
            if (intsForSearch[middleIndex1] > target || intsForSearch[middleIndex2] > target) {
                // search first half of the list
                result = search(intsForSearch, highIndex, lowIndex, target);
            }
            else {
                // search second half of the list
                result = search(intsForSearch, highIndex, highIndex, target);
            }
        }

        // logic for an array with an odd number of elements
        else if (intsForSearch.length % 2 != 0) {
            // look in the middle
            int middleIndex = (highIndex + lowIndex) / 2;

            // return the middle index value if it equals the target
            if (intsForSearch[middleIndex] == target) {
                return middleIndex;
            }

            // logic to decide to search in the first or second half of the list next
            if (intsForSearch[middleIndex] > target) {
                // search first half of the list
                int recurHigh = 3;
                int recurLow = 0;
                result = search(intsForSearch, highIndex / 2 - 1, lowIndex, target);
            }
            else {
                // search second half of the list
                int recurHigh = 8;
                int recurLow = 4;
                result = search(intsForSearch, highIndex, highIndex / 2 - 1, target);
            }
        }
        else {return -1;}
        return result;
    }
}
