import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=0,n2=1,temp=1;

        System.out.println("Numeros a generar en la sucesion:");
        int x=sc.nextInt();

        System.out.println("\n-------SUCECION-------");
        System.out.print(+n1+" ");
        for(int i = 1; i < x ; i++){
            System.out.print(temp+" ");
            temp = n1+n2;
            n1 = n2;
            n2 = temp;
        }
    }
}
