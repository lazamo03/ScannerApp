package CajaRegistradora;

	public class ListaProductos {
		    
			private int codigo;
			private String nombre;
			private int cantidad;
			private String descripcion;
			private double precio;
			
			
			public int getCodigo() {
				return codigo;
			}
			public void setCodigo(int codigo) {
				this.codigo = codigo;
			} 

			public String getNombre(){
				return nombre;
			}
			
			public void setNombre(String nombre){
				this.nombre = nombre;
			}
			
			public int getCantidad(){
				return cantidad;
			}
			
			public void setCantidad(int cantidad){
				this.cantidad = cantidad;
			}
			
			public String getDescripcion(){
				return descripcion;
			}
			
			public void setDescripcion(String descripcion){
				this.descripcion = descripcion;
			}
			
			public double getPrecio() {
				return precio;
			}
			
			public void setPrecio(double precio) {
				this.precio = precio;
			}
			
}

