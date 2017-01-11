import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GreatXOR {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();
            // your code goes here
            int count = 0;
            for(int i = 1; i < x; i++){
                if((x^i) > x){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
