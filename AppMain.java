package CajaRegistradora;
import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		LogicaApp logica = new LogicaApp();
		int opcion;
		
		do {
			
			System.out.println("Menu de opciones");
			System.out.println("1) Ingresar Producto");
			System.out.println("2) Modificar el producto");
			System.out.println("3) Borrar producto");
			System.out.println("4) descripcion del producto");
			System.out.println("5) Ver lista de productos");
			System.out.println("6) calcular valor total");
			System.out.println("7) Calcular valor con iva");
			System.out.println("8) Salir del programa");
			
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			
			switch(opcion) {
			case 1:
			         logica.ingresarProductos(scanner);
				break;
				
			case 2:
				System.out.println("Ingrese el codigo producto cual quiere modificar la informacion");
				int modificarcodigo = scanner.nextInt();
				scanner.nextLine();
				logica.modificarProducto(modificarcodigo, scanner);
				break;
			
			case 3:
				System.out.println("Ingrese el codigo producto cual va a eliminar");
				int codigoEliminar = scanner.nextInt();
				scanner.nextLine();
				logica.eliminarProducto(codigoEliminar, scanner);
				break;
				
			case 4:
				System.out.println("Ingresa el codigo el producto");
				int codigoDescripcion = scanner.nextInt();
				scanner.nextLine();
				logica.verDescricion(codigoDescripcion, scanner);
				break;
				
			case 5:
                logica.imprimir();
                break;
                
			case 6:
				System.out.println("El valor total de la compra sin iva es: " + logica.calcularTotalCompra());
				break;
				
			case 7:
				System.out.println("El valor total con iva es: " + logica.calcularTotalConIVA());
				break;
			}
			
		}
		
		while(opcion !=8 );
		
	scanner.close();	
	}
}
