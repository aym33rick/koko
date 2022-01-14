/**
 */
package fr.imta.fil.koko;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.koko.Plat#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.fil.koko.Plat#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.imta.fil.koko.Plat#getPrix <em>Prix</em>}</li>
 * </ul>
 *
 * @see fr.imta.fil.koko.KokoPackage#getPlat()
 * @model
 * @generated
 */
public interface Plat extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.imta.fil.koko.KokoPackage#getPlat_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.imta.fil.koko.Plat#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.imta.fil.koko.KokoPackage#getPlat_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.imta.fil.koko.Plat#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prix</em>' attribute.
	 * @see #setPrix(float)
	 * @see fr.imta.fil.koko.KokoPackage#getPlat_Prix()
	 * @model unique="false"
	 * @generated
	 */
	float getPrix();

	/**
	 * Sets the value of the '{@link fr.imta.fil.koko.Plat#getPrix <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prix</em>' attribute.
	 * @see #getPrix()
	 * @generated
	 */
	void setPrix(float value);

} // Plat
