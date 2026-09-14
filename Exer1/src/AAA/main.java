package AAA;
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
        int[] A = new int[10];
        String n = "";
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(JOptionPane.showInputDialog("Coloque o " + (i + 1) + "º número:"));
            n = n + " " + A[i]; 
        }
        JOptionPane.showMessageDialog(null, "Números digitados:" + n);
    }
}