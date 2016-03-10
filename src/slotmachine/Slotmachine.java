package slotmachine;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Random;
public class Slotmachine {
    public static void main(String[] args) {
     Scanner lectura = new Scanner(System.in);
     Random R = new Random();
     int numberofreels =3;
     char resp = 's';
     double cantidadapostada=0;
     double cantidadganada=0;
     DecimalFormat dollar = new DecimalFormat("#,##0.00");
     do{
         JOptionPane.showMessageDialog(null,"Bienvenido al Apost-O-Matic!!");
         String nombre = JOptionPane.showInputDialog(null,"Por favor ingrese su nombre: ");
         JOptionPane.showMessageDialog(null, "Hola "+nombre+" por favor introduzca la cantidad de dinero que desea apostar: ");
         JOptionPane.showInputDialog(null, "Cantidad para apostar");
         cantidadapostada=0;
         List<String>reels = Lists.newArraylist();
         for (int i = 0; i < numberofreels; i++) {
         }
     }
     while (resp == 's'||resp=='S');
    }  
}
