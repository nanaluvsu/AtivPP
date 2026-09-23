import java.util.Vector;
public class Numbergen extends Thread {
    
    private int n;
    private static int nTotal;
    private long duracao;

    public long getDuracao() {
        return duracao;
    }

    public void setDuracao(long duracao) {
        this.duracao = duracao;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private Vector<Ponto> pontos = new Vector<>();

    public int getTotalPontosGerados() {

    }

   
    public int getQtdPontosDentroDoCirculoInscrito() {
        int nPontosCirculo = 0;
        for (int i = 0; i < pontos.size(); i++) {
            Ponto ponto = pontos.get(i);
            double x = ponto.getX();
            double y = ponto.getY();
            if (x*x + y*y <= n/2) {
                nPontosCirculo++;
            }
        }
        return nPontosCirculo;
    }

    private Ponto geraPonto(double x, double y) {
        Ponto p = new Ponto(x, y);
        pontos.add(p);
        nTotal += pontos.size();
        return p;
    }

    public Numbergen(int n, long duracao) {

        long inicio = System.nanoTime();
        while (System.nanoTime() - inicio <= duracao) {
            setN(n);
            double x = Math.random() * n - n/2;
            double y = Math.random() * n - n/2;
            geraPonto(x, y);
        }
        
        
    }
}
