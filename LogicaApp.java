package CajaRegistradora;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogicaApp {

	private List<ListaProductos> listaproductos;
	
public LogicaApp(){
	
	listaproductos = new ArrayList<>();
	
}
	
public void ingresarProductos(Scanner scanner) {
     
	ListaProductos producto = new ListaProductos();
	
	if(listaproductos.isEmpty()) {
		
		System.out.println("Ingrese el codigo del producto");
		producto.setCodigo(scanner.nextInt());
		scanner.nextLine();
		
		System.out.println("Nombre del pruducto");
		producto.setNombre(scanner.nextLine());
		
		System.out.println("Cantidad del Articulo");
		producto.setCantidad(scanner.nextInt());
		scanner.nextLine();
		
		System.out.println("Descripcion del articulo");
		producto.setDescripcion(scanner.nextLine());
		
		System.out.println("Costo del articulo - Unidad");
		producto.setPrecio(scanner.nextDouble());
		scanner.nextLine();
		
		listaproductos.add(producto);
		System.out.println("*********************************************************************");
		System.out.println("Se ha agregado el producto a la factura. Volveras al menu principal");
		System.out.println("*********************************************************************");
	}else {
		System.out.println("Esta ingresando un nuevo producto a la lista");
		
		System.out.println("Ingrese el codigo del producto");
		producto.setCodigo(scanner.nextInt());
		scanner.nextLine();
		
		System.out.println("Nombre del pruducto");
		producto.setNombre(scanner.nextLine());
		
		System.out.println("Cantidad del Articulo");
		producto.setCantidad(scanner.nextInt());
		scanner.nextLine();
		
		System.out.println("Descripcion del articulo");
		producto.setDescripcion(scanner.nextLine());
		
		System.out.println("Costo del articulo - Unidad");
		producto.setPrecio(scanner.nextDouble());
		scanner.nextLine();
		
		listaproductos.add(producto);
		System.out.println("****************************************");
		System.out.println("Se ha agregado el producto a la factura");
		System.out.println("****************************************");
	}
	
}

public void modificarProducto(int codigo, Scanner scanner){
	ListaProductos producto = buscarPorCodigo(codigo);
	if(producto != null) {
		
		System.out.println("Ingrese nombre del nuevo producto");
		producto.setNombre(scanner.nextLine());
        
		System.out.println("Ingrese la cantidad");
		producto.setCantidad(scanner.nextInt());
		scanner.nextLine();
		
		System.out.println("descripcion del producto");
		producto.setDescripcion(scanner.nextLine());
		
		System.out.println("Ingrese el precio");
		producto.setPrecio(scanner.nextInt());
		scanner.nextLine();
		
		System.out.println("Se ha modificado exitosamente");
		
	}else {
		
		System.out.println("no se encontro el producto");
		
	}
}

private ListaProductos buscarPorCodigo(int codigo){
	for(ListaProductos producto : listaproductos) {
		if(producto.getCodigo() == codigo){
			return producto;
		}
	}
	return null;
}

public void eliminarProducto(int codigo, Scanner scanner) {
	ListaProductos producto = buscarPorCodigo(codigo);
	if(producto.getCodigo() == codigo) {
		listaproductos.remove(producto);
		System.out.println("producto eliminado con exito");
	}else {
		System.out.println("producto no encontrado en el sistema");
	}
	
}

public void imprimir() {
    System.out.println("Lista de productos:");
    for (ListaProductos producto : listaproductos) {
        System.out.println("Código: " + producto.getCodigo() + ", Nombre: " + producto.getNombre() + 
                           ", Cantidad: " + producto.getCantidad() + ", Descripción: " + producto.getDescripcion() + 
                           ", Precio: " + producto.getPrecio());
    }
}

public void verDescricion(int codigo,Scanner scanner){
	ListaProductos producto = buscarPorCodigo(codigo);
	if(producto.getCodigo() == codigo){
		System.out.println("Descripcion: " + producto.getDescripcion());
	}
}

public double calcularTotalCompra() {
    double total = 0.0;
    for (ListaProductos producto : listaproductos) {
        total += producto.getPrecio() * producto.getCantidad();
    }
    return total;
}

public double calcularTotalConIVA() {
    double total = calcularTotalCompra();
    double iva = total * 0.21; 
    return total + iva;
}

}

