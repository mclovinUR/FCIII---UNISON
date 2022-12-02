import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = 0;
        int t2 = 1;
        int temp = 0;

        System.out.println("Numeros a generar de la Sucesión:");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            temp = t1;
            t1 = t2;
            t2 += temp;
            System.out.print(t2+" ");
        }
    }
}