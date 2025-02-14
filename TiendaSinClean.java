package SinClean;

class TiendaSinClean {
    public void procesarOrden(String cliente, double precio) {
        if (precio <= 0) {
            System.out.println("Error: Precio inválido.");
            return;
        }

        double descuento = 0;
        if (cliente.equals("VIP")) {
            descuento = precio * 0.15; // Descuento fijo
        }

        double total = precio - descuento;
        System.out.println("Cliente: " + cliente);
        System.out.println("Total a pagar: " + total);
    }
}