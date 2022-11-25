public class Vendedor extends Persona {
	private String tituloProfesional;
	private String estadoCivil;
	public Inmobiliaria inmobiliaria;

	public Vendedor(String nombre, String rut, String direccion) {
		super(nombre, rut, direccion);
		this.tituloProfesional = getTituloProfesional();
		this.estadoCivil = getEstadoCivil();
	}

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String toString() {
		return super.getNombre()+","+super.getRut()+","+super.getDireccion()+","+this.tituloProfesional+","+this.estadoCivil;
	}
}