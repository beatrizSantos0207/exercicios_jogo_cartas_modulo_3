package JogoCartas.tabuleiro;

import JogoCartas.cartas.CartaAtaque;
import JogoCartas.cartas.Deck;
import JogoCartas.jogador.Jogador;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroVersus extends Tabuleiro {

    public static final int TAMANHO_DECK_VERSUS = 50;
    public static final int TAMANHO_TOTAL_CARTA_ATAQUE = 5;
    public static final int TAMANHO_TOTAL_CARTA_ATAQUE_ESPECIAL = 2;

    public static final int MAXIMO_DECKS_PERMITIDOS_VERSUS = 2;
    private static final int MAXIMO_JOGADORES_PERMITIDOS_VERSUS = 2;


    protected void inserirJogador(List<Jogador> jogadoresInseridos) {
       super.inserirJogador(jogadoresInseridos, MAXIMO_JOGADORES_PERMITIDOS_VERSUS);
    }

    public void inserirDeck(Deck deck) {
        super.inserirDeck(deck, MAXIMO_DECKS_PERMITIDOS_VERSUS);
    }

    @Override
    protected void verificarTamanhoDeck(Deck deck) {
        if (!isTamanhoDeckAceitavel(deck)) {
            System.out.println("Não é possível adicionar o deck, tamanho do deck Versus deve ser igual a "
                    + TAMANHO_DECK_VERSUS);
        } else {
            decks.add(deck);
        }
    }

    @Override
    public boolean isTamanhoDeckAceitavel(Deck deck) {

        return deck.getTamanhoDeck() == TAMANHO_DECK_VERSUS;
    }

    public void posicionarCartaAtaque(Jogador jogador, CartaAtaque cartaAtaque) {
        super.verificarCustoCartaAtaque(cartaAtaque);
        if (jogador.getCampo().getTotalCartasAtaquePosicionadas() > TAMANHO_TOTAL_CARTA_ATAQUE) {
            System.out.println("Não foi possível adicionar a carta, " +
                    "o total máximo de cartas de ataque permitidos no campo é: " + TAMANHO_TOTAL_CARTA_ATAQUE);
        }
    }

    public void posicionarCartaAtaqueEspecial(Jogador jogador) {
        if (jogador.getCampo().getTotalCartasAtaqueEspecialPosicionadas() > TAMANHO_TOTAL_CARTA_ATAQUE_ESPECIAL) {
            System.out.println("Não foi possível adicionar a carta, " +
                    "o total máximo de cartas de ataque especial permitidos no campo é: " + TAMANHO_TOTAL_CARTA_ATAQUE_ESPECIAL);
        }
    }

}
