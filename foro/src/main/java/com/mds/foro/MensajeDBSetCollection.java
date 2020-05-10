/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: dor494(University of Almeria)
 * License Type: Academic
 */
package com.mds.foro;

import org.orm.*;

public class MensajeDBSetCollection extends org.orm.util.ORMSet {
	public MensajeDBSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public MensajeDBSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persistent objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMSet
	 * @param value the persistent object
	 */
	public void add(MensajeDB value) {
		if (value != null) {
			super.add(value, value._ormAdapter);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMSet
	 * @param value the persistent object
	 */
	public void remove(MensajeDB value) {
		super.remove(value, value._ormAdapter);
	}
	
	/**
	 * Return true if ORMSet contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(MensajeDB value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMSet
	 * @return The persistent objects array
	 */
	public MensajeDB[] toArray() {
		return (MensajeDB[]) super.toArray(new MensajeDB[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>idMensaje</li>
	 * <li>mensaje</li>
	 * <li>cantidadLike</li>
	 * <li>eliminado</li>
	 * <li>oculto</li>
	 * <li>video</li>
	 * <li>foto</li>
	 * <li>foto2</li>
	 * <li>foto3</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public MensajeDB[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>idMensaje</li>
	 * <li>mensaje</li>
	 * <li>cantidadLike</li>
	 * <li>eliminado</li>
	 * <li>oculto</li>
	 * <li>video</li>
	 * <li>foto</li>
	 * <li>foto2</li>
	 * <li>foto3</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public MensajeDB[] toArray(String propertyName, boolean ascending) {
		return (MensajeDB[]) super.toArray(new MensajeDB[size()], propertyName, ascending);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return ProyectoFinalPersistentManager.instance();
	}
	
}

