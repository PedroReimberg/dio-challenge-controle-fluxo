import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        // Verifica se {parametroUm} é maior que {parametroDois}
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // Calcula a contagem e imprime os números
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Número: " + i);
        }
    }
}