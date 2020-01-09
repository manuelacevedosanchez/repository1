package cuentas;
/**
 * Esta clase define las operaciones que se pueden realizar con el saldo, aumentándolo, disminuyéndolo o manteniéndolo
 * @author Manuel Acevedo Sánchez
 * @version 2.1
 * @category tareas
 * @see <a href=https://github.com/manuelacevedosanchez/repository1>Repositorio en GitHub</a>
 */
public class Main {

    /**
     * Punto de partida del programa
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        operativa_cuenta(cuenta1, 0);
    }

    /**
     * Método que define las operaciones sobre el saldo disponible
     * si la cantidad a ingresar es positiva o la cantidad a retirar es negativa e inferior al saldo, se realiza la operación
     * en el resto de casos se produce una excepción
     * @param cuenta1 Cuenta de referencia para el saldo
     * @param cantidad monto con el que se opera sobre el saldo
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar"); //mensaje que se imprime en pantalla en relación a la exepción
        }
        try {
            System.out.println("Ingreso en cuenta"); //mensaje que se imprime en pantalla en relación a la cantidad ingresada
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar"); //mensaje que se imprime en pantalla en relación a la exepción
        }
    }
}