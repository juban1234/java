import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        String nombre =JOptionPane.showInputDialog("ingrese su nombre");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("cual es tu edad: "));
        
        if (edad > 18) {
            JOptionPane.showMessageDialog(null,nombre+" eres mayor de edad");
        } else {
            JOptionPane.showMessageDialog(null,nombre+" eres menor de edad");
        }
    }
}
