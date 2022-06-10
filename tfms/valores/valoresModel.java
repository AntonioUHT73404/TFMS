package tfms.valores;

public class ValorsModel {
     
     private int codigo;
     private float valor;

     public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

     public ValorsModel(int codigo, float valor) { 
          setCodigo(codigo);
          setValor(valor);
     }
}