/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws2.tugaskedua;

/**
 *
 * @author DELL
 */
public class ProsesData {
    public Double harga(String hargabrg){
        Double hrg = Double.valueOf(hargabrg);
        return hrg;}
    
    public Double jumlah(String jumlahbrg){
        Double jml= Double.valueOf(jumlahbrg);
        return jml;}
    
    public Double jumlahbyr(Double hargabrg, Double jumlahbrg){
        Double bayar1 = hargabrg * jumlahbrg;
        return bayar1;}
    
    public String Diskon (Double bayar1){
        String Diskon = null;
        if (bayar1 < 10000){
            Diskon = "0";}
        else if (bayar1 < 50000){
            Diskon = "5";}
        else{
            Diskon = "10";}
        return Diskon;
        }
    
    
}
