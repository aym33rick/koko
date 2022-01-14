package fr.imta.fil.koko.impl;

import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.imta.fil.koko.Client;
import fr.imta.fil.koko.Cuisinier;
import fr.imta.fil.koko.Employee;
import fr.imta.fil.koko.KokoFactory;
import fr.imta.fil.koko.KokoPackage;
import fr.imta.fil.koko.Restaurant;
import fr.imta.fil.koko.Serveur;

public class RestaurantApp {
public static void main(String[] args) {
		
		int choix;
		boolean arret = false;
		Scanner console = new Scanner(System.in);
		
		KokoFactory factory = new KokoFactoryImpl();
		Restaurant koko = factory.createRestaurant();
		koko.setName("KOKO");
		
		EList<Client> clients = koko.getClients();
		EList<Employee> employees = koko.getEmployees();


		
		while (!arret){
			System.out.println("\n------------Mon Menu-------------");
			System.out.println("(1) Ajouter un serveur");
			System.out.println("(2) Supprimer un serveur");
			System.out.println("(2) Ajouter un cuisinier");
			System.out.println("(4) Supprimer un cuisinier");
			System.out.println("(5) Ajouter un client");
			System.out.println("(6) Supprimer un client");
			System.out.println("(7) Prendre la commande d'un client par un serveur et la faire preparer par un cuisinier");
			System.out.println("(8) Ajouter un nouveau plat");
			System.out.println("(9) Afficher le restaurant");
			System.out.println("(10) Charger un restaurant");
		    System.out.println("(11) Enregistrer et quitter\n");
			System.out.print("Faites vôtre choix: ");
	
			choix = console.nextInt();
			
			switch (choix) {
			  	case 1:
			  		System.out.println("Vous allez ajouter un serveur");
					Serveur serveur = factory.createServeur();
					System.out.print("Entrer le nom du serveur: ");
					String serveurName = console.next();
					System.out.print("Entrer le prenom du serveur: ");
					String serveurPrenom = console.next();
					serveur.setName(serveurName);
					serveur.setFirstName(serveurPrenom);
					employees.add(serveur);
					break;
			  	case 2:
			  		System.out.print("Vous allez supprimer un serveur veuillez entrer son nom:");
					String nameDel = console.next();
					for (Employee employee2 : employees) {
						if (employee2.getName().equals(nameDel)) {
							employees.remove(employee2);
							System.out.println(employee2.getFirstName() + " " + employee2.getName() + " à été supprimé.");
							break;
						}
					}
					System.out.println("Serveur non trouvé suppression annulé");
					break;
			  	case 3:
			  		System.out.println("Vous allez ajouter un cuisinier");
					Cuisinier cuisinier = factory.createCuisinier();
					System.out.print("Entrer le nom du cuisnier: ");
					String cuisinierName = console.next();
					System.out.print("Entrer le prenom du cuisinier: ");
					String cuisinierPrenom = console.next();
					cuisinier.setName(cuisinierName);
					cuisinier.setFirstName(cuisinierPrenom);
					employees.add(cuisinier);
					break;
			  	case 4:
										
					break;
			  	case 5:
			  		System.out.println("Vous allez ajouter un client");
					Client client = factory.createClient();
					System.out.print("Entrer le nom du client: ");
					String clientName = console.next();
					System.out.print("Entrer le prenom du client: ");
					String clientPrenom = console.next();
					client.setName(clientName);
					client.setFirstName(clientPrenom);
					clients.add(client);
					break;
				case 6:
							  		
					break;
				case 7:
						
					break;
				case 8:
						
					break;
				case 9:
					System.out.println(koko.getClients());
					for (Employee employee : employees) {
						if (employee instanceof Cuisinier) {
							System.out.println("je suis un cuisinier");
						}
						if (employee instanceof Serveur) {
							System.out.println("je suis un serveur");
						}
					}
						
					break;
				case 10:
					
					break;
			  	case 11 : 
			  		arret = true; 
			  		
			  		ResourceSet rs = new ResourceSetImpl();

				  	rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				  	    "xmi",
				  	    new XMIResourceFactoryImpl()
				  	);
				  	rs.getPackageRegistry().put(
				  	    KokoPackage.eNS_URI,
				  	    KokoPackage.eINSTANCE
				  	);
			  		
				  	Resource resource = rs.createResource(URI.createFileURI("koko.xmi"));

				  	Restaurant racineModele = koko; 

				  	resource.getContents().add(racineModele);

				  	try {
				  	    resource.save(Collections.EMPTY_MAP);
				  	}
				  	catch (IOException e) {
				  	    System.out.println("erreur durant la sauvegarde du modèle : " + e.getMessage());
				  	}
			  		
			  		break;
			  	default: System.out.println("Entrez un nombre valide"); break;
			}
		}
				
		console.close();
		
	}
}
