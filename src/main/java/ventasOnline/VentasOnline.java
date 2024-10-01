package ventasOnline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ventasOnline.entity.Cliente;
import ventasOnline.entity.Producto;
import ventasOnline.entity.Ventas;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

public class VentasOnline {
    public static void main(String[] args) {
        SpringApplication.run(VentasOnline.class, args);

        Cliente cliente1 = new Cliente(1L, "Maxi Sastre", "sastremaximiliano@gmail.com");
        Cliente cliente2 = new Cliente(2L, "Mariana Perez", "marianaperezbruno@gmail.com");

        Producto producto1 = new Producto("000052", "lapicera", 550, 100);
        Producto producto2 = new Producto("000145", "goma", 402.5, 50);

        List<Producto> productosVendidos = new ArrayList<>();
        productosVendidos.add(producto1);
        productosVendidos.add(producto2);

        Ventas venta1 = new Ventas("V00001", cliente1, productosVendidos);
        Ventas venta2 = new Ventas("V00002", cliente2, productosVendidos);

        producto1.actualizarStock(1);
        producto2.actualizarStock(1);

        List<Ventas> listaDeVentas = new ArrayList<>();
        listaDeVentas.add(venta1);
        listaDeVentas.add(venta2);

        listarVentas(listaDeVentas);

        System.out.println(venta1);
        System.out.println(venta2);
    }

    public static void listarVentas(List<Ventas> ventas) {
        for (Ventas venta : ventas) {
            System.out.println(venta);
        }
    }
}
