package tfms.franquia;

import tfms.categoria.CategoriaModel;

public class FranquiaModel extends CategoriaModel{
     
     private int codigo;

     public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

     public String getNome() {
          return super.getNome();
     }

     public void setNome(String nome) {
          super.setNome(nome);
     }

     public float getPreco() {
          return super.getPreco();
     }

     public void setPreco(float preco) {
          super.setPreco(preco);
     }
}
