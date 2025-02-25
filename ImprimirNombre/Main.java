import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    String nombre = "Sebastian";
    String output = "";
    for (int i=0; i<nombre.length(); i++) {
        if (i == 0){
            output += "S\n";
        }
        else if (i == 1){
            output += "e\n";
        }
        else if (i == 2){
            output += "b\n";
        }
        else if (i == 3){
            output += "a\n";
        }
        else if (i == 4){
            output += "s\n";
        }
        else if (i == 5){
            output += "t\n";
        }
        else if (i == 6){
            output += "i\n";
        }
        else if (i == 7){
            output += "a\n";
        }
        else {
            output += "n\n";
        }
        }
    JOptionPane.showMessageDialog(null, output);
    }
}

/*
Alternativa más eficiente

String nombre = "Sebastian";
        for (int i=0; i<nombre.length(); i++) {
            char c = nombre.charAt(i);
            System.out.println(c);
        }

 */