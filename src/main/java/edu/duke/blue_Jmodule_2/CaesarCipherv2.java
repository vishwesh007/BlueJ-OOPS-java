package edu.duke.blue_Jmodule_2;

import edu.duke.blue_Jmodule_2.CaesarCipherv2;

import edu.duke.*;
public class CaesarCipherv2 {
private  String Alphabet;
private String Shiftalpha;
private int Mainkey;
public CaesarCipherv2(int key){
  
 Mainkey =key;
 Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 Shiftalpha = Alphabet.substring(key)+Alphabet.substring(0,key);
 }
 
 public String encrypt(String input){
   
   
   input= input.toUpperCase();
   StringBuilder sb = new StringBuilder(input);
   int s= sb.length();
   for(int i=0;i<sb.length();i++){
   char c=sb.charAt(i);
   
     int index = Alphabet.indexOf(c);
     
     if(index != -1){
       char ch =Shiftalpha.charAt(index);
       
       sb.setCharAt(i,ch);
     }
     
   }
   
   String encrypted =sb.toString();
     
     
     return encrypted;
 }
 
 
 public char encrypt(char input){
   
   
 
   input= Character.toUpperCase(input);
  // StringBuilder sb = new StringBuilder(input);
  // int s= sb.length();
   //for(int i=0;i<sb.length();i++){
 //  char c=sb.charAt(i);
   
     int index = Alphabet.indexOf(input);
     
     if(index == -1){
      // char ch =Shiftalpha.charAt(index);
       return  input;
    //   sb.setCharAt(i,ch);
     }
     
//   }
   
  // String encrypted =sb.toString();
     
     char ch =Shiftalpha.charAt(index);
     return ch;
   
   
 }
 
 
 
 
 
public String decrypt(String input){
  
  CaesarCipherv2 cc= new CaesarCipherv2(26-Mainkey);
 String s= cc.encrypt(input);
 return s;
}

public void Caesarv2starter(String path, int key,int mode){
  
 CaesarCipherv2 c= new CaesarCipherv2(key);
  
 if(mode == 1){
 FileResource fr = new FileResource(path);
  String message = fr.asString();
  String s= c.encrypt(message);
  System.out.println(s);
System.out.println(c.decrypt(s));
  }

 if(mode == 0){
    
    String se=c.encrypt(path);
    System.out.println(se);
    System.out.println(c.decrypt(se));
  }
}

}
