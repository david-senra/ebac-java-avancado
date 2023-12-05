package dsenra.MapaHash;

public class ElementoHashMap {
    private Integer key;
    private Integer value;
    private ElementoHashMap proximoElemento;

    public ElementoHashMap(Integer key, Integer value, ElementoHashMap proximoElemento) {
        this.key = key;
        this.value = value;
        this.proximoElemento = proximoElemento;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public ElementoHashMap getProximoElemento() {
        return proximoElemento;
    }

    public void setProximoElemento(ElementoHashMap proximoElemento) {
        this.proximoElemento = proximoElemento;
    }
}
