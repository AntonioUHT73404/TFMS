package tfms.categoria;

import tfms.tipo.TipoModel;
import tfms.valores.ValoresModel;

public class CategoriaModel {

     private int codigo;

     TipoModel tipo = new TipoModel();

     ValoresModel preco = new ValoresModel();

     public int getCodigo() {
          return codigo;
     }

     public void setCodigo(int codigo) {
          this.codigo = codigo;
     }

     public int getCodigoTipo() {
          return tipo.getCodigo();
     }

     public void setCodigoTipo( int codigo) {
          tipo.setCodigo(codigo);
     }

     public String getNome() {
          return tipo.getNome();
     }

     public void setNome( String nome) {
          tipo.setNome(nome);
     }

     public int getCodigoPreco() {
          return preco.getCodigo();
     }

     public void setCodigoPreco( int codigo) {
          preco.setCodigo(codigo);
     }

     public float getPreco() {
          return preco.getValor();
     }

     public void setPreco( float valor) {
          preco.setValor(valor);
     }

     public CategoriaModel() {}
}