public class HabitacionSimple extends Habitacion {
    private boolean desayunoIncluido;
    private double costoServicioBasico;

    public HabitacionSimple(String codigo, int noches) {
        super(codigo, "Simple", 35, noches, true);
        this.desayunoIncluido = true;
        this.costoServicioBasico = 5;
    }

    @Override
    public double calcularHospedaje() {
        return getTarifaBase() * getNumeroNoches() + costoServicioBasico;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Habitación Simple con desayuno incluido");
    }
}