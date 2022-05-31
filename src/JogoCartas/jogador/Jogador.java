package JogoCartas.jogador;

import JogoCartas.tabuleiro.Campo;


public class Jogador {
    protected String nome;
    protected int vida;
    protected Campo campo;

    public Jogador(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public Jogador(String nome, int vida, String lado) {
        this.nome = nome;
        this.vida = vida;
        this.campo = new Campo(lado, 5, 2);
    }

    public int getVida() {
        return vida;
    }
    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    @Override
    public String toString() {
        return "Jogador : " + nome;
    }
}
