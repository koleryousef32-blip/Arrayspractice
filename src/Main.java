import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int [] numbers = {20,10,40,30,50};
       for (int i=0;i<numbers.length;i++){
           Arrays.sort(numbers) ;
           System.out.println(numbers[i]);
       }

//        System.out.println(Arrays.toString(numbers));
    }
}
