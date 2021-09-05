package edu.duke.blue_j;

import java.io.FileWriter;
import java.io.IOException;


public class filewrite {

String path ="";
String message="";


public void writeFile(){
  try{
  FileWriter f = new FileWriter(path);
 f.write(message);
 f.close();
 System.out.println("Successfully written to file "+path);
 }catch (IOException e){
   
   
   System.out.println("write error");
   e.printStackTrace();
 }
  
}

public void start(){
  
  writeFile();
}
}
