package JogoCartas.cartas;

import java.util.List;

public class Deck {

    List<CartaAtaqueEspecial> cartasEspeciais;
    List<CartaAtaque> cartasAtaque;

    public Deck(List<CartaAtaqueEspecial> cartasEspeciais, List<CartaAtaque> cartasAtaque) {
        this.cartasEspeciais = cartasEspeciais;
        this.cartasAtaque = cartasAtaque;
    }


    public int getTamanhoDeck() {
        return cartasAtaque.size() + cartasEspeciais.size();
    }

}
