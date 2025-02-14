package ConClean;

public class MainConClean {
     public static void main(String[] args) {
        ClienteConClean clienteVIP = new ClienteConClean("Juan Pérez", true);
        TiendaConClean tienda = new TiendaConClean();
        tienda.procesarOrden(clienteVIP, 100);
    }
}

