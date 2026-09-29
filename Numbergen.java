import java.util.Vector;

public class Numbergen extends Thread {
    
    private int n;
    private int nTotal = 0;
    private int qtdPontosCirculo = 0;
    private long duracao; //duracao em Ms
    private final Vector<Ponto> pontos = new Vector<>();

    public int getTotalPontosGerados() {
        return nTotal;
    }

    public int getQtdPontosDentroDoCirculoInscrito() {
        return qtdPontosCirculo;
    }

    public Numbergen(int n, long duracao) {
        this.n = n;
        this.duracao = duracao;
    }

    @Override 
    public void run() {
        long inicio = System.nanoTime();
        while (System.nanoTime() - inicio < duracao * 1_000_000) {
            double x = Math.random() * n - n/2;
            double y = Math.random() * n - n/2;
            nTotal++;
            pontos.add(new Ponto(x, y));
            
            double raio = n / 2.0;
            if (x * x + y * y <= raio * raio) {
                qtdPontosCirculo++;
            }
            
        }

    }
}
