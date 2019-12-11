/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import java.util.Random;

public class pregunta {
	public static void main(String[] args) {
		boolean comprobacion = comprobar();
                System.out.print(comprobacion);
	}
        public static boolean comprobar(){
            Random r1 = new Random();
            Random r2 = new Random();
            Random r3 = new Random();
            int valor1 = r1.nextInt(10)+1;
            int valor2 = r2.nextInt(9)+1;
            int operador = r3.nextInt(4)+1;
            int resultado;
            String obtener;
            int usuarioresultado;
            String mensaje = "Resuleve la operacion:";
            switch (operador){
                case 1:
                     mensaje += valor1 + "+" + valor2;
                     resultado = valor1 + valor2;
                     obtener = JOptionPane.showInputDialog(mensaje);
                     usuarioresultado = Integer.parseInt(obtener);
                    break;
                case 2:
                    mensaje += valor1 + "-" + valor2;
                    resultado = valor1 - valor2;
                    obtener = JOptionPane.showInputDialog(mensaje);
                     usuarioresultado = Integer.parseInt(obtener);
                    break;
                case 3:
                    mensaje += valor1 + "*" + valor2;
                    resultado = valor1 * valor2;
                    obtener = JOptionPane.showInputDialog(mensaje);
                     usuarioresultado = Integer.parseInt(obtener);
                break;
                default:
                    mensaje += valor1 + "+" + valor2;
                    resultado = valor1 + valor2;
                    obtener = JOptionPane.showInputDialog(mensaje);
                     usuarioresultado = Integer.parseInt(obtener);
                  break;
            }
            if (usuarioresultado == resultado)
            {
                JOptionPane.showMessageDialog(null, "Resultado correcto");
                return true;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Resultado incorrecto, era: "+resultado+"pasa turno");
                return false;
            }
        }
}