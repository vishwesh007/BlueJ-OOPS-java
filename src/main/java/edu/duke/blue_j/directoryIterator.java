package edu.duke.blue_j;

import edu.duke.blue_j.directoryIterator;
import java.util.ArrayList;


public class directoryIterator {

public ArrayList<String> iteratorweather(){
  
  ArrayList<String> arr = new ArrayList<String>();
    for(int month =05;month<13;month++){
 for( int date =01;date<=31;date++){
 
  if(month%2 ==0 && date ==31){
    break;
  }
  
  String f ;
  if(date<10&&month<10){
 f="weather-2014-0"+month+"-0"+date+".csv";
  }
   else if(date>9 &&month<10){
     f="weather-2014-0"+month+"-"+date+".csv";
   }
   else if(date<10 && month >9){
     
     f="weather-2014-"+month+"-0"+date+".csv";
     
   }
   else{
     f="weather-2014-"+month+"-"+date+".csv";
     
   }
    
     
     arr.add(f);
    }
  }
  return arr;
  
}


public static void main (String[] args){
  
  directoryIterator v = new directoryIterator();
  
  v.iteratorweather();
  
}

}
