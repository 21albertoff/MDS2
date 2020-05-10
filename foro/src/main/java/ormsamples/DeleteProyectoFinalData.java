/**
 * Licensee: dor494(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoFinalData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = com.mds.foro.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mds.foro.MensajeDB lcommdsforoMensajeDB = com.mds.foro.MensajeDBDAO.loadMensajeDBByQuery(null, null);
			// Delete the persistent object
			com.mds.foro.MensajeDBDAO.delete(lcommdsforoMensajeDB);
			com.mds.foro.SeccionDB lcommdsforoSeccionDB = com.mds.foro.SeccionDBDAO.loadSeccionDBByQuery(null, null);
			// Delete the persistent object
			com.mds.foro.SeccionDBDAO.delete(lcommdsforoSeccionDB);
			com.mds.foro.TemaDB lcommdsforoTemaDB = com.mds.foro.TemaDBDAO.loadTemaDBByQuery(null, null);
			// Delete the persistent object
			com.mds.foro.TemaDBDAO.delete(lcommdsforoTemaDB);
			com.mds.foro.Usuario_DB lcommdsforoUsuario_DB = com.mds.foro.Usuario_DBDAO.loadUsuario_DBByQuery(null, null);
			// Delete the persistent object
			com.mds.foro.Usuario_DBDAO.delete(lcommdsforoUsuario_DB);
			com.mds.foro.AdministradorDB lcommdsforoAdministradorDB = com.mds.foro.AdministradorDBDAO.loadAdministradorDBByQuery(null, null);
			// Delete the persistent object
			com.mds.foro.AdministradorDBDAO.delete(lcommdsforoAdministradorDB);
			com.mds.foro.Usuario_registradoDB lcommdsforoUsuario_registradoDB = com.mds.foro.Usuario_registradoDBDAO.loadUsuario_registradoDBByQuery(null, null);
			// Delete the persistent object
			com.mds.foro.Usuario_registradoDBDAO.delete(lcommdsforoUsuario_registradoDB);
			com.mds.foro.NotificacionDB lcommdsforoNotificacionDB = com.mds.foro.NotificacionDBDAO.loadNotificacionDBByQuery(null, null);
			// Delete the persistent object
			com.mds.foro.NotificacionDBDAO.delete(lcommdsforoNotificacionDB);
			com.mds.foro.Usuario_notificadosDB lcommdsforoUsuario_notificadosDB = com.mds.foro.Usuario_notificadosDBDAO.loadUsuario_notificadosDBByQuery(null, null);
			// Delete the persistent object
			com.mds.foro.Usuario_notificadosDBDAO.delete(lcommdsforoUsuario_notificadosDB);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoFinalData deleteProyectoFinalData = new DeleteProyectoFinalData();
			try {
				deleteProyectoFinalData.deleteTestData();
			}
			finally {
				com.mds.foro.ProyectoFinalPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
