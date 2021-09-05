package tools;

public class hexConverter {

public void hex(int S){
  System.out.println(Integer.toHexString(S));  
}

public void hex1(int decimal){
  
  int rem;  
     String hex="";   
     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    while(decimal>0)  
     {  
       rem=decimal%16;   
       hex=hexchars[rem]+hex;   
       decimal=decimal/16;  
     }  
   System.out.println(hex);
  
}


}
