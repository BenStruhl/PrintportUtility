import java.util.*;
import java.awt.print.*;

public class PortTool {



  private static void main(String[] args) {

    // holds amount of files in the staging area
    int filesWaiting = 0;
    // holds the path to where the data is being stored
    String pathToData = "";

    // check if their is anything to import
    if(filesWaitng > 0 ) {
      exportFiles(pathToData);
    } else {
      System.out.println("Found no files to");
    }

  }

  // void -> void
  // goes through the specificed directory and prints out any
  // documents to the PaperPort tool;
  private static void exportFiles(String path) {
    System.out.println("test");
  }


}
