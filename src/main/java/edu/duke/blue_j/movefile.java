package edu.duke.blue_j;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class movefile {
String path ="";
String newpath ="";



public void fileMove1(){
  try{
  Path temp =Files.move(Paths.get(path),Paths.get(newpath));
  
  if(temp != null){
    //also support rename
    System.out.println("moved files success");
    
    
  }else{
    
    System.out.println("move failed");
    
  }
  
  }catch (IOException e)
  {
    
    System.out.println("error occurred!");
    e.printStackTrace();
    
    
  }
  
  
}

public void fileMove(){
 /* 
  File f = new File(path);
  if(f.exists()){
  
    f.delete();
    System.out.println("move file success");
  }
 else{
  System.out.println("move failed");
  }*/
}


public void start(){
  
  fileMove1();
  
  
}


}

