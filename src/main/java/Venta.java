import java.util.ArrayList;

public class Venta {
    public Cliente cliente;
    public Vendedor vendedor;
    public Inmueble inmueble;

    public void realizarVenta(Cliente cliente, Vendedor vendedor, Inmueble inmueble){
        Inmobiliaria inmobiliaria = new Inmobiliaria();
        String nombre = inmueble.getNombre();
        String rutCliente = cliente.getRut();
        String rutVendedor = vendedor.getRut();
        ArrayList<Cliente> listaClientes = inmobiliaria.getClientes();
        ArrayList<Vendedor> listaVendedores = inmobiliaria.getVendedores();
        ArrayList<Inmueble> listaInmuebles = inmobiliaria.getInmuebles();
        for(Cliente cliente1 : listaClientes){
            if(inmobiliaria.buscarClientes(rutCliente) != null){
                for(Vendedor vendedor1 : listaVendedores){
                    if(inmobiliaria.buscarVendedores(rutVendedor) != null){
                        for(Inmueble inmueble1 : listaInmuebles){
                            if(inmobiliaria.buscarInmueble(nombre) != null){
                                System.out.println("Se ha realizado la venta");

                            }
                            System.out.println("Inmueble no encontrado");
                        }
                    }
                    System.out.println("Vendedor no encontrado");
                }
            }
            else {
                System.out.println("Cliente no encontrado");
            }
        }
    }
}
