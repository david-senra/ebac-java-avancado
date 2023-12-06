package dsenra.ListaEncadeada;

import dsenra.Elemento;

public class ListaEncadeada implements IListaEncadeada {

    private Elemento head;

    private Elemento tail;
    private int tamanho;

    public ListaEncadeada() {
        tamanho = 0;
    }

    public void push(int valor) {
        Elemento novoElemento = new Elemento(valor);
        if (this.head == null) {
            head = tail = novoElemento;
        } else {
            tail.setProximoElemento(novoElemento);
            Elemento elementoAnterior = tail;
            tail = novoElemento;
            tail.setElementoAnterior(elementoAnterior);
        }
        tamanho++;
    }

    public int pop() {
        if (size() == 0) {
            throw new IllegalArgumentException("A lista está vazia!");
        }
        else {
            int valorRetornado = tail.getValor();
            tail = tail.getElementoAnterior();
            tail.setProximoElemento(null);
            tamanho--;
            return valorRetornado;
        }
    }

    public void insert(int index, int valor) {
        if (index > size() - 1) {
            throw new IndexOutOfBoundsException("O valor do índice extrapola o último elemento da lista!");
        }
        else {
            Elemento elementoInserido = new Elemento(valor);
            tamanho++;
            if (index == 0) {
                elementoInserido.setProximoElemento(head);
                Elemento proximoElemento = head;
                head = elementoInserido;
                proximoElemento.setElementoAnterior(head);
            }
            else {
                Elemento elemento = head;
                for (int i = 0; i < index - 1; i++){
                    elemento = elemento.getProximoElemento();
                }
                elementoInserido.setProximoElemento(elemento.getProximoElemento());
                elemento.setProximoElemento(elementoInserido);
            }
        }
    }

    public void remove(int index) {
        if (index > size() - 1) {
            throw new IndexOutOfBoundsException("O valor do índice extrapola o último elemento da lista!");
        }
        else {
            Elemento elemento = head;
            for (int i = 0; i < index - 1; i++){
                elemento = elemento.getProximoElemento();
            }
            elemento.setProximoElemento(elemento.getProximoElemento().getProximoElemento());
            tamanho--;
        }
    }

    public int elementAt(int index) {
        if (index > size() - 1) {
            throw new IndexOutOfBoundsException("O valor do índice extrapola o último elemento da lista!");
        }
        else {
            Elemento elemento = head;
            for (int i = 0; i < index; i++) {
                elemento = elemento.getProximoElemento();
            }
            return elemento.getValor();
        }
    }

    public int size() {
        return tamanho;
    }

    public void printList(){
        if (head == null) {
            System.out.println("Lista vazia!");
        }
        else {
            Elemento elementoAtual = head;
            while (elementoAtual.getProximoElemento() != null){
                System.out.println(elementoAtual.getValor());
                elementoAtual = elementoAtual.getProximoElemento();
            }
            System.out.println(elementoAtual.getValor());
        }
    }
}
