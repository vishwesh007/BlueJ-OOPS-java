package edu.duke.blue_j;
import edu.duke.*;
import edu.duke.blue_j.directoryIterator;
import java.io.*;
import java.util.ArrayList;
import org.apache.commons.csv.*;

public class bluejHotestTemp {

public CSVRecord maxTemp(CSVRecord currRecord1,CSVRecord HotRecord1){
  CSVRecord currRecord=currRecord1;
  CSVRecord HotRecord= HotRecord1;
  double currDouble = Double.parseDouble(currRecord.get("TemperatureF"));
  
  if(HotRecord == null){
    HotRecord = currRecord;
  }
  double HotDouble = Double.parseDouble(HotRecord.get("TemperatureF"));
  if(HotDouble<currDouble){
    
    HotRecord = currRecord;
  }
  return HotRecord;
}


public CSVRecord minTemp(CSVRecord currRecord1,CSVRecord HotRecord1){
  CSVRecord currRecord=currRecord1;
  CSVRecord HotRecord= HotRecord1;
  double currDouble = Double.parseDouble(currRecord.get("TemperatureF"));
  
  if(HotRecord == null){
    HotRecord = currRecord;
  }
  double HotDouble = Double.parseDouble(HotRecord.get("Temperature F"));
  if(HotDouble>currDouble){
    
    HotRecord = currRecord;
  }
  return HotRecord;
}



public CSVRecord getMaxRecord(CSVParser parser){
  
 // Double maxtemp = 0.0;
  CSVRecord Recordmax = null;
  
  for (CSVRecord record:parser){
    
    Recordmax = maxTemp(record,Recordmax);
    
  }
  return Recordmax;
}

public static void main (String[] args){
  
  
/*  bluejHotestTemp s= new bluejHotestTemp();
  String Filename ="";
  File f = null;
  CSVRecord HotRecord = null;
  directoryIterator d= new directoryIterator();
  ArrayList<String> files = d.iteratorweather();
  for(String path:files){
  path = "/storage/emulated/0/#BLUEJ/BlueJ2Course1/bluej java/hottestTemp/data/2014/"+path;
   f= 
    FileResource fr = new FileResource(path);
     
    CSVParser parser = fr.getCSVParser();
    CSVRecord currRecord = s.getMaxRecord(parser);
    HotRecord = s.maxTemp(currRecord , HotRecord);
    
    if(HotRecord==currRecord){
      
      Filename = f.getName();
      }
    }
  
  
  System.out.println("Max temperature is" +HotRecord.get("TemperatureF")+"with filename"+Filename);
  */
}
}
