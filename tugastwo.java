/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

public class tugastwo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double r, luas, keliling;
        
        System.out.println("Masukan Jari-Jari : ");
        r = input.nextInt();
        
        luas = 3.14 * r * r;
        keliling = 2 * r * 3.14;
        
        System.out.println("Keliling :"+keliling);
        System.out.println("Luas :"+luas);
    }
}
