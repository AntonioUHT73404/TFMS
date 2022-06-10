package tfms.categoria;

import tfms.tipo;
import tfms.valores;

public class CategoriaModel extends ValoresModel, TipoModel{

     private int codigo;

     TipoModel tipo = new TipoModel();

     ValoresModel valor = ValoresModel();

     public getCodigo() { 
          return codigo; 
     }

     public setCodigo(int codigo) { 
          this.codigo = codigo;
     }

     public getTipoCodigo() {
          return tipo.getCodigo();
     }

     public setTipoCodigo(int codigo) { 
          tipo.setCodigo(codigo);
     }

     public getValorCodigo() {
          return valor.getCodigo();
     }

     public setValorCodigo(int codigo) { 
          valor.setCodigo(codigo);
     }

     public setPreco(float valor) {
          super.setValor(valor);
     }

     public getNome() {
          return super.getNome();
     }

     public setNome(String nome) {
          super.setNome(nome);
     }

     public getPreco() {
          return super.getValor();
     }

     public CategoriaModel(String tipo, float valor) {
          setNome(tipo);
          setPreco(valor);
     }
}