package JogoCartas.tabuleiro;

public class Campo {

    String lado;

    int totalCartasAtaquePosicionadas;

    int totalCartasAtaqueEspecialPosicionadas;

    int totalCartasCampo;

    public Campo(String lado, int totalCartasAtaque, int totalCartasAtaqueEspecial) {
        this.lado = lado;
        this.totalCartasAtaquePosicionadas = totalCartasAtaque;
        this.totalCartasAtaqueEspecialPosicionadas = totalCartasAtaqueEspecial;
    }

    public Campo() {
    }

    public int getTotalCartasAtaquePosicionadas() {
        return totalCartasAtaquePosicionadas;
    }

    public int getTotalCartasAtaqueEspecialPosicionadas() {
        return totalCartasAtaqueEspecialPosicionadas;
    }

    public int getTotalCartasCampo() {
        return totalCartasCampo;
    }


}
