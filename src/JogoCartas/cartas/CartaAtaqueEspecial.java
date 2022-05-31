package JogoCartas.cartas;

import JogoCartas.enums.Efeitos;

public class CartaAtaqueEspecial extends CartaAtaque {

    protected Efeitos efeitos;

    public CartaAtaqueEspecial(int poder, int resistencia, String nome, String tipo, int custo,
                               Efeitos efeitos) {
        super(poder, resistencia, nome, tipo, custo);
        this.efeitos = efeitos;
    }

    public String exibirEfeitos() {
        return efeitos + " : " + efeitos.descricao;
    }
}
