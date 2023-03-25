package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import model.Pessoa;

public interface IServiceBeberAgua extends Remote{
	
	public double calculaQuantidadeAgua(Pessoa pessoa) throws RemoteException;

}
