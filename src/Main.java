
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Primeiro Exercício - Java Avançado");
        System.out.println();
        Stack exemploStack = new Stack();
        System.out.println("A pilha está vazia? " + exemploStack.isEmpty());
        System.out.println("Tamanho atual da pilha: " + exemploStack.size());
        exemploStack.push(2);
        exemploStack.push(4);
        exemploStack.push(6);
        exemploStack.push(1);
        exemploStack.push(3);
        System.out.println("Tamanho atual da pilha: " + exemploStack.size());
        exemploStack.top();
        exemploStack.pop();
        exemploStack.top();
        exemploStack.pop();
        exemploStack.push(5);
        exemploStack.top();
        exemploStack.pop();
        System.out.println("A pilha está vazia? " + exemploStack.isEmpty());
        exemploStack.top();
        exemploStack.pop();
        System.out.println("Tamanho atual da pilha: " + exemploStack.size());
        exemploStack.top();
        exemploStack.pop();
        exemploStack.top();
        exemploStack.pop();
        exemploStack.top();
        exemploStack.pop();
        System.out.println("A pilha está vazia? " + exemploStack.isEmpty());
        System.out.println("Tamanho atual da pilha: " + exemploStack.size());
    }
}