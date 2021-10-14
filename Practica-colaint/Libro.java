
public class Libro {
	private String titulo;
	private String autor;
	private float precio;
	private int numPaginas;

	public Libro() {

	}

	public Libro(String titulo, String autor, float precio, int numPaginas) {
		this.titulo = titulo;
		this.precio = precio;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "Libro: " + this.titulo + "\nAutor: " + this.autor + "\nPrecio: " + this.precio;
	}
}
