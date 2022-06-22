package tfms.assinatura;

import java.util.ArrayList;

import tfms.mensalidade.MensalidadeModel;
import tfms.assinante.AssinanteModel;

public class Assinatura extends AssinanteModel {
	
	private int codigo;
	private MensalidadeModel mensalidade = new MensalidadeModel();

	ArrayList<AcionadoModel> servicos = new ArrayList<AcionadoModel>();
	

	public Assinatura() {
		
	}

	private ArrayList<AcionadoModel> getServicos() {
		return servicos;
	}

	private void setServicos(ArrayList<AcionadoModel> servicos) {
		this.servicos = servicos;
	}
}
