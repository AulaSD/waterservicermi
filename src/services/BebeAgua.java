package services;

import model.Pessoa;

public class BebeAgua {
	
	private double quantidadedeagua;
	private final byte aguaml = 35;
	
	public double calculaQuantidadedeAgua(Pessoa pessoa) {
		quantidadedeagua = (pessoa.getPeso() * aguaml)/1000;
		return quantidadedeagua;
	}

}
