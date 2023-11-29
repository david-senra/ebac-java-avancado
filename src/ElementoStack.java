public class ElementoStack {

    private final int dado;
    private ElementoStack proximoElemento;

    public ElementoStack(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public ElementoStack getProximoElemento() {
        return proximoElemento;
    }

    public void setProximoElemento(ElementoStack proximoElemento) {
        this.proximoElemento = proximoElemento;
    }
}
