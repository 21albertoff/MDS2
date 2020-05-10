/**
 * Licensee: dor494(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoFinalDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(com.mds.foro.ProyectoFinalPersistentManager.instance());
			com.mds.foro.ProyectoFinalPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
