import java.io.FileInputStream;
import java.io.IOException;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;

public class PortTool {



  private static void main(String[] args) {

    // holds amount of files in the staging area
    int filesWaiting = 0;
    // holds the path to where the data is being stored
    String pathToData = "";

    // check if their is anything to import
    if(filesWaiting > 0 ) {
      exportFiles(pathToData);
    } else {
      System.out.println("Found no files to");
    }

  }

  // void -> void
  // goes through the specificed directory and prints out any
  // documents to the PaperPort tool;
  private static void exportFiles(String path) {
    PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
    pras.add(new Copies(1));
    PrintService pss[] = PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.GIF, pras);
    if (pss.length == 0)
      throw new RuntimeException("No printer services available.");
    for (int i = 0; i < pss.length; i++) {
      System.out.println(pss[i]);
    }
    PrintService ps = pss[0];
    System.out.println("Printing to " + ps);
    DocPrintJob job = ps.createPrintJob();
    FileInputStream fin = new FileInputStream("/Users/struh/Pictures/error.PNG");
    Doc doc = new SimpleDoc(fin, DocFlavor.INPUT_STREAM.GIF, null);
    job.print(doc, pras);
    fin.close();
  }


}
