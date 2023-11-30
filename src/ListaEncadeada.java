public class ListaEncadeada {

    private Elemento head;
    private int tamanho;

    public ListaEncadeada() {
        tamanho = 0;
    }

    public void push(int numero) {
        Elemento novoElemento = new Elemento(numero);
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

    public void pop() {
        if (size() == 0) {
            System.out.println("A lista está vazia!");
        }
        else {
            Elemento elemento = head;
            for (int i = 0; i < tamanho - 2; i++) {
                elemento = elemento.getProximoElemento();
            }
            System.out.println("Último elemento removido: " + elemento.getProximoElemento().getNumero());
            elemento.setProximoElemento(elemento.getProximoElemento().getProximoElemento());
            tamanho--;
        }
    }

    public void insert(int index, int numero) {
        if (index > size() - 1) {
            System.out.println("O valor do índice extrapola o último elemento da lista!");
        }
        else {
            Elemento elementoInserido = new Elemento(numero);
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
            System.out.println("O valor do índice extrapola o último elemento da lista!");
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

    public void elementAt(int index) {
        if (index > size() - 1) {
            System.out.println("O valor do índice extrapola o último elemento da lista!");
        }
        else {
            Elemento elemento = head;
            for (int i = 0; i < index; i++) {
                elemento = elemento.getProximoElemento();
            }
            System.out.println(elemento.getNumero());
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
                System.out.println(elementoAtual.getNumero());
                elementoAtual = elementoAtual.getProximoElemento();
            }
            System.out.println(elementoAtual.getNumero());
        }
    }
}
