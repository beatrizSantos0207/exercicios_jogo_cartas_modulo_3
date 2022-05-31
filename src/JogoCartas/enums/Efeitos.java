package JogoCartas.enums;

public enum Efeitos {

    RECUPERAR_VIDA("Recupera vida"),
    PERFURANTE("O ataque atravessa 1 de resist�ncia"),
    FOGO("Causa 2 de dano"),
    PANCADA("A carta que recebe esse tipo de ataque n�o consegue atacar por um turno"),
    VENENOSO("A carta envenenada morre em 3 turnos"),
    SANGRAMENTO("A carta que recebe esse tipo de ataque sofre 1 de dano por turno, durante 3 turnos"),
    VOAR("S� pode ser bloqueada por cartas voadoras"),
    ATROPELAR("Causa o dano sobressalente ao jogador"),
    INICIATIVA("A carta n�o morre ao ser bloqueada"),
    GOLPE_DUPLO("A carta ataca duas vezes");

    public final String descricao;

    private Efeitos(String label) {
        this.descricao = label;
    }

}
