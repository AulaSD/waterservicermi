package application;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import services.ServiceBeberAgua;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			//criar um objeto que será remoto
			ServiceBeberAgua service = new ServiceBeberAgua();
			//Criar o registro (RMI Registry)
			LocateRegistry.createRegistry(1099);
			//Registrar um objeto
			Naming.rebind("//localhost/calculo", service);
			//Servidor fica rodando aguardando requisiçoes do cliente
			System.out.println("Servidor rodando...");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
