import java.util.ArrayList;

public class Assinatura extends Assinante {
	
	private mensalidade = new mensalidade();
	ArrayList<Acionado> servicos = new ArrayList<>();
	

	public Assinatura() {
		// TODO Auto-generated constructor stub
		
	}


	private ArrayList<Acionado> getServicos() {
		return servicos;
	}


	private void setServicos(ArrayList<Acionado> servicos) {
		this.servicos = servicos;
	}

}
