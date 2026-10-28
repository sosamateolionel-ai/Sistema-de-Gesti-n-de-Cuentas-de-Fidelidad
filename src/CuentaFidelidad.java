public class CuentaFidelidad {

    private String numeroSocio;
    private String nivelMembresia;
    private int puntosAcumulados;

    public CuentaFidelidad(String numeroSocio, String nivelMembresia) {
        this.numeroSocio = numeroSocio;
        this.nivelMembresia = nivelMembresia;
        this.puntosAcumulados = 0;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public String getNivelMembresia() {
        return nivelMembresia;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public boolean acumularPuntos(double montoCompra) {

        if (montoCompra <= 0) {
            System.out.println("Compra rechazada: el monto debe ser mayor a cero (" + montoCompra + ").");
            return false;
        }

        int puntos = calcularPuntos(montoCompra);
        puntosAcumulados = puntosAcumulados + puntos;
        System.out.println("Compra de $" + montoCompra + ": +" + puntos + " puntos. Total: " + puntosAcumulados);
        return true;
    }

    public boolean canjearPremio(int puntosRequeridos) {

        if (puntosRequeridos <= 0) {
            System.out.println("Canje rechazado: los puntos requeridos deben ser mayores a cero (" + puntosRequeridos + ").");
            return false;
        }

        if (puntosRequeridos > puntosAcumulados) {
            System.out.println("Canje rechazado: se necesitan " + puntosRequeridos
                    + " puntos y solo hay " + puntosAcumulados + ".");
            return false;
        }

        puntosAcumulados = puntosAcumulados - puntosRequeridos;
        System.out.println("Canje exitoso de " + puntosRequeridos + " puntos. Saldo: " + puntosAcumulados);
        return true;
    }

    // Regla interna: 1 punto cada $100 de compra (oculta al exterior)
    private int calcularPuntos(double montoCompra) {
        return (int) (montoCompra / 100);
    }
}