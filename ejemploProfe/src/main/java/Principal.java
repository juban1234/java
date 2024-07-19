
import javax.swing.JOptionPane;


public class Principal {
    /*
    * algoritmo que sume 2 numeros
    */
    public static void main(String[] args) {
        System.out.println("hola");
        /*
        * valores numericos enteros
        * byte
        * byte
        * int
        * long
        *
        * float
        * double
        * 
        * tipo de texto
        * char
        * boolean
        */
        
        /*
        int x=127;
        x = 8;
        
        char cad=62;
        System.out.println(cad);
        
        
        String cadena="holas alex";
        System.out.println(cadena);
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("ingrese el numero 1: ");
        int num1=Integer.parseInt(input.next());
        System.out.print("ingrese el numero 2: ");
        int num2=Integer.parseInt(input.next());
        int suma = num1+num2;
        
        System.out.println("las suma es: "+suma);
        */
        
        String nombre=JOptionPane.showInputDialog("ingrese su nombre");
        String input1 = JOptionPane.showInputDialog("ingrese su nota");
        String input2 = JOptionPane.showInputDialog("ingrese su nota");

        int num3=Short.parseShort(input1);
        int num4=Short.parseShort(input2);
        
        double nota = num3+num4;
        
        System.out.println("hola "+nombre+" tu nota final es: " +nota);
    }
}
