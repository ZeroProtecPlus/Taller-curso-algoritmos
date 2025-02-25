import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n3: "));

        while (n1 == n2){
            n1 = Integer.parseInt(JOptionPane.showInputDialog("El valor de n1 no puede ser igual a n2, ingrese un valor diferente: "));
        }
        while (n2 == n3){
            n2 = Integer.parseInt(JOptionPane.showInputDialog("!Error, el valor de n2 no puede ser igual a n3, ingrese un valor diferente: "));
        }
        while (n3 == n1){
            n3 = Integer.parseInt(JOptionPane.showInputDialog("!Error, el valor de n3 no puede ser igual a n1, ingrese un valor diferente: "));
        }

        if (n1 > n2 && n1 > n3){
            JOptionPane.showMessageDialog(null, "N1 es el numero mayor: ");
        }
        else if (n2 > n1 && n2 > n3){
            JOptionPane.showMessageDialog(null, "N2 es el numero mayor: ");
        }
        else{
            JOptionPane.showMessageDialog(null, "N3 es el numero mayor: ");
        }
    }
}