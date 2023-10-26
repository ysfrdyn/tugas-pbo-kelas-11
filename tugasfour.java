
package tugas4;

import java.util.Scanner;

public class tugasfour {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        
        System.out.println("Panggil nama siswa : ");
        nama = input.next();
            switch (nama) {
                case "steven":
                   System.out.println("Steven hadir bu");
                   break;
                case "yusuf":
                   System.out.println("Yusuf hadir bu");
                   break;
                case "thoriq":
                   System.out.println("Thoriq hadir bu");
                   break;
                default:
                    System.out.println("lagi ngopi bu");
            }
    }
}