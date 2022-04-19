import javax.swing.JOptionPane;

public class Main {
    static void mensagemResposta(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Validação",
                JOptionPane.INFORMATION_MESSAGE);
    }

    static void adição(int a, int b) {

        float resultado;
        resultado = a + b;
        JOptionPane.showMessageDialog(null, resultado, "Seu resultado é:", JOptionPane.INFORMATION_MESSAGE);
    }

    static void multiplicação(int a, int b) {
        float resultado;
        resultado = a * b;
        JOptionPane.showMessageDialog(null, resultado, "Seu resultado é:", JOptionPane.INFORMATION_MESSAGE);
    }

    static void subtração(int a, int b) {
        float resultado;
        resultado = a - b;
        JOptionPane.showMessageDialog(null, resultado, "Seu resultado é:", JOptionPane.INFORMATION_MESSAGE);
    }

    static void divisão(int a, int b) {
        float resultado;
        resultado = a / b;
        JOptionPane.showMessageDialog(null, resultado, "Seu resultado é:", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        int Num1, Num2;
        String operador;
        Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        operador = (JOptionPane.showInputDialog("Digite o operador"));

        if (operador.equals("adição")) {
            adição(Num1, Num2);
        } else {
            if (operador.equals("multiplicação")) {
                multiplicação(Num1, Num2);
            } else {
                if (operador.equals("subtração")) {
                    subtração(Num1, Num2);
                } else {
                    if (operador.equals("divisão")) {
                        divisão(Num1, Num2);
                    }

                }
            }
        }
    }

}
