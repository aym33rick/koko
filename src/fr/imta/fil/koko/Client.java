/**
 */
package fr.imta.fil.koko;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.koko.Client#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.fil.koko.Client#getFirstName <em>First Name</em>}</li>
 *   <li>{@link fr.imta.fil.koko.Client#getPlats <em>Plats</em>}</li>
 * </ul>
 *
 * @see fr.imta.fil.koko.KokoPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.imta.fil.koko.KokoPackage#getClient_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.imta.fil.koko.Client#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see fr.imta.fil.koko.KokoPackage#getClient_FirstName()
	 * @model unique="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link fr.imta.fil.koko.Client#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Plats</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.fil.koko.Plat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plats</em>' reference list.
	 * @see fr.imta.fil.koko.KokoPackage#getClient_Plats()
	 * @model
	 * @generated
	 */
	EList<Plat> getPlats();

} // Client
