/**
 */
package fr.imta.fil.koko.impl;

import fr.imta.fil.koko.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KokoFactoryImpl extends EFactoryImpl implements KokoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KokoFactory init() {
		try {
			KokoFactory theKokoFactory = (KokoFactory)EPackage.Registry.INSTANCE.getEFactory(KokoPackage.eNS_URI);
			if (theKokoFactory != null) {
				return theKokoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KokoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KokoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KokoPackage.RESTAURANT: return createRestaurant();
			case KokoPackage.EMPLOYEE: return createEmployee();
			case KokoPackage.PLAT: return createPlat();
			case KokoPackage.CLIENT: return createClient();
			case KokoPackage.SERVEUR: return createServeur();
			case KokoPackage.CUISINIER: return createCuisinier();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restaurant createRestaurant() {
		RestaurantImpl restaurant = new RestaurantImpl();
		return restaurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plat createPlat() {
		PlatImpl plat = new PlatImpl();
		return plat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serveur createServeur() {
		ServeurImpl serveur = new ServeurImpl();
		return serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cuisinier createCuisinier() {
		CuisinierImpl cuisinier = new CuisinierImpl();
		return cuisinier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KokoPackage getKokoPackage() {
		return (KokoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KokoPackage getPackage() {
		return KokoPackage.eINSTANCE;
	}

} //KokoFactoryImpl
