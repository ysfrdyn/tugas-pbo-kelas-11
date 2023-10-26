/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

public class tugasthree {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int bin, mtk, pbo, bd, ppl;
        
        System.out.println("Masukan nilai BIN : ");
        bin = input.nextInt();
        System.out.println("Masukan nilai MTK : ");
        mtk = input.nextInt();
        System.out.println("Masukan nilai PBO : ");
        pbo = input.nextInt();
        System.out.println("Masukan nilai BD : ");
        bd = input.nextInt();
        System.out.println("Masukan nilai PPL : ");
        ppl = input.nextInt();
        
        int rr = (bin + mtk + pbo + bd + ppl)/5;
            System.out.println("Nilai Rata-Rata : "+rr);
        
        if (rr >= 85 && rr >= 100){
            System.out.println("Keterangan : LULUS!");
        } else if (rr <= 85){
            System.out.println("Keterangan : TIDAK LULUS!");
        } else {
            System.out.println("Keterangan : TIDAK LULUS!");
        }
    }
}
