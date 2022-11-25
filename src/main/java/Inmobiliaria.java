import java.util.ArrayList;

public class Inmobiliaria {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
	private ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();

	public void agregarCliente(Cliente cliente) {
		String rut = cliente.getRut();
		if(buscarClientes(rut) == null){
			this.clientes.add(cliente);
			GestorDatos.registrarDatos(getClientes(),"Cliente.txt");
			System.out.println("Cliente agregado ");
		}
		else{
			System.out.println("El cliente ya había sido agregado anteriormente");
		}
	}

	public void agregarVendedor(Vendedor vendedor) {
		String rut = vendedor.getRut();
		if(buscarVendedores(rut) == null){
			this.vendedores.add(vendedor);
			GestorDatos.registrarDatos(getVendedores(), "Vendedor.txt");
			System.out.println("Vendedor agregado ");
		}
		else{
			System.out.println("El vendedor ya había sido agregado anteriormente");
		}
	}

	public Inmueble agregarInmueble(Inmueble inmueble) {
		this.inmuebles.add(inmueble);
		GestorDatos.registrarDatos(getInmuebles(),"Inmueble.txt");
		return inmueble;
	}

	public Inmueble darBajaInmueble(Inmueble inmueble) {
		if(inmueble != null){
			this.inmuebles.remove(inmueble);
			System.out.println("Inmueble dado de baja");
			return inmueble;
		}
		else{
			System.out.println("Inmueble no encontrado");
		}
		return null;
	}

	public ArrayList<Inmueble> buscarInmueblePrecio(int precio) {
		ArrayList<Inmueble> inmueblesMismoPrecio = new ArrayList<>();
		for (Inmueble inmueble : this.inmuebles) {
			if(inmueble.getPrecio() == precio){
				inmueblesMismoPrecio.add(inmueble);
			}
		}
		return inmueblesMismoPrecio;
	}

	public ArrayList<Inmueble> buscarInmuebleTipoConstruccion(String tipoConstruccion) {
		ArrayList<Inmueble> inmueblesMismoTipoConstruccion = new ArrayList<>();
		for (Inmueble inmueble : this.inmuebles) {
			if(inmueble.getTipoConstruccion().equals(tipoConstruccion)){
				inmueblesMismoTipoConstruccion.add(inmueble);
			}
		}
		return inmueblesMismoTipoConstruccion;
	}

	public Cliente buscarClientes(String rut){
		for(Cliente cliente : this.clientes){
			if(cliente.getRut().equals(rut)){
				return cliente;
			}
		}
		return null;
	}

	public Vendedor buscarVendedores(String rut){
		for(Vendedor vendedor : this.vendedores){
			if(vendedor.getRut().equals(rut)){
				return vendedor;
			}
		}
		return null;
	}

	public Inmueble buscarInmueble(String nombre){
		for(Inmueble inmueble : this.inmuebles){
			if(inmueble.getNombre().equals(nombre)){
				return inmueble;
			}
		}
		return null;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}

	public ArrayList<Inmueble> getInmuebles() {
		return inmuebles;
	}
}