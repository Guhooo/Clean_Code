package ConClean;

class TiendaConClean {
    public void procesarOrden(ClienteConClean cliente, double precio) {
        validarPrecio(precio);

        double total = CalculadoraDescuentoConClean.aplicarDescuento(cliente, precio);

        imprimirRecibo(cliente, total);
    }

    private void validarPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0.");
        }
    }

    private void imprimirRecibo(ClienteConClean cliente, double total) {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Total a pagar: " + total);
    }
}
