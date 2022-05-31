package JogoCartas.cartas;

public class CartaAtaque implements ICartas {
    protected int poder;
    protected int resistencia;
    protected String nome;
    protected String tipo;
    protected int custo;

    public CartaAtaque(int poder, int resistencia, String nome, String tipo, int custo) {
        this.poder = poder;
        this.resistencia = resistencia;
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
    @Override
    public int getCusto() {
        return custo;
    }

    public int getPoder() {
        return poder;
    }

    public int getResistencia() {
        return resistencia;
    }
}
