import javax.swing.JOptionPane;
public class addtwonumber {
  public static void main(String[] arg){
    int a;
    int b; 
    int sum;
    String temp;
    temp = JOptionPane.showInputDialog ("Enter the value of a:");
    a =Integer.parseUnsignedInt(temp);
    temp = JOptionPane.showInputDialog ("Enter the value of b:");
    b =Integer.parseUnsignedInt(temp);
    sum=a+b;
    JOptionPane.showMessageDialog(null,"The sum is :"+ sum);
 
    }
  
}
