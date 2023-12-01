package dsenra;

public class Elemento {

    private final int valor;
    private Elemento proximoElemento;

    public Elemento(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public Elemento getProximoElemento() {
        return proximoElemento;
    }

    public void setProximoElemento(Elemento proximoElemento) {
        this.proximoElemento = proximoElemento;
    }
}
