package tools;

import tools.currenttimeinmillis;
import tools.hexConverter;
import tools.main;


public class main {
int tohex = 10000;
public void start(){
String s="timeinmillis";

  switcher(s);
  
}


private void switcher(String s){
  s= s.toLowerCase();
  switch (s){
    case "timeinmillis":
    timeinmillis();
    break ;
    case "hex":
    hex();
    break ;
    
  }
  
  
}

public void hex(){
  hexConverter hc = new hexConverter ();
  int h = this.tohex;
  
  hc.hex(h);
  
}






public void timeinmillis(){
  currenttimeinmillis p = new currenttimeinmillis();
  
  p.timeinmillis();
  
  
}

  public static void main(String[] args) {
main p = new main();
p.start();
  }

}
