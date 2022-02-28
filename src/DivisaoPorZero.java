
public class DivisaoPorZero extends Exception {
    private int denominador;

    public DivisaoPorZero(String message, int i) {
        super(message);
    }

}