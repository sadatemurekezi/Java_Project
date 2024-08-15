import javax.swing.*;
public class armostrong {
  public static void main(String[] args) {
    int num =Integer.parseInt(JOptionPane.showInputDialog("Enter a number made of 3 digits"));
    int a= num /100;
    int b= (num % 100)/10;
    int c=num % 10;
    int temp= a*a*a + b*b*b + c*c*c;
    if(temp==num){
      JOptionPane.showMessageDialog(null,num +"is armostrong.");
      }
      else{
      JOptionPane.showMessageDialog(null,num+"is not armostrong.");
      }
    }
  }
