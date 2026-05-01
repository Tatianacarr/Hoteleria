import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del huésped: ");
        String nombre = sc.nextLine();

        System.out.print("Número de noches: ");
        int noches = sc.nextInt();

        System.out.println("Tipo de habitación: 1.Simple 2.Suite 3.Familiar");
        int opcion = sc.nextInt();

        System.out.print("Cantidad de personas: ");
        int personas = sc.nextInt();

        Habitacion habitacion = null;

        switch (opcion) {
            case 1:
                habitacion = new HabitacionSimple("H001", noches);
                break;
            case 2:
                habitacion = new Suite("H002", noches);
                break;
            case 3:
                habitacion = new HabitacionFamiliar("H003", noches, personas);
                break;
        }

        if (habitacion.verificarDisponibilidad()) {

            double subtotal = habitacion.calcularHospedaje();

            double descuento = 0;
            if (noches > 5) {
                descuento = subtotal * 0.10;
            }

            double iva = subtotal * 0.15;

            System.out.println("Servicios adicionales (1=Si 0=No)");
            System.out.print("Room Service: ");
            int room = sc.nextInt();

            double recargo = 0;
            if (room == 1) recargo += 10;

            double total = subtotal - descuento + iva + recargo;
            
            System.out.println("\n===== FACTURA =====");
            System.out.println("Huésped: " + nombre);
            habitacion.mostrarDetalle();
            System.out.println("Subtotal: " + subtotal);
            System.out.println("Descuento: " + descuento);
            System.out.println("IVA: " + iva);
            System.out.println("Recargos: " + recargo);
            System.out.println("TOTAL A PAGAR: " + total);

        } else {
            System.out.println("Habitación no disponible");
        }

        sc.close();
    }
}