# Sistema de Gestión de Cuentas de Fidelidad

## Descripción

Este proyecto implementa un sistema de fidelización de clientes que permite acumular puntos a partir de compras y canjearlos por premios. Utiliza encapsulamiento para proteger el saldo de puntos y validaciones para impedir operaciones inválidas o canjes que superen los puntos disponibles.

## Funcionamiento

El programa realiza las siguientes operaciones:

1. Crea una cuenta de fidelidad para el socio `SOC-1042`, con nivel de membresía `Oro` y cero puntos iniciales.
2. Registra una compra de $5000, que genera 50 puntos.
3. Registra una compra de $12500, que genera 125 puntos.
4. Rechaza una compra de -$300 por tener un monto inválido.
5. Canjea 100 puntos correctamente.
6. Rechaza el canje de 500 puntos porque el saldo es insuficiente.
7. Canjea 75 puntos y deja el saldo en cero.
8. Rechaza el canje de 1 punto porque ya no quedan puntos disponibles.
9. Muestra el número de socio, su nivel de membresía y el saldo final.

## Clases principales

### Clase `CuentaFidelidad`

Representa la cuenta de fidelidad de un cliente y administra sus puntos.

**Atributos:**

* `numeroSocio`: identificador del socio.
* `nivelMembresia`: nivel de membresía del cliente.
* `puntosAcumulados`: cantidad de puntos disponibles en la cuenta.

**Métodos principales:**

* `CuentaFidelidad(String numeroSocio, String nivelMembresia)`: inicializa los datos del socio y establece los puntos en cero.
* `getNumeroSocio()`: devuelve el número de socio.
* `getNivelMembresia()`: devuelve el nivel de membresía.
* `getPuntosAcumulados()`: devuelve el saldo actual de puntos.
* `acumularPuntos(double montoCompra)`: valida el monto, calcula los puntos obtenidos y los suma al saldo. Devuelve `true` si la compra se acepta y `false` si se rechaza.
* `canjearPremio(int puntosRequeridos)`: valida los puntos requeridos y comprueba que exista saldo suficiente antes de descontarlos. Devuelve `true` si el canje es exitoso y `false` en caso contrario.
* `calcularPuntos(double montoCompra)`: método privado que calcula un punto por cada $100 de compra completa.

## Conceptos de programación utilizados

* **Encapsulamiento:** los atributos son `private` para impedir modificaciones directas desde otras clases.
* **Constructores:** inicializan los datos de la cuenta y el saldo de puntos.
* **Métodos de acceso (getters):** permiten consultar los datos sin modificar directamente los atributos.
* **Métodos privados:** `calcularPuntos()` oculta la regla interna de cálculo.
* **Validación de datos:** se rechazan compras con montos menores o iguales a cero y canjes con cantidades inválidas.
* **Acumulación y descuento:** los puntos aumentan con las compras válidas y disminuyen con los canjes exitosos.
* **Condicionales:** permiten comprobar si una operación puede realizarse.
* **Retorno booleano:** informa si la compra o el canje se completaron correctamente.

## Tecnologías utilizadas

* Java.
* IntelliJ IDEA.
* Programación orientada a objetos (POO).

## Ejecución

<img width="597" height="525" alt="image" src="https://github.com/user-attachments/assets/a6ba3332-7136-4825-bee1-915a502e64bd" />

## Resultado esperado

El programa comienza con cero puntos. Las dos compras válidas generan 175 puntos en total. Después del canje de 100 puntos, quedan 75; el intento de canjear 500 puntos se rechaza. El canje posterior de 75 puntos deja el saldo en cero, por lo que el último intento de canje también se rechaza.

El estado final debe ser:

* **Socio:** `SOC-1042`
* **Nivel de membresía:** `Oro`
* **Puntos acumulados:** `0`

## Objetivo del ejercicio

Aplicar encapsulamiento, métodos privados y validaciones para administrar una cuenta de fidelidad, garantizando que los puntos solo puedan acumularse mediante compras válidas y canjearse cuando exista saldo suficiente.

## Estructura del proyecto

```text
GestionCuentasFidelidad/
├── src/
│   ├── CuentaFidelidad.java
│   └── Main.java
└── README.md
```
