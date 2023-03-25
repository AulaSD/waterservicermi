package services;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import interfaces.IServiceBeberAgua;
import model.Pessoa;

public class ServiceBeberAgua extends UnicastRemoteObject implements IServiceBeberAgua{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ServiceBeberAgua() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculaQuantidadeAgua(Pessoa pessoa) throws RemoteException {
		// TODO Auto-generated method stub
		BebeAgua bebeagua = new BebeAgua();
		return bebeagua.calculaQuantidadedeAgua(pessoa);
	}



}
