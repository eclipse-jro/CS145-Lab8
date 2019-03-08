////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// AUTHOR   |   J. Rene Ortega Jr.
// PROJECT  |   CS145 Lab7
// DATE     |   March 8th, 2019
// FILE     |   StarPower.java demonstrates recursion (a method calling itself); has efficient applications.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class StarPower {
    public void print(int n){

        if (n == 0){
            System.out.print("*");
        }
        else {
            print(n - 1);
            print(n - 1);
        }
    }
}
