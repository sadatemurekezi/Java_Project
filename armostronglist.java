import javax.swing.*;
public class armostronglist {
  public static void main(String[] args) {
    
    for(int i=100; i<1000; i++){
      int a = i/100;
      int b = (i%100)/10;
      int c = i%10;
      int temp= a*a*a+b*b*b+c*c*c;
      if(temp==i){
      // if (i==a*a*a + b*b*b+ c*c*c){
        System.out.println(i);
      }
    }
  }
}
