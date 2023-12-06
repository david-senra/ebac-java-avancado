package dsenra;

public class Elemento {
    private Integer key;
    private final Integer valor;
    private Elemento proximoElemento;

    public Elemento(int valor) {
        this.valor = valor;
    }

    public Elemento(Integer key, Integer valor, Elemento proximoElemento) {
        this.key = key;
        this.valor = valor;
        this.proximoElemento = proximoElemento;
    }

    public Integer getKey() {
        return key;
    }

    public Integer getValor() {
        return valor;
    }

    public Elemento getProximoElemento() {
        return proximoElemento;
    }

    public void setProximoElemento(Elemento proximoElemento) {
        this.proximoElemento = proximoElemento;
    }
}
