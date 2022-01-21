/**
 */
package fr.imta.fil.koko;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.koko.Serveur#getCliens <em>Cliens</em>}</li>
 * </ul>
 *
 * @see fr.imta.fil.koko.KokoPackage#getServeur()
 * @model
 * @generated
 */
public interface Serveur extends Employee {
	/**
	 * Returns the value of the '<em><b>Cliens</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.fil.koko.Client}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cliens</em>' reference list.
	 * @see fr.imta.fil.koko.KokoPackage#getServeur_Cliens()
	 * @model
	 * @generated
	 */
	EList<Client> getCliens();

} // Serveur
