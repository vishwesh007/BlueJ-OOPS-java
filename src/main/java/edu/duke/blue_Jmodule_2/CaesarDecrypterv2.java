package edu.duke.blue_Jmodule_2;

import edu.duke.blue_Jmodule_2.CaesarCipherv2;


public class CaesarDecrypterv2 {

public String decryptCaesarv2(String encrypted){
  
  
  
  
  int [] freqs = countLetter(encrypted);
  int maxDex = maxIndex(freqs);
  int dkey = maxDex-4;
  
  if(maxDex<4){
    
   
    dkey = 26-(4-maxDex);
    
  }
  CaesarCipherv2 cc = new CaesarCipherv2(dkey);
    String s= cc.decrypt(encrypted);
    System.out.println("encryption key found "+(dkey)+"\n");
    System.out.println("decrypted with "+(26-dkey)+"\n");
 return s;
}

private int maxIndex(int[] vals){
  
  int maxDex= 0;
  for(int k=0;k<vals.length;k++){
  if(vals[k]>vals[maxDex]){
    maxDex = k;
    }
  }
  return maxDex;
  
  
  
}

private int[] countLetter(String encrypted){
  
  
  int[] Arr= new int[26];
  String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  StringBuilder sb = new StringBuilder(encrypted);
  for(int i=0;i<encrypted.length();i++){
    
    


     char  a= sb.charAt(i);
    int in = alpha.indexOf(Character.toUpperCase(a));
    if(in != -1){
      
      
      Arr[in] += 1;
    }
    
  }
  return Arr;
}


}
