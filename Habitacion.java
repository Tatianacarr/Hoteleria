public abstract class Habitacion {
    private String codigo;
    private String tipoHabitacion;
    private double tarifaBase;
    private int numeroNoches;
    private boolean disponible;

    public Habitacion(String codigo, String tipoHabitacion, double tarifaBase, int numeroNoches, boolean disponible) {
        this.codigo = codigo;
        this.tipoHabitacion = tipoHabitacion;
        setTarifaBase(tarifaBase);
        setNumeroNoches(numeroNoches);
        this.disponible = disponible;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        if (tarifaBase > 0) {
            this.tarifaBase = tarifaBase;
        } else {
            this.tarifaBase = 10;
        }
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public void setNumeroNoches(int numeroNoches) {
        if (numeroNoches > 0) {
            this.numeroNoches = numeroNoches;
        } else {
            this.numeroNoches = 1;
        }
    }

    public boolean verificarDisponibilidad() {
        return disponible;
    }
    public abstract double calcularHospedaje();
    public abstract void mostrarDetalle();
    public double calcularPago(int noches) {
        return noches * tarifaBase;
    }
    public double calcularPago(int noches, double descuento) {
        return (noches * tarifaBase) - descuento;
    }
}