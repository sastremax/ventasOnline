package ventasOnline.entity;

import java.util.List;

public class Ventas {

    private String idVenta;
    private ventasOnline.entity.Cliente cliente;
    private double total;
    private List<ventasOnline.entity.Producto> productos;

    public Ventas(String idVenta, ventasOnline.entity.Cliente cliente, List<ventasOnline.entity.Producto> productos) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.productos = productos;
        this.total = calcularTotal();
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public ventasOnline.entity.Cliente getCliente() {
        return cliente;
    }

    public void setCliente(ventasOnline.entity.Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<ventasOnline.entity.Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<ventasOnline.entity.Producto> productos) {
        this.productos = productos;
        this.total = calcularTotal();
    }

    private double calcularTotal() {
        double total = 0;
        for (ventasOnline.entity.Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public static void listarVentas(List<Ventas> ventas) {
        for (Ventas venta : ventas) {
            System.out.println(venta);
        }
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta='" + idVenta + '\'' + "cliente= " + cliente + "productos= " + productos + "total= " + total + '}';
    }

}
