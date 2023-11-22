import java.util.HashMap;
import java.util.Map;

class SistemaGestionTiendas {
    private Map<String, Tienda> tiendas;

    public SistemaGestionTiendas() {
        this.tiendas = new HashMap<>();
    }

    public void agregarTienda(String nombre, Tienda tienda) {
        tiendas.put(nombre, tienda);
        System.out.println("Tienda agregada correctamente.");
    }

    public void eliminarTienda(String nombre) {
        if (tiendas.containsKey(nombre)) {
            tiendas.remove(nombre);
            System.out.println("Tienda eliminada correctamente.");
        } else {
            System.out.println("No se encontró una tienda con ese nombre.");
        }
    }

    public Tienda buscarPorNombre(String nombre) {
        return tiendas.get(nombre);
    }

    public void listarTiendas() {
        System.out.println("Listado de Tiendas:");
        for (Map.Entry<String, Tienda> entry : tiendas.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", " + entry.getValue());
        }
    }

    // Implementa al menos dos métodos de búsqueda adicionales
    public Tienda buscarPorVentas(int ventas) {
        for (Tienda tienda : tiendas.values()) {
            if (tienda.getVentas() == ventas) {
                return tienda;
            }
        }
        return null;
    }

    public Tienda buscarPorDevoluciones(int devoluciones) {
        for (Tienda tienda : tiendas.values()) {
            if (tienda.getDevoluciones() == devoluciones) {
                return tienda;
            }
        }
        return null;
    }
}
