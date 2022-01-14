/**
 */
package fr.imta.fil.koko;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.imta.fil.koko.KokoPackage
 * @generated
 */
public interface KokoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KokoFactory eINSTANCE = fr.imta.fil.koko.impl.KokoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Restaurant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restaurant</em>'.
	 * @generated
	 */
	Restaurant createRestaurant();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Plat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plat</em>'.
	 * @generated
	 */
	Plat createPlat();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serveur</em>'.
	 * @generated
	 */
	Serveur createServeur();

	/**
	 * Returns a new object of class '<em>Cuisinier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cuisinier</em>'.
	 * @generated
	 */
	Cuisinier createCuisinier();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KokoPackage getKokoPackage();

} //KokoFactory
