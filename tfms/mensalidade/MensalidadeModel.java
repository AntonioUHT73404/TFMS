package tfms.mensalidade;

import java.sql.Date;

import tfms.assinante.AssinanteModel;

public class MensalidadeModel extends AssinaturaModel {
	
    	private int codigo;
	private float precoTotal;
    	private Date dataVencimento;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(float precoTotal) {
		this.precoTotal = precoTotal;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}
	
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
}