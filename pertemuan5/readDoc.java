/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

/**
 *
 * @author Wildan
 */
public class readDoc {

    public static void main(String[] args) {

        try {
            File filenya = new File("testdoc.doc");
            WordExtractor extractor = null;
            FileInputStream fis = new FileInputStream(filenya.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String fileText = extractor.getText();
            System.out.println(fileText);
        } catch (Exception exep) {
            exep.printStackTrace();
        }
    }
}
