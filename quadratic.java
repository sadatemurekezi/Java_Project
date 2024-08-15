import javax.swing.*;
public class quadratic {
  public static void main(String[] args) {
    int a=Integer.parseInt(JOptionPane.showInputDialog("Enter the value of a:"));
    int b=Integer.parseInt(JOptionPane.showInputDialog("Enter the value of b:"));
    int c=Integer.parseInt(JOptionPane.showInputDialog("Enter the value of c:"));
    double Delta=b*b-4*a*c;
    if(Delta<0){
    JOptionPane.showMessageDialog(null,"No solution");
      }else{
        double x1=(-b+Math.sqrt(Delta)/(2*a));
        double x2=(-b-Math.sqrt(Delta)/(2*a));
        JOptionPane.showMessageDialog(null,"Solution are x1:"+x1 +"x2:"+x2);
      }
  }
  
}
