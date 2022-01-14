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
import fr.imta.fil.koko.KokoFactory;
import fr.imta.fil.koko.KokoPackage;
import fr.imta.fil.koko.Restaurant;

public class RestaurantApp {
public static void main(String[] args) {
		
		int choix;
		boolean arret = false;
		Scanner console = new Scanner(System.in);
		
		KokoFactory factory = new KokoFactoryImpl();
		Restaurant koko = factory.createRestaurant();
		koko.setName("KOKO");
		
		EList<Client> client = koko.getClients();

		
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
					
					break;
			  	case 2:
					
					break;
			  	case 3:
							
					break;
			  	case 4:
										
					break;
			  	case 5:
			  		
					break;
				case 6:
							  		
					break;
				case 7:
						
					break;
				case 8:
						
					break;
				case 9:
						
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
