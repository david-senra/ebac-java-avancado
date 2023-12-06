package dsenra.ListaEncadeada;

import dsenra.Elemento;

public class ListaEncadeada implements IListaEncadeada {

    private Elemento head;
    private int tamanho;

    public ListaEncadeada() {
        tamanho = 0;
    }

    public void push(int valor) {
        Elemento novoElemento = new Elemento(valor);
        if (this.head == null) {
            head = novoElemento;
        } else {
            Elemento elementoAtual = head;
            while (elementoAtual.getProximoElemento() != null){
                elementoAtual = elementoAtual.getProximoElemento();
            }
            elementoAtual.setProximoElemento(novoElemento);
        }
        tamanho++;
    }

    public int pop() {
        if (size() == 0) {
            throw new IllegalArgumentException("A lista está vazia!");
        }
        else {
            Elemento elemento = head;
            for (int i = 0; i < tamanho - 2; i++) {
                elemento = elemento.getProximoElemento();
            }
            int valorRetornado = elemento.getProximoElemento().getValor();
            elemento.setProximoElemento(elemento.getProximoElemento().getProximoElemento());
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
                head = elementoInserido;
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
