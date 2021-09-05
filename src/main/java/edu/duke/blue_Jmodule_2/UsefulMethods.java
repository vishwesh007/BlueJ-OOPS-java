package edu.duke.blue_Jmodule_2;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class UsefulMethods {

public String OddStringpartition(String message){
  String Ostr ="";
  String Estr ="";
  StringBuilder even = new StringBuilder(message);
    StringBuilder odd = new StringBuilder(message);
  int jp= message.length()-1;
  for(int i=jp ;i>0
  ;i--){
    
    if (i % 2 ==0){
      odd.deleteCharAt(i);
    }
    if(i % 2== 1){
      
      
     even.deleteCharAt(i);
    }
     
   
    
  }
  odd.deleteCharAt(0);
  
  Ostr = odd.toString();
   Estr = even.toString();
   /* System.out.println(Ostr);
  System.out.println(Estr);*/
  return Ostr;
 
}

public String EvenStringpartition(String message){
  String Ostr ="";
  String Estr ="";
  
  StringBuilder even = new StringBuilder(message);
    StringBuilder odd = new StringBuilder(message);
  int jp= message.length()-1;
  for(int i=jp ;i>0
  ;i--){
    
    if (i % 2 ==0){
      odd.deleteCharAt(i);
    }
    if(i % 2== 1){
      
      
     even.deleteCharAt(i);
    }
     
   
    
  }
  odd.deleteCharAt(0);
  
  Ostr = odd.toString();
   Estr = even.toString();
   /* System.out.println(Ostr);
  System.out.println(Estr);*/
  return Estr;
 
}


public String[] OddEvenStringpartition(String message){
  String Ostr ="";
  String Estr ="";
  
  StringBuilder even = new StringBuilder(message);
    StringBuilder odd = new StringBuilder(message);
  int jp= message.length()-1;
  for(int i=jp ;i>0
  ;i--){
    
    if (i % 2 ==0){
      odd.deleteCharAt(i);
    }
    if(i % 2== 1){
      
      
     even.deleteCharAt(i);
    }
     
   
    
  }
  odd.deleteCharAt(0);
  
  Ostr = odd.toString();
   Estr = even.toString();
   /* System.out.println(Ostr);
  System.out.println(Estr);*/
  String [] arr =new String[2];
  arr[0] =Ostr;
  arr[1] = Estr;
  return arr;
 //50%faster code
}

public String StringMerger(String Ostr,String Estr){
  StringBuilder Final = new StringBuilder();
  

  int length =Ostr.length()+Estr.length();
  int j=0;
    int k=0;
    for(int i=0;i<length;i++){
      
      if(i % 2==0){
        
        Final.insert(i,Estr.charAt(j));
        j++;
      }
      if(i % 2== 1){
        
        Final.insert(i,Ostr.charAt(k));
        k++;
      }
    }
  
  return Final.toString();
  
}

public int findMaxIndex(ArrayList<Integer> myFreqs){
  int currMax= 0;
  int index=0;
  for(int i=0;i<myFreqs.size();i++){
    
    if(currMax<myFreqs.get(i)){
      
      currMax = myFreqs.get(i);
      index =i ;
      
    }
  }
  
  return index;
}

public int findMaxIndex(int[] myFreqs){
  int currMax= 0;
  int index=0;
  for(int i=0;i<myFreqs.length;i++){
    
    if(currMax<myFreqs[i]){
      
      currMax = myFreqs[i];
      index =i ;
      
    }
  }
  
  return index;
}

}
