package fr.imta.fil.koko.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

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
import fr.imta.fil.koko.Plat;
import fr.imta.fil.koko.Restaurant;
import fr.imta.fil.koko.Serveur;

public class RestaurantApp {

	public static final int NOUVEAU_SERVEUR = 1;
	public static final int SUPPRIMER_SERVEUR = 2;
	public static final int NOUVEAU_CUISINIER = 3;
	public static final int SUPPRIMER_CUISINIER = 4;
	public static final int NOUVEAU_CLIENT = 5;
	public static final int SUPPRIMER_CLIENT = 6;
	public static final int NOUVELLE_COMMANDE = 7;
	public static final int AJOUTER_PLAT = 8;
	public static final int AFFICHER_RESTAURANT = 9;
	public static final int CHARGER_RESTAURANT = 10;
	public static final int SAUVEGARDER_QUITTER= 11;
	
	public static void main(String[] args) {
		
		int choix;
		boolean arret = false;
		Scanner console = new Scanner(System.in);
		
		KokoFactory factory = new KokoFactoryImpl();
		Restaurant koko = factory.createRestaurant();
		koko.setName("KOKO");
		
		EList<Client> clients = koko.getClients();
		EList<Plat> plats = koko.getPlats();
		List<Cuisinier> cuisiniers = koko.getEmployees().stream().filter(Cuisinier.class::isInstance).map(Cuisinier.class::cast).collect(Collectors.toList());
		List<Serveur> serveurs = koko.getEmployees().stream().filter(Serveur.class::isInstance).map(Serveur.class::cast).collect(Collectors.toList());
		
		
		while (!arret){
			System.out.println("\n------------Mon Menu-------------"
					+ "\n(1) Ajouter un serveur"
					+ "\n(2) Supprimer un serveur"
					+ "\n(3) Ajouter un cuisinier"
					+ "\n(4) Supprimer un cuisinier"
					+ "\n(5) Ajouter un client"
					+ "\n(6) Supprimer un client"
					+ "\n(7) Prendre la commande d'un client par un serveur et la faire preparer par un cuisinier"
					+ "\n(8) Ajouter un nouveau plat"
					+ "\n(9) Afficher le restaurant"
			 		+ "\n(10) Charger un restaurant"
		     		+ "\n(11) Enregistrer et quitter\n");
			System.out.println("Faites vôtre choix: ");
	
			choix = Integer.parseInt(console.nextLine());
			
			switch (choix) {
			  	case NOUVEAU_SERVEUR:
			  		System.out.println("Vous allez ajouter un serveur");
					Serveur serveur = factory.createServeur();
					System.out.print("Entrer le nom du serveur: ");
					String serveurName = console.nextLine();
					System.out.print("Entrer le prenom du serveur: ");
					String serveurPrenom = console.nextLine();
					serveur.setName(serveurName);
					serveur.setFirstName(serveurPrenom);
					serveurs.add(serveur);
					break;
					
			  	case SUPPRIMER_SERVEUR:
			  		System.out.println(serveurs);
			  		Serveur serv = RestaurantApp.selectFromList(console, serveurs, "Vous allez supprimer un serveur", "%s %s\n", Serveur::getName, Serveur::getFirstName);
			  		if(serv != null) {
			  			serveurs.remove(serv);	
			  		}
			  		System.out.println(serveurs);
					break;
					
			  	case NOUVEAU_CUISINIER:
			  		System.out.println("Vous allez ajouter un cuisinier");
					Cuisinier cuisinier = factory.createCuisinier();
					System.out.print("Entrer le nom du cuisnier: ");
					String cuisinierName = console.nextLine();
					System.out.print("Entrer le prenom du cuisinier: ");
					String cuisinierPrenom = console.nextLine();
					cuisinier.setName(cuisinierName);
					cuisinier.setFirstName(cuisinierPrenom);
					cuisiniers.add(cuisinier);
					break;
					
			  	case SUPPRIMER_CUISINIER:
			  		System.out.println(cuisiniers);
			  		Cuisinier cuis = RestaurantApp.selectFromList(console, cuisiniers, "Vous allez supprimer un cuisinier", "%s %s\n", Cuisinier::getName, Cuisinier::getFirstName);
			  		if(cuis != null) {
			  			cuisiniers.remove(cuis);	
			  		}
			  		System.out.println(cuisiniers);				
					break;
					
			  	case NOUVEAU_CLIENT:
			  		System.out.println("Vous allez ajouter un client");
					Client client = factory.createClient();
					System.out.print("Entrer le nom du client: ");
					String clientName = console.nextLine();
					System.out.print("Entrer le prenom du client: ");
					String clientPrenom = console.nextLine();
					client.setName(clientName);
					client.setFirstName(clientPrenom);
					clients.add(client);
					break;
					
				case SUPPRIMER_CLIENT:
			  		System.out.println(clients);
			  		Client cli = RestaurantApp.selectFromList(console, clients, "Vous allez supprimer un cuisinier", "%s %s\n", Client::getName, Client::getFirstName);
			  		if(cli != null) {
			  			clients.remove(cli);	
			  		}
			  		serveurs.forEach((current)->current.getCliens().remove(cli));
			  		System.out.println(clients);			  		
					break;
					
				case NOUVELLE_COMMANDE:
					System.out.println("Vous allez prendre une commande.");
					if (serveurs.isEmpty()) {
						System.out.println("Veuillez inscrire un serveur avant de prendre une commande"); break;
					}
					Serveur serveur2 = RestaurantApp.selectFromList(console, serveurs, "Vous allez choisir un serveur", "%s %s \n", Serveur::getFirstName, Serveur::getName);
					if (cuisiniers.isEmpty()) {
						System.out.println("Veuillez inscrire un cuisinier avant de prendre une commande"); break;
					}
					Cuisinier cuisinier2 = RestaurantApp.selectFromList(console, cuisiniers,"Vous allez choisir un cuisinier", "%s %s\n", Cuisinier::getFirstName, Cuisinier::getName);
					
					if(clients.isEmpty()) {
						System.out.println("Veuillez inscrire un client avant de prendre une commande"); break;
					}
					
					Client client2 = RestaurantApp.selectFromList(console, clients, "Vous allez choisir un client", "%s %s\n", Client::getName, Client::getFirstName);
					
					serveur2.getCliens().add(client2);
					clients.add(client2);
					
					if(plats.isEmpty()) {
						System.out.println("Veuillez inscrire des plats avant de prendre une commande"); break;
					}

					Plat current = null;
					while((current = RestaurantApp.selectFromList(console, plats, "Veuillez choisir un plat", "%s\n", Plat::getName)) != null) {
						cuisinier2.getPlats().add(current);
						client2.getPlats().add(current);
					}
					
					break;
				case AJOUTER_PLAT:
					System.out.println("Vous allez ajouter un plat:");
					Plat plat = factory.createPlat();
					
					System.out.println("Entrer le nom du plat: ");
					String platName = console.nextLine();
					
					System.out.println("Entrer la description du plat:");
					String platDescription = console.nextLine();
					
					System.out.println("Entrer le prix du plat:");
					Float platPrix = Float.parseFloat(console.nextLine());
					plat.setName(platName);
					plat.setDescription(platDescription);
					plat.setPrix(platPrix);
					plats.add(plat);	
					break;
				case AFFICHER_RESTAURANT:
					System.out.println("Serveurs :");
					RestaurantApp.displayList(serveurs, "%s %s\n", Serveur::getFirstName, Serveur::getName);
					
					System.out.println("Cuisiniers :");
					RestaurantApp.displayList(cuisiniers, "%s %s\n", Cuisinier::getFirstName, Cuisinier::getName);

					System.out.println("Clients :");
					RestaurantApp.displayList(clients, "%s %s\n", Client::getFirstName, Client::getName);

					System.out.println("Plats :");
					RestaurantApp.displayList(plats, "%s au prix de %.2f€\n", Plat::getName, Plat::getPrix);
						
					break;
				case CHARGER_RESTAURANT:
					ResourceSet rsLoad = new ResourceSetImpl();
					
					rsLoad.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				  	    "xmi",
				  	    new XMIResourceFactoryImpl()
				  	);
					
					rsLoad.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			            "ecore", 
			            new XMIResourceFactoryImpl()
			        );
					rsLoad.getPackageRegistry().put(
				  	    KokoPackage.eNS_URI,
				  	    KokoPackage.eINSTANCE
				  	);
					
					Resource resourceLoad = rsLoad.getResource(URI.createFileURI("koko.xmi"), true);
			        
					Restaurant racineModeleLoad = (Restaurant)(resourceLoad.getContents().get(0));
					koko = racineModeleLoad;
					
					clients = koko.getClients();
					plats = koko.getPlats();
					cuisiniers = koko.getEmployees().stream().filter(Cuisinier.class::isInstance).map(Cuisinier.class::cast).collect(Collectors.toList());
					serveurs = koko.getEmployees().stream().filter(Serveur.class::isInstance).map(Serveur.class::cast).collect(Collectors.toList());
					
					
					break;
			  	case SAUVEGARDER_QUITTER : 
			  		arret = true; 
			  		koko.getEmployees().clear();
			  		koko.getEmployees().addAll(cuisiniers);
			  		koko.getEmployees().addAll(serveurs);
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

	@SafeVarargs
	public static final <T> T selectFromList(Scanner sc, List<T> list, String description, String format, Function<T,? extends Object>... keyExtractors) {
		T t = null;
		boolean ok= false;
		while(!ok) {
			ok = true;
			System.out.println(description);
			System.out.println("(0) : Quitter");
			RestaurantApp.displayList(list,format,keyExtractors);
			int index = Integer.parseInt(sc.nextLine());
			if (index < 0 || index > list.size()) {
				ok = false;
				System.out.println("Merci de choisir parmi les valeurs proposées");
			} else {
				ok = true;
				if (index != 0) {
					t = list.get(index-1);
				}
			}
			
		}
		return t;
	}

	@SafeVarargs
	public static final <T> void displayList(List<T> list, String format, Function<T,? extends Object>... keyExtractors) {
		for(int i = 0; i<list.size(); i++) {
			final T current = list.get(i);
			Object[] strings = Arrays.stream(keyExtractors).map(extractor->extractor.apply(current)).toArray();
			System.out.printf("(%d) : %s",i+1,String.format(format, strings));
		}	
	}
}
