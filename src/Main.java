/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcelread;
import java.io.IOException;

import javaexcelread.JavaAndExcelRead;
import jxl.read.biff.BiffException;
public class Main {
    public static void main(String[] args) throws IOException, BiffException {
        JavaAndExcelRead ExcelReader=new JavaAndExcelRead();
        ExcelReader.setExcelDosyaYolu( "C:\\Users\\htr\\Desktop\\Yerel Disk (C_)\\Kitap11.xls" );
        ExcelReader.ExceldenOku();
    }
}
