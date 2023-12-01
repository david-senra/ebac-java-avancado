package dsenra.Pilha;

import dsenra.Elemento;

public class PilhaDois implements IPilha {

    int tamanho = 0;
    Elemento primeiroElemento = null;

    @Override
    public void push(int valor) {
        Elemento elementoTemp = new Elemento(valor);
        elementoTemp.setProximoElemento(primeiroElemento);
        primeiroElemento = elementoTemp;
        tamanho++;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("A pilha está vazia!");
        }
        else {
            Elemento elemento = primeiroElemento;
            primeiroElemento = primeiroElemento.getProximoElemento();
            tamanho--;
            return elemento.getValor();
        }
    }

    @Override
    public int top() {
        if (isEmpty()) {
            throw new IllegalArgumentException("A pilha está vazia!");
        }
        else {
            return primeiroElemento.getValor();
        }
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }
}
