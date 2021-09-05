package edu.duke.blue_j;

import edu.duke.blue_j.*;
import edu.duke.blue_j.Createfolder;
import edu.duke.blue_j.DeleteFile;
import edu.duke.blue_j.fileCreation;
import edu.duke.blue_j.fileoperations;
import edu.duke.blue_j.filewrite;
import edu.duke.blue_j.movefile;
import edu.duke.blue_j.renameFile;


public class fileoperations {
public String path ="/storage/emulated/0/#Playground/fly/rasta/hi/as/";
public String newpath ="/storage/emulated/0/#Playground/sasta/";
public String message =" sasta pasta😁🤗😔😁😣😁";

public String dirname ="fly";
public String filename ="apta.txt";
public String newfilename ="apta.txt";

public fileoperations(String path){
  
  this.path =path;
  
}

public fileoperations(){
  
  this.path =path;
  
}



public static void main(String[] args){
  
  fileoperations fo = new fileoperations();
/*  fo.newFile();
 fo.mkdir();
  fo.writeFile();
  fo.readFile();*/

 String operation ="moveFile";
 fo.operation(operation);
 
}

public void operation(String fn){
  fn =fn.toLowerCase();
  switch (fn){
    
    case "newfile":
   newFile();
   break ;
   case  "mkdir":
   mkdir();
   break;
   case  "writefile":
   writeFile();
   break;
   case  "readfile":
   readFile();
   break;
   case  "deletefile":
   deleteFile();
    break ;
    case "renamefile":
    renameFile();
    break ;
    case "movefile":
    moveFile();
    break ;
    case "movenrename":
    moveNrenameFile();
    break ;
    case "copyfile":
    copyFile();
    break ;
    
  }
  
  
  
}


public void copyFile(){
 
  
  
}

public void renameFile(){
  
  renameFile rf = new renameFile();
  
  
  
  rf.path =this.path+filename;
  rf.path2 = this.path+newfilename;
  rf.start();
  
  
  
}

public void moveNrenameFile(){
  
  movefile mf = new movefile();
  mf.path =this.path+filename;
  mf.newpath=this.newpath+newfilename;
  mf.start();
  
}
public void moveFile(){
  
  movefile mf = new movefile();
  mf.path =this.path+filename;
  mf.newpath=this.newpath+filename;
  mf.start();
  
}



public void deleteFile(){
  
  String s =this.path+filename;
  DeleteFile df = new DeleteFile();
  df.path =s;
  df.start();
  
}




public void newFile(){
  
  String s =this.path+filename;
  fileCreation fc = new fileCreation();
  
  fc.start(s);
  }
  
  
  
  public void mkdir(){
    
    String s = path+dirname;
    Createfolder cf = new Createfolder();
    cf.path =s;
    cf.start();
  }
  
  
  public void writeFile(){
    
   
   
    filewrite fw = new filewrite();
    path =this.path+filename;
    fw.path =path;
    fw.message = this.message;
    fw.start();
  }
  
  public void readFile(){
    
    readFile fw = new readFile();
    path =this.path+filename;
    fw.path =path;
    
    fw.start();
    this.message = fw.message;
    System.out.println(this.message);
  }
  
  
  
}



