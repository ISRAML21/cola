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
            System.out.println("LA COLA ESTÁ VACÍA");
            return null;
        }
    }

    public T peek() {
        if (!cola.isEmpty()) {
            return cola.peek();
        } else {
            System.out.println("LA COLA ESTÁ VACÍA");
            return null;
        }
    }

    public void mostrarElementos() {
        if (!cola.isEmpty()) {
            System.out.println("Elementos de la cola: " + cola);
        } else {
            System.out.println("A COLA ESTÁ VACÍA");
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
            System.out.println("1. AGREGAR ELEMENTO (Enqueue) ");
            System.out.println("2. QUITAR ELEMENTO (Dequeue) ");
            System.out.println("3. VER FRENTE DE LA COLA (Peek) ");
            System.out.println("4. MOSTRAER ELEMENTOS DE LA COLA");
            System.out.println("5. TAMAÑO DE LA COLA");
            System.out.println("6. ¿LA COLA SE ENCUENTRA VACÍA?");
            System.out.println("7. SALIR");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("INTRODUZCA EL ELEMENTO A AGREGAR: ");
                    int elementoEnqueue = scanner.nextInt();
                    cola.enqueue(elementoEnqueue);
                    break;

                case 2:
                    Integer elementoDequeue = cola.dequeue();
                    if (elementoDequeue != null) {
                        System.out.println("ELEMENTO ELIMINADO: " + elementoDequeue);
                    }
                    break;

                case 3:
                    Integer frenteCola = cola.peek();
                    if (frenteCola != null) {
                        System.out.println("FRENTE DE LA COLA: " + frenteCola);
                    }
                    break;

                case 4:
                    cola.mostrarElementos();
                    break;

                case 5:
                    System.out.println("TAMAÑO DE LA COLA: " + cola.obtenerTamaño());
                    break;

                case 6:
                    System.out.println("¿LA COLA SE ENCUENTRA VACÍA? " + cola.estaVacia());
                    break;

                case 7:
                    System.out.println("SALIENDO DEL PROGRAMA...");
                    break;

                default:
                    System.out.println("OPCION NO VAIDA, INTENTE NUEVAMENTE.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }
}