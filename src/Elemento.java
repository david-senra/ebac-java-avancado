public class Elemento {

    private final int numero;
    private Elemento proximoElemento;

    public Elemento(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Elemento getProximoElemento() {
        return proximoElemento;
    }

    public void setProximoElemento(Elemento proximoElemento) {
        this.proximoElemento = proximoElemento;
    }
}
