import java.util.*;

public class multi_matriz_bi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1[][] = new int[3][2];
        int m2[][] = new int[2][3]; 
        int mr[][] = new int[3][3];

        System.out.println("-------------LLENADO DE MATRIZ 1-------------");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println("Valor de MATRIZ 1["+i+"]["+j+"]:");
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n-------------LLENADO DE MATRIZ 2-------------");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("Valor de MATRIZ 2["+i+"]["+j+"]:");
                m2[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n-------------IMPRESION-------------");
        System.out.println("MATRIZ 1:");
        for (int i=0;i<m1.length;i++) {
            for (int j=0;j<m1[i].length;j++) {
                System.out.print(m1[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("\nMATRIZ 2:");
        for (int i=0;i<m2.length;i++) {
            for (int j=0;j<m2[i].length;j++) {
                System.out.print(m2[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("\n-------------MATRIZ RESULTANTE-------------");
        mr[0][0] = m1[0][0]*m2[0][0]+m1[0][1]*m2[1][0];
        mr[0][1] = m1[0][0]*m2[0][1]+m1[0][1]*m2[1][1];
        mr[0][2] = m1[0][0]*m2[0][2]+m1[0][1]*m2[1][2];
        mr[1][0] = m1[1][0]*m2[0][0]+m1[1][1]*m2[1][0];
        mr[1][1] = m1[1][0]*m2[0][1]+m1[1][1]*m2[1][1];
        mr[1][2] = m1[1][0]*m2[0][2]+m1[1][1]*m2[1][2];
        mr[2][0] = m1[2][0]*m2[0][0]+m1[2][1]*m2[1][0];
        mr[2][1] = m1[2][0]*m2[0][1]+m1[2][1]*m2[1][1];
        mr[2][2] = m1[2][0]*m2[0][2]+m1[2][1]*m2[1][2];

        for (int i=0;i<mr.length;i++) {
            for (int j=0;j<mr[i].length;j++) {
                System.out.print(mr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
