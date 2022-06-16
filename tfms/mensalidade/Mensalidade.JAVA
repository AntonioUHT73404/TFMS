public class Mensalidade extends Assinatura {
	
    private int codigo;
	private float precoTotal;
    private Date dataVencimento;
    
	public Internet(int codigo, float precoTotal, Date dataVencimento) {
		this.precoTotal = precoTotal;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Categoria categoria) {
		this.categoria = precoTotal;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Categoria categoria) {
		this.categoria = dataVencimento;
	}
}