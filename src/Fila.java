public class Fila {

    private int tamanho;
    private Elemento head, tail;

    public Fila () {
        tamanho = 0;
        head = tail = null;
    }

    public void enqueue(int numero) {
        Elemento elementoTemp = new Elemento(numero);
        if(isEmpty()){
            head = elementoTemp;
        } else {
            tail.setProximoElemento(elementoTemp);
        }
        tail = elementoTemp;
        tamanho++;
    }

    public int dequeue() {
        if(isEmpty()){
            System.out.println("Não há elementos para remover. A fila está vazia!");
        }
        int result = head.getNumero();
        head = head.getProximoElemento();
        tamanho--;
        if(isEmpty()){
            tail = null;
        }
        return result;
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("A fila está vazia!");
        }
        return tail.getNumero();
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("A fila está vazia!");
        }
        return head.getNumero();
    }

    public  boolean isEmpty() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }

}
