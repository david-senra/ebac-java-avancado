public class Pilha {

    int tamanho = 0;
    Elemento primeiroElemento = null;

    public Pilha() {
    }

    public void push(int numero) {
        Elemento elementoTemp = new Elemento(numero);
        elementoTemp.setProximoElemento(primeiroElemento);
        primeiroElemento = elementoTemp;
        tamanho++;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Não há elementos para remover. A pilha está vazia!");
        }
        else {
            Elemento elemento = primeiroElemento;
            primeiroElemento = primeiroElemento.getProximoElemento();
            tamanho--;
            System.out.print("Removendo o elemento no topo da pilha, que é: ");
            System.out.print(elemento.getNumero());
            System.out.println();
        }
    }

    public void top() {
        if (isEmpty()) {
            System.out.println("Não há elemento no topo. A pilha está vazia!");
        }
        else {
            System.out.print("O atual elemento no topo da pilha é: ");
            System.out.println(primeiroElemento.getNumero());
        }
    }

    public int size(){
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
}
