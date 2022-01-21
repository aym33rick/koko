/**
 */
package fr.imta.fil.koko.impl;

import fr.imta.fil.koko.Cuisinier;
import fr.imta.fil.koko.KokoPackage;
import fr.imta.fil.koko.Plat;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cuisinier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.koko.impl.CuisinierImpl#getPlats <em>Plats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CuisinierImpl extends EmployeeImpl implements Cuisinier {
	/**
	 * The cached value of the '{@link #getPlats() <em>Plats</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlats()
	 * @generated
	 * @ordered
	 */
	protected EList<Plat> plats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CuisinierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KokoPackage.Literals.CUISINIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plat> getPlats() {
		if (plats == null) {
			plats = new EObjectResolvingEList<Plat>(Plat.class, this, KokoPackage.CUISINIER__PLATS);
		}
		return plats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KokoPackage.CUISINIER__PLATS:
				return getPlats();
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
			case KokoPackage.CUISINIER__PLATS:
				getPlats().clear();
				getPlats().addAll((Collection<? extends Plat>)newValue);
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
			case KokoPackage.CUISINIER__PLATS:
				getPlats().clear();
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
			case KokoPackage.CUISINIER__PLATS:
				return plats != null && !plats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CuisinierImpl
