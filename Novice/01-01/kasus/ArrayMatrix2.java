import java.util.Scanner;

public class ArrayMatrix2{

    public static void main(String[] args) {
        int baris, kolom, i, j;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Ordo Matrix");
        System.out.println("===================================");
        System.out.print("Masukkan Jumlah baris : ");
        baris = sc.nextInt();
        System.out.print("Masukkan Jumlah Kolom : ");
        kolom = sc.nextInt();

        int A[][] = new int[baris][kolom];
        int B[][] = new int[baris][kolom];
        int sum[][]= new int[baris][kolom];

        System.out.println("\n Masukkan elemen untuk Matrix A : ");
        System.out.println("==================================");
        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++){
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "] :");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n Masukkan elemen untuk Matriks B");
        System.out.println("===================================");
        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++){
                System.out.print("["+(i+1)+ "]["+(j+1)+ "]:");
                B[i][j] = sc.nextInt();
            }
        }

        // Penjumlahan Matrix
        for (i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++){
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("\n Penjumlahan Matrix");
        System.out.println("==================================");
        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++){
                System.out.print(sum[i][j]+"\t");
            }
        System.out.println();
        }
    }
}