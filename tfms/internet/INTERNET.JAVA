import java.util.ArrayList;

public class Internet extends Empresa {
	private int codigo;
	private Categoria categoria;

	public Internet(int codigo, Categoria categoria) {
		this.codigo = codigo;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}