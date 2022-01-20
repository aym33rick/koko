/**
 */
package fr.imta.fil.koko;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.koko.Restaurant#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.fil.koko.Restaurant#getEmployees <em>Employees</em>}</li>
 *   <li>{@link fr.imta.fil.koko.Restaurant#getPlats <em>Plats</em>}</li>
 *   <li>{@link fr.imta.fil.koko.Restaurant#getClients <em>Clients</em>}</li>
 * </ul>
 *
 * @see fr.imta.fil.koko.KokoPackage#getRestaurant()
 * @model
 * @generated
 */
public interface Restaurant extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.imta.fil.koko.KokoPackage#getRestaurant_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.imta.fil.koko.Restaurant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.fil.koko.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see fr.imta.fil.koko.KokoPackage#getRestaurant_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Plats</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.fil.koko.Plat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plats</em>' containment reference list.
	 * @see fr.imta.fil.koko.KokoPackage#getRestaurant_Plats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plat> getPlats();

	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.fil.koko.Client}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see fr.imta.fil.koko.KokoPackage#getRestaurant_Clients()
	 * @model containment="true"
	 * @generated
	 */
	EList<Client> getClients();

} // Restaurant
