import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cola<T> {
    private Queue<T> cola;

    public Cola() {
        cola = new LinkedList<>();
    }

    public void enqueue(T elemento) {
        cola.add(elemento);
    }

    public T dequeue() {
        if (!cola.isEmpty()) {
            return cola.poll();
        } else {
            System.out.println("La cola está vacía.");
            return null;
        }
    }

    public T peek() {
        if (!cola.isEmpty()) {
            return cola.peek();
        } else {
            System.out.println("La cola está vacía.");
            return null;
        }
    }

    public void mostrarElementos() {
        if (!cola.isEmpty()) {
            System.out.println("Elementos de la cola: " + cola);
        } else {
            System.out.println("La cola está vacía.");
        }
    }

    public int obtenerTamaño() {
        return cola.size();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cola<Integer> cola = new Cola<>();

        int opcion;

        do {
            System.out.println("\n--- Menú de Cola ---");
            System.out.println("1. Enqueue (Agregar elemento)");
            System.out.println("2. Dequeue (Quitar elemento)");
            System.out.println("3. Peek (Ver frente de la cola)");
            System.out.println("4. Mostrar elementos de la cola");
            System.out.println("5. Tamaño de la cola");
            System.out.println("6. ¿La cola está vacía?");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    int elementoEnqueue = scanner.nextInt();
                    cola.enqueue(elementoEnqueue);
                    break;

                case 2:
                    Integer elementoDequeue = cola.dequeue();
                    if (elementoDequeue != null) {
                        System.out.println("Elemento removido: " + elementoDequeue);
                    }
                    break;

                case 3:
                    Integer frenteCola = cola.peek();
                    if (frenteCola != null) {
                        System.out.println("Frente de la cola: " + frenteCola);
                    }
                    break;

                case 4:
                    cola.mostrarElementos();
                    break;

                case 5:
                    System.out.println("Tamaño de la cola: " + cola.obtenerTamaño());
                    break;

                case 6:
                    System.out.println("¿La cola está vacía? " + cola.estaVacia());
                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}