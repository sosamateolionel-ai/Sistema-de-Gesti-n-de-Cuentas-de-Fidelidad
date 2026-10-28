//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    CuentaFidelidad cuenta = new CuentaFidelidad("SOC-1042", "Oro");

    System.out.println("Puntos iniciales: " + cuenta.getPuntosAcumulados());

    System.out.println("\n--- Compras ---");
    cuenta.acumularPuntos(5000);    // +50
    cuenta.acumularPuntos(12500);   // +125
    cuenta.acumularPuntos(-300);    // inválida

    System.out.println("\n--- Canjes ---");
    cuenta.canjearPremio(100);      // exitoso
    cuenta.canjearPremio(500);      // rechazado: faltan puntos
    cuenta.canjearPremio(75);       // exitoso, deja el saldo en 0
    cuenta.canjearPremio(1);        // rechazado: sin puntos

    System.out.println("\n--- Estado final ---");
    System.out.println("Socio: " + cuenta.getNumeroSocio() + " (" + cuenta.getNivelMembresia() + ")");
    System.out.println("Puntos: " + cuenta.getPuntosAcumulados());

}
