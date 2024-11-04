public class Cuenta {

    private int id;
    private String propietario;
    private int dinero;
    private int cuenta;
    private int contra;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void sacarDinero(int dinero) {
        this.dinero -= dinero;
    }

    public void ingresarDinero(int dinero) {
        this.dinero += dinero;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getContra() {
        return contra;
    }

    public void setContra(int contra) {
        this.contra = contra;
    }

    public Cuenta(int id, String propietario, int dinero, int cuenta, int contra) {
        this.id = id;
        this.propietario = propietario;
        this.dinero = dinero;
        this.cuenta = cuenta;
        this.contra = contra;
    }
}
