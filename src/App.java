import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree();
    }

    public static void runBinaryTree(){
        BinaryTree<String> arbolStrings= new BinaryTree<>();
        BinaryTree<Persona> arbolPersonas= new BinaryTree<>();
        
        arbolPersonas.add(new Persona("pablo",30));
        arbolPersonas.add(new Persona("ana",30));
        arbolPersonas.add(new Persona("luis",30));
        arbolPersonas.add(new Persona("maria",30));
    }

    
    public static void runIntTree(){

        
        IntTree arbolNumero = new IntTree();
        Node <Integer> nodo1 = new Node<>(50);
        Node <Integer> nodo2 = new Node<>(10);
        Node <Integer> nodo3 = new Node<>(30);

        arbolNumero.setRoot(nodo1);
        nodo1.setRight(nodo2);
        nodo2.setLeft(nodo3);

        System.out.println(arbolNumero.getRoot());
        System.out.println(arbolNumero.getRoot().getRight());
        System.out.println(arbolNumero.getRoot().getLeft());

        //nodo3.setLeft(nodo1);

        System.out.println("Preorden:");
        arbolNumero.preOrder();

        System.out.println("Inorden:");
        arbolNumero.inOrden();

        System.out.println("Postorden:");
        arbolNumero.posOrder();

        System.out.println("Arbol Altura: "+arbolNumero.getHeight());
        System.out.println("Peso: "+arbolNumero.getPeso());
    }
}