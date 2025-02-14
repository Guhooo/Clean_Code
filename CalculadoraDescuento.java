package ConClean;

class CalculadoraDescuentoConClean {
    private static final double DESCUENTO_VIP = 0.15;

    public static double aplicarDescuento(ClienteConClean cliente, double precio) {
        if (cliente.esVIP()) {
            return precio * (1 - DESCUENTO_VIP);
        }
        return precio;
    }
}