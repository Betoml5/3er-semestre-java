public class Cliente {
    private String nombre;
    private String tipoCuenta;
    private float saldo;

    public Cliente(String nombre, String tipoCuenta, float saldo) {
        this.nombre = nombre;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "El cliente " + this.nombre + " con tipo de cuenta " + this.tipoCuenta + " tiene un saldo de "
                + this.saldo;
    }
}
