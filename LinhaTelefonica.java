package tfms;

public class LinhaTelefonica {
	
	private int codigo;
	private Categoria categoria;
	private double consumo;
	private Franquia franquia;
		
	
	public Streaming(int codigo, Categoria categoria, double consumo, Franquia franquia) {
		this.codigo = codigo;
		this.categoria = categoria;
		this.consumo = consumo;
		this.franquia = franquia;
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


	public double getConsumo() {
		return consumo;
	}


	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}


	public Franquia getFranquia() {
		return franquia;
	}


	public void setFranquia(Franquia franquia) {
		this.franquia = franquia;
	}	
}
