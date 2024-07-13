package erseco.soft;

class Category {
	int id;
	String nombre;
	//Constructor
	public Category(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return nombre;
	}
	public int getId() {
		return id;
	}
	
}
