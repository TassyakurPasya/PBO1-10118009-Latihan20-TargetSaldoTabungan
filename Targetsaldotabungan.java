/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Lenovo
 * Nama  : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 * Diskripsi Program : Target Saldo Tabungan
 */
public class Targetsaldotabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double bunga;
        double saldo = 3500000;
        
        DecimalFormat rp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols fRp = new DecimalFormatSymbols();
        fRp.setCurrencySymbol("Rp. ");
        fRp.setMonetaryDecimalSeparator(',');
        fRp.setGroupingSeparator('.');
        rp.setDecimalFormatSymbols(fRp);
        
        for (int i = 1;i <= 12; i++){
            bunga = saldo*0.08;
            saldo += bunga;
            
            if (saldo <= 6500000){
                System.out.printf("Saldo di Bulan ke- "+i+" %s%n",rp.format(saldo)); 
                   
            }
        }
    }
    
}
