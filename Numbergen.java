import java.util.Vector;
public class Numbergen extends Thread {
    
    private int n;
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private Vector<Ponto> pontos = new Vector<>();

   
    private int getQtdPontosDentroDoCirculoInscrito() {
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

    public void run() {
        
    }

    private Ponto geraPonto(double x, double y) {
        Ponto p = new Ponto(x, y);
        pontos.add(p);
        return p;
    }

    public Numbergen(int n) {

    }
}
