import java.util.*;

public class javaWorstcaseExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =  sc.nextInt();
        int m =  sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Hello");
        }

        for(int i=0; i<m; i++){
            System.out.println("Hello");
            sc.close();
        }
    }
}
