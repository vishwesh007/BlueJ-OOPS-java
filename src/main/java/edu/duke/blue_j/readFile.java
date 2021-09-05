package edu.duke.blue_j;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class readFile {

public String path ="";
public String message="" ;
 

private void fileReader(){
  

try{
  File f = new File(path);
  Scanner read = new Scanner(f);
  while (read.hasNextLine()){
    String data = read.nextLine();
    message = message+data;
    }
    
    read.close();
  }catch(FileNotFoundException e){
    
    System.out.println("file not found exception");
    
    e.printStackTrace();
  }
  
  
}


public void start(){
  
  fileReader();
}

}
