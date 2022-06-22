package tfms.valores;

public class ValoresModel {
     
     private int codigo;
     private float valor;

     public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

     public ValoresModel(int codigo, float valor) { 
          setCodigo(codigo);
          setValor(valor);
     }

     public ValoresModel() {
     }
}