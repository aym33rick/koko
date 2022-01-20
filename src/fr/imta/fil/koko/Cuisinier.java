/**
 */
package fr.imta.fil.koko;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cuisinier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.koko.Cuisinier#getPlats <em>Plats</em>}</li>
 * </ul>
 *
 * @see fr.imta.fil.koko.KokoPackage#getCuisinier()
 * @model
 * @generated
 */
public interface Cuisinier extends Employee {
	/**
	 * Returns the value of the '<em><b>Plats</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.fil.koko.Plat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plats</em>' reference list.
	 * @see fr.imta.fil.koko.KokoPackage#getCuisinier_Plats()
	 * @model
	 * @generated
	 */
	EList<Plat> getPlats();

} // Cuisinier
