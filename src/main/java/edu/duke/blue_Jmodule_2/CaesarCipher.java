package edu.duke.blue_Jmodule_2;

import edu.duke.FileResource;
import edu.duke.blue_Jmodule_2.CaesarCipher;
import edu.duke.blue_Jmodule_2.UsefulMethods;
import java.security.AlgorithmConstraints;




public class CaesarCipher {


public String CaesarCipher1(String input , int key){
  
 StringBuilder encrypted = new StringBuilder(input);
 
 String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 String Shiftalpha = Alphabet.substring(key)+Alphabet.substring(0,key);
 
 String salpha = Alphabet.toLowerCase();
 
     String Sshiftalpha = Shiftalpha.toLowerCase();
     
 for(int i =0;i<encrypted.length();i++){
   
   char currChar = encrypted.charAt(i);
 //  currChar = Character.toUpperCase(currChar);
   int idx = Alphabet.indexOf(currChar);
   if(idx!= -1){
     char newChar = Shiftalpha.charAt(idx);
     encrypted.setCharAt(i,newChar);
     
    }
   
   if (idx==-1){
     
     
     idx= salpha.indexOf(currChar);
     
       if(idx != -1){
         
         char snewChar = Sshiftalpha.charAt(idx);
         encrypted.setCharAt(i,snewChar);
       }
     }
   
   
 }
  
  return encrypted.toString();
  
}

    
public void dualcaesarCipher(String message, int key1,int key2){
String Ostr = "";
    String Estr = "";
 UsefulMethods uM = new UsefulMethods();
 Ostr=uM.OddStringpartition(message);
 Estr=uM.EvenStringpartition(message);
  

    
    Ostr= CaesarCipher1(Ostr,key1);
   // System.out.println(Ostr);
    Estr = CaesarCipher1(Estr,key2);
    
   //System.out.println(Estr);
   
  String output = uM.StringMerger(Ostr,Estr);
  System.out.println(output);
}

public  void CaesarStarter(String path,int key){
  
  FileResource fr = new FileResource(path);
 String message = fr.asString();
  CaesarCipher cc = new CaesarCipher();
//String message = "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
  
 // String message = "First Legion";
System.out.println(cc.CaesarCipher1(message,key));
  
//System.out.println(cc.CaesarCipher1(message,key1));
//int key2= 8;
//int key1 = 21;
//cc.dualcaesarCipher(message,key1,key2);
//cc.CaesarCipher1(message,key1);
}



public String decryptCaehelper(String encrypted,int dkey){
  
 CaesarCipher cc = new CaesarCipher(); //System.out.println(cc.CaesarCipher1(encrypted,dkey));
  return cc.CaesarCipher1(encrypted,dkey);
}








}

