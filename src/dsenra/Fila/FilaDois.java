package dsenra.Fila;

import dsenra.Elemento;

public class FilaDois implements IFila {

    private int tamanho;
    private Elemento head, tail;

    public FilaDois() {
        tamanho = 0;
        head = tail = null;
    }

    @Override
    public void enqueue(int valor) {
        Elemento elementoTemp = new Elemento(valor);
        if(isEmpty()){
            head = elementoTemp;
        } else {
            tail.setProximoElemento(elementoTemp);
        }
        tail = elementoTemp;
        tamanho++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("A fila está vazia!");
        }
        int result = head.getValor();
        head = head.getProximoElemento();
        tamanho--;
        if(isEmpty()){
            tail = null;
        }
        return result;
    }

    @Override
    public int rear() {
        if (isEmpty()) {
            throw new IllegalArgumentException("A fila está vazia!");
        }
        return tail.getValor();
    }

    @Override
    public int front() {
        if (isEmpty()) {
            throw new IllegalArgumentException("A fila está vazia!");
        }
        return head.getValor();
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public  boolean isEmpty() {
        return tamanho == 0;
    }
}
