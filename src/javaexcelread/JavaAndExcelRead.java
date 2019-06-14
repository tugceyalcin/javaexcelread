package javaexcelread;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class JavaAndExcelRead {
    private String DosyaYolu;
    public JavaAndExcelRead(){
        //Boş kurucu ...
    }
    //Okuyacağımız excel dosyasının yolunu veriyoruz.
    public void setExcelDosyaYolu(String DosyaYolum){
        this.DosyaYolu=DosyaYolum;
    }
    //Excelden okuma işlemi yapacak olan metod.
    public void ExceldenOku() throws IOException, BiffException{
        //Verilen dosya yoluna göre bir dosya oluşturuyor.
        File DosyaExcel=new File(this.DosyaYolu);
        //Excel 'den calisma kitabını alıyoruz.
        Workbook CalismaKitabi=Workbook.getWorkbook(DosyaExcel);
        //Aldığımız çalışma kitabı yani çalışma alanından ilk excel sayfasını alıyoruz.
        Sheet ExcelSayfasi=CalismaKitabi.getSheet(0);
        //Aldığımız sayfadaki excel hücrelerini for döngüsü içinde okuyacağız.
        for(int j=0; j<ExcelSayfasi.getColumns(); j++){//excel sayfasının sütunlarının sayısına kadar
            for(int i=0; i<ExcelSayfasi.getRows(); i++){//excel sayfasının satırlarının sayısına kadar.
                Cell Hucre=ExcelSayfasi.getCell(j, i);//Bir hücre oluştur.Bu hücreyi excel sayfasından al.
                System.out.println(i+" . satir degeri : "+Hucre.getContents());//Aldığın hücrenin içeriğini yazdır.
            }
            System.out.println();
        }
        //okuma işlemi bitti diye ekrana mesaj ver.
        System.out.println("Excel sayfasindan okuma islemi bitti !");
    }
}