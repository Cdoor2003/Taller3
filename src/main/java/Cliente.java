public class Cliente extends Persona {
    public Cliente(String nombre, String rut, String direccion) {
        super(nombre, rut, direccion);
    }
    public String toString() {
        return super.getNombre()+","+super.getRut()+","+super.getDireccion();
    }
}