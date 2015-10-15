package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;


public class AddLineNumber {
   public static void main(String[] args) throws IOException {
      try {
    	  BufferedReader inputStream = 
    			  new BufferedReader(new FileReader("C:/Users/Public/original.txt"));
    	  PrintWriter outputStream = 
    			  new PrintWriter(new FileOutputStream("C:/Users/Public/numbered.txt"));
    	  int i = 0;
    	  while(true) {
    		  String str = inputStream.readLine();
    		  if(str == null)
    			  break;
    		  i++;
    		  System.out.println(i +" "+ str);
    		  outputStream.println( i + " " +str);
    		  }
    	  inputStream.close( );
    	  outputStream.close( );
      }
      catch(Exception e) {
    	  e.printStackTrace();  
       }
   }
}