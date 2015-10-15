package kr.ac.kookmin.exception.intro;

import java.util.*;
import java.io.*;

public class FileRead {
   public static void main(String args[]) {
      Trade a = new Trade();
      a.readFile();
   }
}

class Trade {
   public void readFile() {
      try {
    	  FileInputStream fis = new FileInputStream("C:/Users/Public/a.txt");
    	  Scanner s = new Scanner(fis);
    	  while(s.hasNext()) {
    		  System.out.println(s.nextLine());
         }
      }
      catch(Exception e) {
    	  e.printStackTrace();
      }
   }
}