package JogoCartas.tabuleiro;

import JogoCartas.cartas.CartaAtaque;
import JogoCartas.cartas.CartaAtaqueEspecial;
import JogoCartas.cartas.Deck;
import JogoCartas.jogador.Jogador;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Jogador> jogadores = new ArrayList<>();
        Jogador jogador = new Jogador("Bia", 20);
        CartaAtaque cartaAtaque = new CartaAtaque(13, 13, "Carta Nova", "Fogo", 1);
        CartaAtaque cartaAtaqueCusto3 = new CartaAtaque(13, 13, "Carta Nova", "Fogo", 3);
        jogadores.add(jogador);
        Campo campo = new Campo("Lado A", 5, 5);
        jogador.setCampo(campo);

        List<CartaAtaqueEspecial> cartasEspeciais = new ArrayList<>();
        List<CartaAtaque> cartasAtaque = new ArrayList<>();
        Deck deck = new Deck(cartasEspeciais, cartasAtaque);

        TabuleiroParty tabuleiroParty = new TabuleiroParty();
        tabuleiroParty.inserirDeck(deck);
        tabuleiroParty.inserirJogador(jogadores);
        tabuleiroParty.retornarVencedor(jogadores);
        tabuleiroParty.posicionarCartaAtaque(cartaAtaque);

        TabuleiroVersus tabuleiroVersus = new TabuleiroVersus();
        tabuleiroVersus.inserirDeck(deck);
        tabuleiroVersus.inserirJogador(jogadores);
        tabuleiroVersus.retornarVencedor(jogadores);
        tabuleiroVersus.posicionarCartaAtaque(jogador, cartaAtaque);
        tabuleiroVersus.posicionarCartaAtaque(jogador, cartaAtaqueCusto3);

    }
}
