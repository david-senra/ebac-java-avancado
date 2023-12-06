package dsenra;

import dsenra.Fila.*;
import dsenra.ListaEncadeada.*;
import dsenra.MapaHash.*;
import dsenra.Pilha.*;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Primeiro Exercício - Java Avançado");
        System.out.println();
        testeListaEncadeada();
    }

    public static void testePilha() {
        IPilha pilhaTeste = new PilhaUm();
        // pilhaTeste = new PilhaDois();
        System.out.println("A pilha inicia vazia? " + pilhaTeste.isEmpty());
        System.out.println("Tamanho da pilha ao início: " + pilhaTeste.size());
        pilhaTeste.push(5);
        pilhaTeste.push(2);
        pilhaTeste.push(4);
        System.out.println("Tamanho da pilha após os pushs: " + pilhaTeste.size());
        System.out.println("Valor no topo da pilha: " + pilhaTeste.top());
        pilhaTeste.pop();
        System.out.println("Valor no topo da pilha após a remoção: " + pilhaTeste.top());
        System.out.println("Tamanho da pilha após a remoção: " + pilhaTeste.size());
        pilhaTeste.pop();
        System.out.println("Último valor no topo da pilha: " + pilhaTeste.top());
        pilhaTeste.pop();
        System.out.println("Tamanho da pilha vazia: " + pilhaTeste.size());
        pilhaTeste.push(10);
        System.out.println("Valor no topo da pilha após esvaziamento e novo push: " + pilhaTeste.top());
    }

    public static void testeFilaFIFO() {
        IFila filaTeste = new FilaUm();
        // filaTeste = new FilaDois();
        System.out.println("A fila inicia vazia? " + filaTeste.isEmpty());
        System.out.println("Tamanho da fila ao início: " + filaTeste.size());
        filaTeste.enqueue(5);
        filaTeste.enqueue(2);
        filaTeste.enqueue(4);
        System.out.println("Tamanho da fila após os enqueues: " + filaTeste.size());
        System.out.println("Valor no início da fila: " + filaTeste.front());
        System.out.println("Valor no final da fila: " + filaTeste.rear());
        filaTeste.dequeue();
        System.out.println("Valor no início da fila após dequeue: " + filaTeste.front());
        System.out.println("Valor no final da fila após dequeue: " + filaTeste.rear());
        System.out.println("Tamanho da fila após a remoção: " + filaTeste.size());
        filaTeste.dequeue();
        System.out.println("Valor remanescente na frente da fila: " + filaTeste.front());
        System.out.println("Sendo o último, ele será também o do fim da fila: " + filaTeste.front());
        filaTeste.dequeue();
        System.out.println("Tamanho da fila vazia: " + filaTeste.size());
        filaTeste.enqueue(10);
        System.out.println("Verificando o valor da frente após esvaziamento e novo enqueue: " + filaTeste.front());
    }

    public static void testeListaEncadeada() {
        IListaEncadeada listaEncTeste = new ListaEncadeada();
        System.out.println("Tamanho da lista ao início: " + listaEncTeste.size());
        listaEncTeste.push(5);
        listaEncTeste.push(2);
        listaEncTeste.push(12);
        listaEncTeste.push(39);
        listaEncTeste.push(3);
        listaEncTeste.push(9);
        listaEncTeste.push(85);
        System.out.println("Tamanho da lista após os pushs: " + listaEncTeste.size());
        System.out.println("Valor na posição 1: " + listaEncTeste.elementAt(0));
        System.out.println("Valor na posição 2: " + listaEncTeste.elementAt(1));
        System.out.println("Valor na posição 3: " + listaEncTeste.elementAt(2));
        System.out.println("Valor na posição 4: " + listaEncTeste.elementAt(3));
        System.out.println("Valor na posição 5: " + listaEncTeste.elementAt(4));
        System.out.println("Valor na posição 6: " + listaEncTeste.elementAt(5));
        System.out.println("Valor na posição 7: " + listaEncTeste.elementAt(6));
        System.out.println("Representação da Lista:");
        listaEncTeste.printList();
        listaEncTeste.remove(4);
        System.out.println("Representação da Lista após a remoção do quinto elemento:");
        listaEncTeste.printList();
        System.out.println("Novo valor na posição 1: " + listaEncTeste.elementAt(0));
        System.out.println("Novo valor na posição 2: " + listaEncTeste.elementAt(1));
        System.out.println("Novo valor na posição 3: " + listaEncTeste.elementAt(2));
        System.out.println("Novo valor na posição 4: " + listaEncTeste.elementAt(3));
        System.out.println("Novo valor na posição 5: " + listaEncTeste.elementAt(4));
        System.out.println("Novo valor na posição 6: " + listaEncTeste.elementAt(5));
        listaEncTeste.push(24);
        System.out.println("Representação da Lista após nova adição de elemento:");
        listaEncTeste.printList();
        System.out.println("Novo valor na posição 4: " + listaEncTeste.elementAt(3));
        listaEncTeste.pop();
        System.out.println("Representação da Lista após remoção do último elemento usando pop:");
        listaEncTeste.printList();
        listaEncTeste.push(13);
        listaEncTeste.insert(2, 15);
        System.out.println("Representação da Lista após inserir 13 no fim e 15 na terceira posição:");
        listaEncTeste.printList();
        System.out.println("Tamanho da lista: " + listaEncTeste.size());
        listaEncTeste.insert(0, 110);
        System.out.println("Representação da Lista após inserir 110 na primeira posição:");
        listaEncTeste.printList();
        System.out.println("Tamanho da lista: " + listaEncTeste.size());
    }

    public static void testeMapaHash() {
        System.out.println("Testando o MapaHash:");
        IMapaHash mapaHash = new MapaHash();
        mapaHash.put(13, 156);
        mapaHash.put(262, 12);
        mapaHash.put(1, 55);
        mapaHash.put(32, 72);
        mapaHash.put(155, 4);
        System.out.println("Verificando o valor correspondente à chave '13': " + mapaHash.get(13));
        System.out.println("Verificando o valor correspondente à chave '262': " + mapaHash.get(262));
        System.out.println("Verificando o valor correspondente à chave '155': " + mapaHash.get(155));
        // System.out.println("Verificando o valor correspondente à chave '5': " + mapaHash.get(5));
        mapaHash.delete(13);
        // System.out.println("Verificando se ainda existe o valor correspondente à chave '13': " + mapaHash.get(13));
        // mapaHash.delete(4); // Removendo um valor não existente para verificar o erro...
        mapaHash.clear();
        // System.out.println(mapaHash.get(1)); // Verificando a existência de um elemento após método clear()...
        // System.out.println(mapaHash.get(32)); // Verificando a existência de um elemento após método clear()...
    }
}