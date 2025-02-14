package ConClean;

class ClienteConClean {
    private String nombre;
    private boolean esVIP;

    public ClienteConClean(String nombre, boolean esVIP) {
        this.nombre = nombre;
        this.esVIP = esVIP;
    }

    public boolean esVIP() {
        return esVIP;
    }

    public String getNombre() {
        return nombre;
    }
}