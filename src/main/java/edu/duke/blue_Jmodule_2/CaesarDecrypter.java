package edu.duke.blue_Jmodule_2;

/*odd String  is handled with key2 EVEN string  IS handled with KEY1*/

import edu.duke.blue_Jmodule_2.CaesarCipher;


public class CaesarDecrypter {


public String decryptCaesar(String encrypted){
  
  
  
  CaesarCipher cc = new CaesarCipher();
  int [] freqs = countLetter(encrypted);
  int maxDex = maxIndex(freqs);
  int dkey = maxDex-4;
  
  if(maxDex<4){
    
   
    dkey = 26-(4-maxDex);
    
  }
  
    String s= cc.decryptCaehelper(encrypted,26-dkey);
    System.out.println("encryption key found "+(dkey)+"\n");
    System.out.println("decrypted with "+(26-dkey)+"\n");
 return s;
}

public int maxIndex(int[] vals){
  
  int maxDex= 0;
  for(int k=0;k<vals.length;k++){
  if(vals[k]>vals[maxDex]){
    maxDex = k;
    }
  }
  return maxDex;
  
  
  
}

public int[] countLetter(String encrypted){
  
  
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




public String dualcaesarCipherDecrypt(String message){
String Ostr = "";
    String Estr = "";
 UsefulMethods uM = new UsefulMethods();
 
 String []arr = uM.OddEvenStringpartition(message);
Ostr = arr[0];
Estr= arr[1];
    
  

    CaesarCipher c= new CaesarCipher();
    
    System.out.println("key1");
    
    String decrypted2 =decryptCaesar(Estr);
    
    System.out.println("key2");
    
    
    String decrypted1 =decryptCaesar(Ostr);
    
    
    
     message=uM.StringMerger(decrypted1,decrypted2); 
 
  return message;
}
public void DecryptDualCcwithkeys(String message,int key1,int key2){
  
  int dkey1 = 26-key1;
  int dkey2 = 26-key2;
  CaesarCipher cc = new CaesarCipher();

cc.dualcaesarCipher(message,dkey2,dkey1);
  
}

}
