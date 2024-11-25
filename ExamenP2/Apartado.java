import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Apartado {
    private int idApartado;
    private String fechaApartado;
    private String fechaVencimiento;
    private double montoApartado;

    // Estructuras de datos para manejar el historial y la cola de apartados
    private static ArrayList<Apartado> historialApartados = new ArrayList<>();
    private static Queue<Apartado> colaApartados = new LinkedList<>();
    private static final String NOMBRE_ARCHIVO = "apartados.txt";

    // Constructor
    public Apartado(int idApartado, String fechaApartado, String fechaVencimiento, double montoApartado) {
        if (montoApartado <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo.");
        }
        this.idApartado = idApartado;
        this.fechaApartado = fechaApartado;
        this.fechaVencimiento = fechaVencimiento;
        this.montoApartado = montoApartado;

        // Agregar el apartado a las estructuras de datos
        historialApartados.add(this);
        colaApartados.add(this);
    }

    // Getters y Setters
    public int getIdApartado() {
        return idApartado;
    }

    public void setIdApartado(int idApartado) {
        this.idApartado = idApartado;
    }

    public String getFechaApartado() {
        return fechaApartado;
    }

    public void setFechaApartado(String fechaApartado) {
        this.fechaApartado = fechaApartado;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getMontoApartado() {
        return montoApartado;
    }

    public void setMontoApartado(double montoApartado) {
        if (montoApartado <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo.");
        }
        this.montoApartado = montoApartado;
    }

    // Muestra detalles del apartado
    public void mostrarDetalles() {
        System.out.println("\n---------------------------------------------------");
        System.out.println("ID Apartado: " + idApartado);
        System.out.println("Fecha Apartado: " + fechaApartado);
        System.out.println("Fecha Vencimiento: " + fechaVencimiento);
        System.out.println("Monto Apartado: " + montoApartado);
        System.out.println("\n---------------------------------------------------");
    }

    // Guarda el apartado en un archivo de texto
    public void guardarEnArchivo() {
        try (FileWriter fw = new FileWriter(NOMBRE_ARCHIVO, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {
            pw.println(idApartado + "," + fechaApartado + "," + fechaVencimiento + "," + montoApartado);
            System.out.println("Apartado guardado en archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar en archivo: " + e.getMessage());
        }
    }

    // Carga todos los apartados desde un archivo de texto
    public static void cargarDesdeArchivo() {
        try (FileReader fr = new FileReader(NOMBRE_ARCHIVO);
             BufferedReader br = new BufferedReader(fr)) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[0]);
                String fechaApartado = datos[1];
                String fechaVencimiento = datos[2];
                double monto = Double.parseDouble(datos[3]);

                Apartado apartado = new Apartado(id, fechaApartado, fechaVencimiento, monto);
                historialApartados.add(apartado);
                colaApartados.add(apartado);
            }
            System.out.println("Apartados cargados desde el archivo.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al cargar el archivo: " + e.getMessage());
        }
    }

    // Deshacer el último apartado añadido (simulando pila con ArrayList)
    public static void deshacerUltimoApartado() {
        if (!historialApartados.isEmpty()) {
            Apartado ultimoApartado = historialApartados.remove(historialApartados.size() - 1);
            colaApartados.remove(ultimoApartado);
            System.out.println("Se ha deshecho el último apartado: ID " + ultimoApartado.getIdApartado());
        } else {
            System.out.println("No hay apartados para deshacer.");
        }
    }

    // Procesar el siguiente apartado (ejemplo usando cola)
    public static void procesarSiguienteApartado() {
        if (!colaApartados.isEmpty()) {
            Apartado siguienteApartado = colaApartados.poll();
            System.out.println("Procesando apartado: ID " + siguienteApartado.getIdApartado());
        } else {
            System.out.println("No hay apartados para procesar.");
        }
    }

    // Mostrar todos los apartados
    public static void mostrarTodosLosApartados() {
        if (historialApartados.isEmpty()) {
            System.out.println("No hay apartados registrados.");
        } else {
            for (Apartado apartado : historialApartados) {
                apartado.mostrarDetalles();
                System.out.println("-------------------------");
            }
        }
    }

    // Menú de opciones
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Apartados ---");
            System.out.println("1. Agregar apartado");
            System.out.println("2. Deshacer último apartado");
            System.out.println("3. Procesar siguiente apartado");
            System.out.println("4. Mostrar todos los apartados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarApartado(scanner);
                    break;
                case 2:
                    deshacerUltimoApartado();
                    break;
                case 3:
                    procesarSiguienteApartado();
                    break;
                case 4:
                    mostrarTodosLosApartados();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    // Método para agregar un nuevo apartado
    public static void agregarApartado(Scanner scanner) {
        System.out.print("Ingrese ID del apartado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer
        System.out.print("Ingrese fecha del apartado (AAAA-MM-DD): ");
        String fechaApartado = scanner.nextLine();
        System.out.print("Ingrese fecha de vencimiento (AAAA-MM-DD): ");
        String fechaVencimiento = scanner.nextLine();
        System.out.print("Ingrese monto del apartado: ");
        double monto = scanner.nextDouble();

        Apartado nuevoApartado = new Apartado(id, fechaApartado, fechaVencimiento, monto);
        nuevoApartado.guardarEnArchivo();
        System.out.println("Apartado agregado con éxito.");
    }

    public static void main(String[] args) {
        cargarDesdeArchivo(); // Cargar apartados desde archivo al iniciar el programa
        mostrarMenu();        // Mostrar menú de opciones
    }
}
