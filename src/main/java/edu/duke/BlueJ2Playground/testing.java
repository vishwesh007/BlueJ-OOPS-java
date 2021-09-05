package edu.duke.BlueJ2Playground;

import edu.duke.BlueJ2Playground.testing;
import java.lang.reflect.Array;
import java.util.Arrays;

public class testing {

public  void plus1(int [] arr){
  
  for(int k=0;k<arr.length;k++){
    
   arr[k]  = arr[k] +1 ;
   
    
  }
  
}




  public static void main(String[] args) {


testing s = new testing();
int [] arr = new int[10];
System.out.println(Arrays.toString(arr));
s.plus1(arr);
System.out.println(Arrays.toString(arr));

  }

}
