package pbo2.pkg10117065.hackanton1;

import java.util.Scanner;

public class PBO210117065Hackanton1 {

    public static void main(String[] args) {
        String status;
        double tunj;
        double gaji;
        double gatot;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("********Program Tunjangan********");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp.");
        gaji = scn.nextDouble();
        System.out.print("Status Anda? (menikah/belum) :");
        status = scn.next();
        
        if (status.equals("menikah")) {
            tunj=0.35*gaji;
        }else 
            tunj=0;

        gatot = gaji+tunj;
        
        System.out.println("");
        System.out.println("********Hasil Perhitungan********");
        System.out.println("Gaji Pokok\t : Rp "+gaji);
        System.out.println("Tunjangan\t : Rp "+tunj);
        System.out.println("Total gaji\t : Rp "+gatot);
        System.out.println("Developed by: Teguh Siswanto");
        
    }
    
}
