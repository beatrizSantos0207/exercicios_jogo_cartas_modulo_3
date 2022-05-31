package JogoCartas.enums;

public enum Efeitos {

    RECUPERAR_VIDA("Recupera vida"),
    PERFURANTE("O ataque atravessa 1 de resistência"),
    FOGO("Causa 2 de dano"),
    PANCADA("A carta que recebe esse tipo de ataque não consegue atacar por um turno"),
    VENENOSO("A carta envenenada morre em 3 turnos"),
    SANGRAMENTO("A carta que recebe esse tipo de ataque sofre 1 de dano por turno, durante 3 turnos"),
    VOAR("Só pode ser bloqueada por cartas voadoras"),
    ATROPELAR("Causa o dano sobressalente ao jogador"),
    INICIATIVA("A carta não morre ao ser bloqueada"),
    GOLPE_DUPLO("A carta ataca duas vezes");

    public final String descricao;

    private Efeitos(String label) {
        this.descricao = label;
    }

}
