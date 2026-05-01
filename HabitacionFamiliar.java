 public class HabitacionFamiliar extends Habitacion {
    private int capacidadPersonas;
    private double descuentoFamiliar;

    public HabitacionFamiliar(String codigo, int noches, int personas) {
        super(codigo, "Familiar", 60, noches, true);
        this.capacidadPersonas = personas;
        this.descuentoFamiliar = 0.1;
    }

    @Override
    public double calcularHospedaje() {
        double total = getTarifaBase() * getNumeroNoches();
        return total - (total * descuentoFamiliar);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Habitación Familiar para varias personas");
    }
}