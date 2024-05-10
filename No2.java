/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class No2 {
  
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] arraybaru = mergeArrays(array1, array2);

        // Cetak array hasil penggabungan
        for (int i = 0; i < arraybaru.length; i++) {
            System.out.print(arraybaru[i] + " ");
        }
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        // Menghitung panjang array baru
        int mergedLength = array1.length + array2.length;

        // Membuat array baru dengan panjang yang sudah dihitung
        int[] mergedArray = new int[mergedLength];

        // Menyalin elemen array pertama ke array baru
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // Menyalin elemen array kedua ke array baru, dimulai dari indeks setelah array pertama
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        return mergedArray;
        
    }
}
