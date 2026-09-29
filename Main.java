import java.util.Scanner;

public class Main {
    //Valor de processadores será usado para startar t threads
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tamanho do planocartesiano (n): ");
        int n = teclado.nextInt();
        System.out.println("Digite a duração da simulação (em ms): ");
        long duracao = teclado.nextLong();
        teclado.close();
        int t = Runtime.getRuntime().availableProcessors();

        Numbergen[] threads = new Numbergen[t];

        // Startar t threads
        for (int i = 0; i < t; i++) {
            threads[i] = new Numbergen(n, duracao);
            threads[i].start();
        }
        //para cada thread, esperar ela terminar e somar os resultados
        for (int i = 0; i < t; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.toString();
            }
        }
        int totalPontosGerados = 0;
        int totalPontosDentroDoCirculo = 0;

        for (int i = 0; i < t; i++) {
            totalPontosGerados += threads[i].getTotalPontosGerados();
            totalPontosDentroDoCirculo += threads[i].getQtdPontosDentroDoCirculoInscrito();
        }

        System.out.println("Total de pontos gerados: " + totalPontosGerados);
        System.out.println("Total de pontos dentro do círculo: " + totalPontosDentroDoCirculo);
    }
}
