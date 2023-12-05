package dsenra.MapaHash;

public interface IMapaHash {
    void put(Integer key, Integer value);
    Integer delete(Integer key);
    Integer get(Integer key);
    void clear();
}
