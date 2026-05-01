public class Suite extends Habitacion {
    private boolean jacuzzi;
    private double servicioPremium;

    public Suite(String codigo, int noches) {
        super(codigo, "Suite", 80, noches, true);
        this.jacuzzi = true;
        this.servicioPremium = 20;
    }

    @Override
    public double calcularHospedaje() {
        return (getTarifaBase() * getNumeroNoches()) + servicioPremium;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Suite con jacuzzi y servicio premium");
    }
}