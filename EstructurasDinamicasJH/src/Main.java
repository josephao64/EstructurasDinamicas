import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> listaDoble = new DoublyLinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Lista Doblemente Enlazada");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Recorrer hacia adelante");
            System.out.println("4. Recorrer hacia atrás");
            System.out.println("5. Mostrar tamaño de la lista");
            System.out.println("6. Mostrar si la lista está vacía");
            System.out.println("7. Buscar elemento por valor");
            System.out.println("8. Buscar elemento por índice");
            System.out.println("9. Borrar un elemento");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a insertar al inicio: ");
                    int valorInicio = scanner.nextInt();
                    listaDoble.insertAtHead(valorInicio);
                    break;
                case 2:
                    System.out.print("Ingrese el valor a insertar al final: ");
                    int valorFinal = scanner.nextInt();
                    listaDoble.insertAtTail(valorFinal);
                    break;
                case 3:
                    System.out.println("Recorriendo hacia adelante:");
                    listaDoble.traverseForward();
                    break;
                case 4:
                    System.out.println("Recorriendo hacia atrás:");
                    listaDoble.traverseBackward();
                    break;
                case 5:
                    System.out.println("Tamaño de la lista: " + listaDoble.size());
                    break;
                case 6:
                    System.out.println("La lista está vacía: " + listaDoble.isEmpty());
                    break;
                case 7:
                    System.out.print("Ingrese el valor a buscar: ");
                    int valorBuscar = scanner.nextInt();
                    Node<Integer> nodoEncontrado = listaDoble.searchByValue(valorBuscar);
                    if (nodoEncontrado != null) {
                        System.out.println("Elemento encontrado en la lista.");
                    } else {
                        System.out.println("Elemento no encontrado en la lista.");
                    }
                    break;
                case 8:
                    System.out.print("Ingrese el índice a buscar: ");
                    int indiceBuscar = scanner.nextInt();
                    Node<Integer> nodoPorIndice = listaDoble.searchByIndex(indiceBuscar);
                    if (nodoPorIndice != null) {
                        System.out.println("Elemento en el índice " + indiceBuscar + ": " + nodoPorIndice.item);
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;
                case 9:
                    System.out.print("Ingrese el índice del elemento a borrar: ");
                    int indiceBorrar = scanner.nextInt();
                    listaDoble.deleteFromPosition(indiceBorrar);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }

        } while (opcion != 0);
    }
}
