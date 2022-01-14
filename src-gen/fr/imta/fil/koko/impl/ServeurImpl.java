/**
 */
package fr.imta.fil.koko.impl;

import fr.imta.fil.koko.Client;
import fr.imta.fil.koko.KokoPackage;
import fr.imta.fil.koko.Serveur;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serveur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.koko.impl.ServeurImpl#getCliens <em>Cliens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServeurImpl extends EmployeeImpl implements Serveur {
	/**
	 * The cached value of the '{@link #getCliens() <em>Cliens</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCliens()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> cliens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KokoPackage.Literals.SERVEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getCliens() {
		if (cliens == null) {
			cliens = new EObjectResolvingEList<Client>(Client.class, this, KokoPackage.SERVEUR__CLIENS);
		}
		return cliens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KokoPackage.SERVEUR__CLIENS:
				return getCliens();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KokoPackage.SERVEUR__CLIENS:
				getCliens().clear();
				getCliens().addAll((Collection<? extends Client>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KokoPackage.SERVEUR__CLIENS:
				getCliens().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KokoPackage.SERVEUR__CLIENS:
				return cliens != null && !cliens.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServeurImpl
