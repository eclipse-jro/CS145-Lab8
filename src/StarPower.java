/**
 * Created by ortegaj2 on 3/8/19.
 */
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
