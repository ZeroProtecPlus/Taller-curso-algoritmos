import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    int productosMenos10000=0, productosMayores10000=0;
    double totalCompra = 0;
    for (int i = 0; i<16; i++){
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del producto " + (i) + ": "));
        totalCompra += precio;
        if (precio > 10000){
            productosMenos10000++;
            }
        else {
            productosMayores10000++;
            }
        }
    String mensaje = "Productos que costaron menos de 10000: " + productosMenos10000 + "\n" +
            "Productos que costaron 10000 o más: " + productosMayores10000 + "\n" +
            "Total de la compra: " + totalCompra;
    JOptionPane.showMessageDialog(null, mensaje);
    }

}