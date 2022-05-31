package JogoCartas.tabuleiro;

import JogoCartas.cartas.CartaAtaque;
import JogoCartas.cartas.Deck;
import JogoCartas.jogador.Jogador;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Tabuleiro {
    private int mana = 1;

    protected List<Deck> decks = new ArrayList<>();

    private List<Jogador> jogadores = new ArrayList<>();


    protected abstract void verificarTamanhoDeck(Deck deck);

    protected abstract boolean isTamanhoDeckAceitavel(Deck deck);

    private int getMana() {
        return mana;
    }

    protected void inserirDeck(Deck deck, int tamanhoMaximoDecks) {
        if (decks.size() <= tamanhoMaximoDecks) {
            verificarTamanhoDeck(deck);
        } else {
            System.out.printf("O n�mero de decks m�ximo para tabuleiro � %d!", tamanhoMaximoDecks);
        }
    }

    protected void inserirJogador(List<Jogador> jogadores, int maximoJogadoresPermitidos) {
        if (decks.size() <= maximoJogadoresPermitidos) {
            this.jogadores.addAll(jogadores);
        } else {
            System.out.printf("O n�mero de jogadores m�ximo para tabuleiro � %d!", maximoJogadoresPermitidos);
        }
    }


    private boolean isCartaJogavel(CartaAtaque cartaAtaque) {
        return cartaAtaque.getCusto() <= getMana();
    }


    protected Jogador retornarVencedor(List<Jogador> jogadores) {
        Jogador vencedor = jogadores.stream()
                .filter(jogador -> jogador.getVida() > 0).toList().get(0);

        System.out.println("O vencedor �: " + vencedor.toString());

        return vencedor;
    }

    public void verificarCustoCartaAtaque(CartaAtaque cartaAtaque) {
        if (!isCartaJogavel(cartaAtaque)) {
            System.out.println("Custo da carta maior que o permitido!");
        }
    }

}
