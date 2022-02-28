import javax.swing.*;
import java.io.*;

    public class ExceptionCustomizada {
        public static void main(String[] args) throws DivisaoNaoExataException {
            int[] numerador = {4, 5, 8, 10};
            int[] denominador = {2, 4, 0, 2, 8};

            for (int i = 0; i < denominador.length; i++) {
                try {
                    if (numerador[i] % 2 != 0) {
                        throw new DivisaoNaoExataException("Divisão não exata.", numerador[i], denominador[i]);
                    }
                    else if (numerador[i] % 2 != 0 && denominador[i] == 0) {
                        throw new ArithmeticException();
                    }

                    int resultado = numerador[i] / denominador[i];
                    System.out.println(resultado);

                } catch (DivisaoNaoExataException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e.getMessage());

                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }

                System.out.println("Continuou.");
            }
        }
    }

