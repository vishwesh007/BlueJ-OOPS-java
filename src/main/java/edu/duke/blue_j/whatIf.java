package edu.duke.blue_j;

public class whatIf {
public void whatifString(String s){
//String se ="100";
double p= Double.parseDouble(s);

System.out.println(s);
}


public static void main (String[] args){
  whatIf w = new whatIf();
  
  String s = "1008&₹50";
  
  w.whatifString(s);
}


}
