package cuentas;
/**
 * Esta clase define las operaciones que se pueden realizar con el saldo, aumentándolo, disminuyéndolo o manteniéndolo
 * @author Manuel Acevedo Sánchez
 * @version 2.1
 * @category tareas
 * @see <a href=https://github.com/manuelacevedosanchez/repository1>Repositorio en GitHub</a>
 */
/**
 * @author PheloPC
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    /**
     * @param nom nombre del titular
     * @param cue cuenta sobre la que se opera
     * @param sal saldo en cada momento
     * @param tipo tipo de interés aplicable a la operación
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * @return devuelve el saldo actual
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * @param cantidad monto de importe para la operación
     * @throws Exception mensaje que se muestra en pantalla para valores negativos no admisibles
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * @param cantidad monto de importe para la operación
     * @throws Exception mensaje que se muestra en pantalla para valores negativos no admisibles o si la cantidad supera el saldo disponible
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * Getters y Setters para obtener y retornar valores asociados a los parámetros
	 */    
    
	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInteres() {
		return tipoInteres;
	}

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
