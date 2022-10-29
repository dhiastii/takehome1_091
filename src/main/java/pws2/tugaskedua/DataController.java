/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws2.tugaskedua;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author DELL
 */
@Controller
public class DataController {
    @RequestMapping("/input")
    //@ResponseBody
    public String inputan(HttpServletRequest data, Model barang){
        ProsesData pd = new ProsesData();
        
        String namabrg = data.getParameter("namabrg");
        String jumlahbrg = data.getParameter("jumlahbrg");
        String hargabrg = data.getParameter("hargabrg");
        
        Double harga = pd.hrg(hargabrg);
        Double jumlah = pd.jml(jumlahbrg);
        Double jumlahbayar = pd.bayar1(harga, jumlah);
        String diskonn = pd.diskon(harga);
        Double jumlahdiskon = pd.jmldiskon(harga, Integer.parseInt(diskonn));
        Double totalbayar = pd.totalbyr(jumlahbayar, jumlahdiskon);
        pd.HasilDiskon(totalbayar, jumlahbayar, jumlahdiskon, Integer.SIZE);
        
        barang.addAttribute("namabarang", namabrg);
        barang.addAttribute("hargabarang", hargabrg);
        barang.addAttribute("jumlahbarang", jumlahbrg);
        barang.addAttribute("diskon", diskonn);
        barang.addAttribute("jumlahdiskon", jumlahdiskon);
        barang.addAttribute("totalbayar", totalbayar);
        
        return "show";
    }
}
