package JogoCartas.tabuleiro;

import JogoCartas.cartas.CartaAtaque;
import JogoCartas.cartas.Deck;
import JogoCartas.jogador.Jogador;

import java.util.List;

public class TabuleiroParty extends Tabuleiro {
    private static final int TAMANHO_DECK_PARTY = 80;
    private static final int TAMANHO_TOTAL_CAMPO_PARTY = 34;
    private static final int MAXIMO_DECKS_PERMITIDOS_PARTY = 5;

    private static final int MAXIMO_JOGADORES_PERMITIDOS_PERMITIDOS_PARTY = 5;

    Campo campo = new Campo();

    public void iniciarTabuleiroParty(List<Deck> decks, List<Jogador> jogadores) {
        for (Deck deck : decks) {
            inserirDeck(deck);
        }
        inserirJogador(jogadores);
    }

    public void inserirDeck(Deck deck) {
        super.inserirDeck(deck, MAXIMO_DECKS_PERMITIDOS_PARTY);
    }

    public void inserirJogador(List<Jogador> jogadores) {
    super.inserirJogador(jogadores, MAXIMO_JOGADORES_PERMITIDOS_PERMITIDOS_PARTY);
    }

    public void posicionarCartaAtaque(CartaAtaque cartaAtaque) {
        super.verificarCustoCartaAtaque(cartaAtaque);
        if (campo.getTotalCartasCampo() > TAMANHO_TOTAL_CAMPO_PARTY) {
            System.out.println("N�o foi poss�vel adicionar a carta, " +
                    "o total m�ximo de cartas permitido no campo �: " + TAMANHO_TOTAL_CAMPO_PARTY);
        }
    }

    @Override
    public boolean isTamanhoDeckAceitavel(Deck deck) {
        return deck.getTamanhoDeck() == TAMANHO_DECK_PARTY;
    }

    @Override
    protected void verificarTamanhoDeck(Deck deck) {
        if (!isTamanhoDeckAceitavel(deck)) {
            System.out.println("N�o � poss�vel adicionar o deck, tamanho do deck Versus deve ser igual a "
                    + TAMANHO_DECK_PARTY);
        } else {
            decks.add(deck);
        }
    }

}

