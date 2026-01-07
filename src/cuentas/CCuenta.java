package cuentas;

/**
 * Represents a simple bank account with basic operations.
 * <p>
 * This class allows checking the current balance, depositing money and withdrawing money.
 * </p>
 */
public class CCuenta {

    /** Account holder name. */
    private String nombre;

    /** Account identifier (e.g., internal account code). */
    private String cuenta;

    /** Current account balance. */
    private double saldo;

    /** Account interest rate. */
    private double tipoInterés;

    /**
     * Creates an empty account.
     */
    public CCuenta() {
        // Intentionally empty.
    }

    /**
     * Creates an account with initial data.
     *
     * @param nom  account holder name
     * @param cue  account identifier
     * @param sal  initial balance
     * @param tipo interest rate
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Returns the current balance of the account.
     *
     * @return current balance
     */
    public double estado() {
        return saldo;
    }

    /**
     * Deposits money into the account.
     *
     * @param cantidad amount to deposit
     * @throws Exception if the amount is negative
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Withdraws money from the account.
     *
     * @param cantidad amount to withdraw
     * @throws Exception if the amount is zero/negative or there is not enough balance
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * Returns the account holder name.
     *
     * @return holder name
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the account holder name.
     *
     * @param nombre holder name
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Returns the account identifier.
     *
     * @return account identifier
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sets the account identifier.
     *
     * @param cuenta account identifier
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Returns the current balance.
     *
     * @return current balance
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Sets the current balance.
     *
     * @param saldo new balance
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Returns the interest rate.
     *
     * @return interest rate
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Sets the interest rate.
     *
     * @param tipoInterés interest rate
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
