package poo.empresa;

public interface Pagamento {
    void fazerPix(String chavePix);

    void credito(String numeroCartao);
}
