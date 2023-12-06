package dsenra.MapaHash;

import dsenra.Elemento;

import java.util.Objects;

public class MapaHash implements IMapaHash {
    private Elemento[] arrayElementos;
    private final int capacidade = 10;
    private int quantidade;

    public MapaHash() {
        arrayElementos = new Elemento[capacidade];
        quantidade = 0;
    }

    private int hash(int key) {
        return key * 997 % capacidade;
    }

    @Override
    public void put(Integer key, Integer value) {
        if (quantidade == capacidade) throw new RuntimeException("Mapa de Hash esgotado!");
        int index = hash(key);
        Elemento novoElemento = new Elemento(key, value, null);
        if (arrayElementos[index] == null) arrayElementos[index] = novoElemento;
        else {
            Elemento elementoAnterior = null;
            Elemento elementoAtual = arrayElementos[index];
            while (elementoAtual != null) {
                if (elementoAtual.getKey().equals(key)) throw new RuntimeException("O valor da chave já foi inserido!");
                elementoAnterior = elementoAtual;
                elementoAtual = elementoAtual.getProximoElemento();
            }
            if (elementoAnterior != null) elementoAnterior.setProximoElemento(novoElemento);
        }
        quantidade++;
    }

    @Override
    public Integer delete(Integer key) {
        int index = hash(key);
        Elemento elementoAnterior = null;
        Elemento elemento = arrayElementos[index];
        while (elemento != null) {
            if (elemento.getKey().equals(key)) {
                int valor = elemento.getValor();
                if (elementoAnterior == null) {
                    elemento = elemento.getProximoElemento();
                    arrayElementos[index] = elemento;
                }
                else elementoAnterior.setProximoElemento(elemento.getProximoElemento());
                quantidade--;
                return valor;
            }
            elementoAnterior = elemento;
            elemento = elemento.getProximoElemento();
        }
        throw new RuntimeException("Chave não encontrada!");
    }

    @Override
    public Integer get(Integer key) {
        Integer value = null;
        int index = hash(key);
        Elemento elemento = arrayElementos[index];
        while (elemento != null){
            if (elemento.getKey().equals(key)) {
                value = elemento.getValor();
                break;
            }
            elemento = elemento.getProximoElemento();
        }
        if (value == null) throw new RuntimeException("Chave não encontrada!");
        return value;
    }

    @Override
    public void clear() {
        arrayElementos = new Elemento[capacidade];

//        Alternativa:
//
//        for (int i = 0; i < arrayElementos.length; i++) {
//            arrayElementos[i] = null;
//        }
    }

//    public void mostrarTodos() {      ** USADO DURANTE A ELABORAÇÃO PARA TESTES **
//        for(int i = 0; i < capacidade; i++){
//            if (arrayElementos[i] != null) {
//                ElementoHashMap elementoAtual = arrayElementos[i];
//                while (elementoAtual != null) {
//                    System.out.printf("A chave é %s e o valor é %s%n", elementoAtual.getKey(), elementoAtual.getValue());
//                    elementoAtual = elementoAtual.getProximoElemento();
//                }
//            }
//        }
//    }

}
