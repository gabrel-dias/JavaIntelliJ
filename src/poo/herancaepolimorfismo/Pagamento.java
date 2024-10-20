package poo.herancaepolimorfismo;

public interface Pagamento {
    void fazerPix(String chavePix);

    void credito(String numeroCartao);
}
