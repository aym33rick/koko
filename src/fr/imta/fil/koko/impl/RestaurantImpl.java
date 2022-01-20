/**
 */
package fr.imta.fil.koko.impl;

import fr.imta.fil.koko.Client;
import fr.imta.fil.koko.Employee;
import fr.imta.fil.koko.KokoPackage;
import fr.imta.fil.koko.Plat;
import fr.imta.fil.koko.Restaurant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.fil.koko.impl.RestaurantImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.fil.koko.impl.RestaurantImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link fr.imta.fil.koko.impl.RestaurantImpl#getPlats <em>Plats</em>}</li>
 *   <li>{@link fr.imta.fil.koko.impl.RestaurantImpl#getClients <em>Clients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestaurantImpl extends MinimalEObjectImpl.Container implements Restaurant {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The cached value of the '{@link #getPlats() <em>Plats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlats()
	 * @generated
	 * @ordered
	 */
	protected EList<Plat> plats;

	/**
	 * The cached value of the '{@link #getClients() <em>Clients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> clients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KokoPackage.Literals.RESTAURANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KokoPackage.RESTAURANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentEList<Employee>(Employee.class, this, KokoPackage.RESTAURANT__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plat> getPlats() {
		if (plats == null) {
			plats = new EObjectContainmentEList<Plat>(Plat.class, this, KokoPackage.RESTAURANT__PLATS);
		}
		return plats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getClients() {
		if (clients == null) {
			clients = new EObjectContainmentEList<Client>(Client.class, this, KokoPackage.RESTAURANT__CLIENTS);
		}
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KokoPackage.RESTAURANT__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
			case KokoPackage.RESTAURANT__PLATS:
				return ((InternalEList<?>)getPlats()).basicRemove(otherEnd, msgs);
			case KokoPackage.RESTAURANT__CLIENTS:
				return ((InternalEList<?>)getClients()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KokoPackage.RESTAURANT__NAME:
				return getName();
			case KokoPackage.RESTAURANT__EMPLOYEES:
				return getEmployees();
			case KokoPackage.RESTAURANT__PLATS:
				return getPlats();
			case KokoPackage.RESTAURANT__CLIENTS:
				return getClients();
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
			case KokoPackage.RESTAURANT__NAME:
				setName((String)newValue);
				return;
			case KokoPackage.RESTAURANT__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case KokoPackage.RESTAURANT__PLATS:
				getPlats().clear();
				getPlats().addAll((Collection<? extends Plat>)newValue);
				return;
			case KokoPackage.RESTAURANT__CLIENTS:
				getClients().clear();
				getClients().addAll((Collection<? extends Client>)newValue);
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
			case KokoPackage.RESTAURANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KokoPackage.RESTAURANT__EMPLOYEES:
				getEmployees().clear();
				return;
			case KokoPackage.RESTAURANT__PLATS:
				getPlats().clear();
				return;
			case KokoPackage.RESTAURANT__CLIENTS:
				getClients().clear();
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
			case KokoPackage.RESTAURANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KokoPackage.RESTAURANT__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case KokoPackage.RESTAURANT__PLATS:
				return plats != null && !plats.isEmpty();
			case KokoPackage.RESTAURANT__CLIENTS:
				return clients != null && !clients.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RestaurantImpl
