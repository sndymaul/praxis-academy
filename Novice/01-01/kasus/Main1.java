import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        int baris, kolom, i, j;
        Scanner in = new Scanner(System.in);

        System.out.println("Masukan Ordo Matriks");
        System.out.println("=======================");
        System.out.print("Masukan Jumlah Baris :"); baris = in.nextInt();
        System.out.print("Masukan Jumlah Kolom :"); kolom = in.nextInt();

        int A[][] = new int[baris][kolom];
        int B[][] = new int[baris][kolom];
        int sum[][] = new int[baris][kolom];

        System.out.println("\nMasukkan elemenuntuk Matriks B");
        System.out.println("========================");
        for(i = 0 ; i < baris ; i++ )
        {
            for ( j = 0 ; j < kolom ; j++ )
            {
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]:");
                B[i][j] = in.nextInt();
            }
        }

        //Penjumlahan Matriks 
        for ( i =0 ; i < baris ; i++)
        {
            for ( j = 0 ; j < kolom ; j++ )
            {

            }

            System.out.println("\nHasil Penjumlahan Matriks");
            System.out.println("=====================");
            for ( i = 0 ; i < baris ; i++ )
            {
                for ( j = 0 ; j < kolom ; j++ )
                {
                    sum[i][j] = A[i][j]+B[i][j];
                    System.out.print(sum[i][j]+"\t");
                }

                System.out.println();
            }
        }
    }        
}
    