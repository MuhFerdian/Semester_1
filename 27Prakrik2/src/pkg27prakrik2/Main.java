/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg27prakrik2;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Pilih menu:");
            System.out.println("1. Tambah matriks");
            System.out.println("2. Kurang matriks");
            System.out.println("3. Nilai maksimum baris");
            System.out.println("4. Keluar");
            System.out.print("Pilih (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tambahMatriks(scanner);
                    break;
                case 2:
                    kurangMatriks(scanner);
                    break;
                case 3:
                    nilaiMaksimumBaris(scanner);
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void tambahMatriks(Scanner scanner) {
        System.out.print("Masukkan ukuran matriks (n x n): ");
        int n = scanner.nextInt();
        int[][] matriksA = new int[n][n];
        int[][] matriksB = new int[n][n];
        int[][] hasil = new int[n][n];

        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        System.out.println("Hasil penjumlahan matriks:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void kurangMatriks(Scanner scanner) {
        System.out.print("Masukkan ukuran matriks (n x n): ");
        int n = scanner.nextInt();
        int[][] matriksA = new int[n][n];
        int[][] matriksB = new int[n][n];
        int[][] hasil = new int[n][n];

        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = matriksA[i][j] - matriksB[i][j];
            }
        }

        System.out.println("Hasil pengurangan matriks:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void nilaiMaksimumBaris(Scanner scanner) {
        System.out.print("Masukkan ukuran matriks (n x n): ");
        int n = scanner.nextInt();
        int[][] matriks = new int[n][n];

        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriks[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int max = matriks[i][0];
            for (int j = 1; j < n; j++) {
                if (matriks[i][j] > max) {
                    max = matriks[i][j];
                }
            }
            System.out.println("Nilai maksimum baris " + (i + 1) + ": " + max);
        }
    }
}