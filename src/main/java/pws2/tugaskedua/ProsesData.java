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
    public Double hrg(String hargabrg){
        Double hrg = Double.valueOf(hargabrg);
        return hrg;}
    
    public Double jml(String jumlahbrg){
        Double jml= Double.valueOf(jumlahbrg);
        return jml;}
    
    public Double bayar1(Double hargabrg, Double jumlahbrg){
        Double bayar1 = hargabrg * jumlahbrg;
        return bayar1;}
    
    public String diskon (Double bayar1){
        String diskon = null;
        if (bayar1 < 10000){
            diskon = "0";}
        else if (bayar1 < 50000){
            diskon = "5";}
        else{
            diskon = "10";}
        return diskon;}
           
    public Double jmldiskon(Double bayar1, Integer diskon){
        Double jmldiskon = bayar1 * diskon/100;
        return jmldiskon;}
        
    
}
