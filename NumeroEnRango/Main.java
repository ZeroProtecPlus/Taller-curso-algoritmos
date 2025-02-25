import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (userNumber <= 50){
            if (userNumber >= 10){
                JOptionPane.showMessageDialog(null, "El numero se encuentra dentro del rango deseado");
            }
            else {
                JOptionPane.showMessageDialog(null, "El numero no se encuentra dentro del rango deseado");
            }
        }
    }
}