/**
 */
package fr.imta.fil.koko;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.imta.fil.koko.KokoFactory
 * @model kind="package"
 * @generated
 */
public interface KokoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "koko";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fr.imta.fil.koko";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "koko";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KokoPackage eINSTANCE = fr.imta.fil.koko.impl.KokoPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.imta.fil.koko.impl.RestaurantImpl <em>Restaurant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.koko.impl.RestaurantImpl
	 * @see fr.imta.fil.koko.impl.KokoPackageImpl#getRestaurant()
	 * @generated
	 */
	int RESTAURANT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__EMPLOYEES = 1;

	/**
	 * The feature id for the '<em><b>Plats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__PLATS = 2;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__CLIENTS = 3;

	/**
	 * The number of structural features of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.koko.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.koko.impl.EmployeeImpl
	 * @see fr.imta.fil.koko.impl.KokoPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__AGE = 2;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.koko.impl.PlatImpl <em>Plat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.koko.impl.PlatImpl
	 * @see fr.imta.fil.koko.impl.KokoPackageImpl#getPlat()
	 * @generated
	 */
	int PLAT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAT__PRIX = 2;

	/**
	 * The number of structural features of the '<em>Plat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Plat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.koko.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.koko.impl.ClientImpl
	 * @see fr.imta.fil.koko.impl.KokoPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Plats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PLATS = 2;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.koko.impl.ServeurImpl <em>Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.koko.impl.ServeurImpl
	 * @see fr.imta.fil.koko.impl.KokoPackageImpl#getServeur()
	 * @generated
	 */
	int SERVEUR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__FIRST_NAME = EMPLOYEE__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__AGE = EMPLOYEE__AGE;

	/**
	 * The feature id for the '<em><b>Cliens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__CLIENS = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.fil.koko.impl.CuisinierImpl <em>Cuisinier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.fil.koko.impl.CuisinierImpl
	 * @see fr.imta.fil.koko.impl.KokoPackageImpl#getCuisinier()
	 * @generated
	 */
	int CUISINIER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUISINIER__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUISINIER__FIRST_NAME = EMPLOYEE__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUISINIER__AGE = EMPLOYEE__AGE;

	/**
	 * The feature id for the '<em><b>Plats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUISINIER__PLATS = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cuisinier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUISINIER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cuisinier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUISINIER_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.imta.fil.koko.Restaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurant</em>'.
	 * @see fr.imta.fil.koko.Restaurant
	 * @generated
	 */
	EClass getRestaurant();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.koko.Restaurant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.imta.fil.koko.Restaurant#getName()
	 * @see #getRestaurant()
	 * @generated
	 */
	EAttribute getRestaurant_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.fil.koko.Restaurant#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see fr.imta.fil.koko.Restaurant#getEmployees()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_Employees();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.fil.koko.Restaurant#getPlats <em>Plats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plats</em>'.
	 * @see fr.imta.fil.koko.Restaurant#getPlats()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_Plats();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.fil.koko.Restaurant#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clients</em>'.
	 * @see fr.imta.fil.koko.Restaurant#getClients()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_Clients();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.koko.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see fr.imta.fil.koko.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.koko.Employee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.imta.fil.koko.Employee#getName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.koko.Employee#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see fr.imta.fil.koko.Employee#getFirstName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.koko.Employee#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see fr.imta.fil.koko.Employee#getAge()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Age();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.koko.Plat <em>Plat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plat</em>'.
	 * @see fr.imta.fil.koko.Plat
	 * @generated
	 */
	EClass getPlat();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.koko.Plat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.imta.fil.koko.Plat#getName()
	 * @see #getPlat()
	 * @generated
	 */
	EAttribute getPlat_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.koko.Plat#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.imta.fil.koko.Plat#getDescription()
	 * @see #getPlat()
	 * @generated
	 */
	EAttribute getPlat_Description();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.koko.Plat#getPrix <em>Prix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prix</em>'.
	 * @see fr.imta.fil.koko.Plat#getPrix()
	 * @see #getPlat()
	 * @generated
	 */
	EAttribute getPlat_Prix();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.koko.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see fr.imta.fil.koko.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.koko.Client#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.imta.fil.koko.Client#getName()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.fil.koko.Client#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see fr.imta.fil.koko.Client#getFirstName()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_FirstName();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.fil.koko.Client#getPlats <em>Plats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plats</em>'.
	 * @see fr.imta.fil.koko.Client#getPlats()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Plats();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.koko.Serveur <em>Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur</em>'.
	 * @see fr.imta.fil.koko.Serveur
	 * @generated
	 */
	EClass getServeur();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.fil.koko.Serveur#getCliens <em>Cliens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cliens</em>'.
	 * @see fr.imta.fil.koko.Serveur#getCliens()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Cliens();

	/**
	 * Returns the meta object for class '{@link fr.imta.fil.koko.Cuisinier <em>Cuisinier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cuisinier</em>'.
	 * @see fr.imta.fil.koko.Cuisinier
	 * @generated
	 */
	EClass getCuisinier();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.fil.koko.Cuisinier#getPlats <em>Plats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plats</em>'.
	 * @see fr.imta.fil.koko.Cuisinier#getPlats()
	 * @see #getCuisinier()
	 * @generated
	 */
	EReference getCuisinier_Plats();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KokoFactory getKokoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.imta.fil.koko.impl.RestaurantImpl <em>Restaurant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.koko.impl.RestaurantImpl
		 * @see fr.imta.fil.koko.impl.KokoPackageImpl#getRestaurant()
		 * @generated
		 */
		EClass RESTAURANT = eINSTANCE.getRestaurant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT__NAME = eINSTANCE.getRestaurant_Name();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__EMPLOYEES = eINSTANCE.getRestaurant_Employees();

		/**
		 * The meta object literal for the '<em><b>Plats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__PLATS = eINSTANCE.getRestaurant_Plats();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__CLIENTS = eINSTANCE.getRestaurant_Clients();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.koko.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.koko.impl.EmployeeImpl
		 * @see fr.imta.fil.koko.impl.KokoPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__NAME = eINSTANCE.getEmployee_Name();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__FIRST_NAME = eINSTANCE.getEmployee_FirstName();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__AGE = eINSTANCE.getEmployee_Age();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.koko.impl.PlatImpl <em>Plat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.koko.impl.PlatImpl
		 * @see fr.imta.fil.koko.impl.KokoPackageImpl#getPlat()
		 * @generated
		 */
		EClass PLAT = eINSTANCE.getPlat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAT__NAME = eINSTANCE.getPlat_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAT__DESCRIPTION = eINSTANCE.getPlat_Description();

		/**
		 * The meta object literal for the '<em><b>Prix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAT__PRIX = eINSTANCE.getPlat_Prix();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.koko.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.koko.impl.ClientImpl
		 * @see fr.imta.fil.koko.impl.KokoPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NAME = eINSTANCE.getClient_Name();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__FIRST_NAME = eINSTANCE.getClient_FirstName();

		/**
		 * The meta object literal for the '<em><b>Plats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__PLATS = eINSTANCE.getClient_Plats();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.koko.impl.ServeurImpl <em>Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.koko.impl.ServeurImpl
		 * @see fr.imta.fil.koko.impl.KokoPackageImpl#getServeur()
		 * @generated
		 */
		EClass SERVEUR = eINSTANCE.getServeur();

		/**
		 * The meta object literal for the '<em><b>Cliens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__CLIENS = eINSTANCE.getServeur_Cliens();

		/**
		 * The meta object literal for the '{@link fr.imta.fil.koko.impl.CuisinierImpl <em>Cuisinier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.fil.koko.impl.CuisinierImpl
		 * @see fr.imta.fil.koko.impl.KokoPackageImpl#getCuisinier()
		 * @generated
		 */
		EClass CUISINIER = eINSTANCE.getCuisinier();

		/**
		 * The meta object literal for the '<em><b>Plats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUISINIER__PLATS = eINSTANCE.getCuisinier_Plats();

	}

} //KokoPackage
