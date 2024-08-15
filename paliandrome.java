import javax.swing.*;
public class paliandrome {
  public static void main(String[] args) {
    int num= Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
    int a= num/100;
    int b= (num%100)/10;
    int c=num%10;
    if(num==c*100+b*10+a){
      JOptionPane.showMessageDialog(null,num+"Is Poliandrome");
    }else{
      JOptionPane.showMessageDialog(null,num+" Is Number iso not poliandrom");
    }
  }
}
