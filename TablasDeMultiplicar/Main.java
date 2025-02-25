import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int resultado;
        String tablas = "";
        if (userNumber <= 10){
            for (int i = 1; i <11; i++){
                resultado = userNumber * i;
                tablas += userNumber + " X " + i + " = " + resultado + "\n";
            }
            JOptionPane.showMessageDialog(null, tablas);
        }
    }
}