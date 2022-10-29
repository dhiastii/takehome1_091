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
    
    
}
