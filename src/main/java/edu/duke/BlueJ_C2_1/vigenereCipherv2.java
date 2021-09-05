package edu.duke.BlueJ_C2_1;

import edu.duke.blue_Jmodule_2.CaesarCipherv2;
import java.util.ArrayList;
import java.util.HashMap;


public class vigenereCipherv2 { 
private String key ;
private String Alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

public vigenereCipherv2(String key){
  
  this.key =key;
  
}


public void vigenereCipher2(String message){
  
  ArrayList<Integer> keys = getKeys(key);
  
  //System.out.println(keys);
  
  HashMap<Integer, CaesarCipherv2> Mapkeys = MappedCaeserset(keys);
  
 // System.out.println(Mapkeys);
  
  String encryptedMessage = BuildEncrypt(keys,Mapkeys,message);
  
  System.out.println(encryptedMessage);
}



public String BuildEncrypt(ArrayList<Integer> keys,HashMap<Integer, CaesarCipherv2> Mapkeys,String message){


  
  StringBuilder sb= new StringBuilder(message);
  
  int sbl= sb.length();
/*     for(int k=0;k<sbl;){
  
  for(Integer tempkey :keys){

    CaesarCipherv2 cc= Mapkeys.get(tempkey);
    if(k<sbl){
    char ce = cc.encrypt(sb.charAt(k));
    
    
    sb.setCharAt(k,ce);
    k++;
  }
  
}}*/

for(int k=0;k<sbl;){
  int j=0;
  for(Integer tempkey :keys){
    CaesarCipherv2 cc= Mapkeys.get(tempkey);
    
    if(k<sb.length()){
    char ce = cc.encrypt(sb.charAt(k));
    
    sb.setCharAt(k,ce);
    
    k++;
    
    if(! Character.isAlphabetic(ce)){
      if(k<sb.length()){
      char ce1 = cc.encrypt(sb.charAt(k));
    
    sb.setCharAt(k,ce1);
    k++;
    }
    }
    }
  }
  
}

  
  return  sb.toString();
}










public HashMap<Integer, CaesarCipherv2> MappedCaeserset(ArrayList<Integer> keys){

  HashMap<Integer, CaesarCipherv2>  MappingKeys = new HashMap<Integer, CaesarCipherv2>();;
  for(Integer key:keys){
    CaesarCipherv2 cc = new CaesarCipherv2 (key.intValue());
    MappingKeys.put(key,cc);
  }
  
  return MappingKeys;
  
}







public ArrayList<Integer> getKeys(String key){
  
  ArrayList<Integer> keys = new ArrayList<Integer>();
  
  
  for(int i=0;i<key.length();i++){
  
  char ch =key.charAt(i);
  ch = Character.toUpperCase(ch);
  int index=(Alphabet.indexOf(ch));
  
  if(index != -1){
    
    keys.add(index);
     
  }
  }
  
  return keys;
}



public void vigenereCipher2starter(String message){
vigenereCipherv2 v = new vigenereCipherv2(key);

  v.vigenereCipher2(message);
  
  
}

}
