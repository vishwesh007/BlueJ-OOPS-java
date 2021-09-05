package edu.duke.BlueJ_C2_1;
import edu.duke.*;
import edu.duke.BlueJ_C2_1.vigenereCipherv1;
import java.util.*;
import java.util.HashMap;
import edu.duke.blue_Jmodule_2.CaesarCipherv2;
import edu.duke.blue_Jmodule_2.*;
public class vigenereCipherv1 {

private String pkey= "DIwqpE";
private String Alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
public void VigenereCipher1(String message){

ArrayList<Integer> keys = new ArrayList<Integer>();

message = message.toUpperCase();
pkey = pkey.toUpperCase();
for(int i=0;i<pkey.length();i++){
  
  char ch =pkey.charAt(i);
  int index=(Alphabet.indexOf(ch));
  
  if(index != -1){
    
    keys.add(index);
    
    
  }
  }
  
 HashMap<Integer,CaesarCipherv2> ekeys ;
 ekeys  = new HashMap<Integer,CaesarCipherv2>();
  
  for(int i=0;i<keys.size();i++ ){
  
  Integer key = keys.get(i);
    CaesarCipherv2 cce= new CaesarCipherv2(key.intValue());
    
   
    
    ekeys.put(key,cce);
 System.out.println(ekeys);
 }


StringBuilder sb = new StringBuilder(message);

int sbl= sb.length();
for(int k=0;k<sbl;){
  
  for(Integer tempkey :keys){
    CaesarCipherv2 cc= ekeys.get(tempkey);
    if(k<sbl){
    char ce = cc.encrypt(sb.charAt(k));
    
    sb.setCharAt(k,ce);
    k++;
    }
    
    
  }
  
}

System.out.println(sb.toString());



}

public void vigenereCipherstarter(){
  
  String message ="pastaa";
  
  
  VigenereCipher1(message);
}
}
