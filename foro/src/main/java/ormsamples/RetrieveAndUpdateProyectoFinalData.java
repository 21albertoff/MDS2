/**
 * Licensee: dor494(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoFinalData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = com.mds.foro.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mds.foro.MensajeDB lcommdsforoMensajeDB = com.mds.foro.MensajeDBDAO.loadMensajeDBByQuery(null, null);
			// Update the properties of the persistent object
			com.mds.foro.MensajeDBDAO.save(lcommdsforoMensajeDB);
			com.mds.foro.SeccionDB lcommdsforoSeccionDB = com.mds.foro.SeccionDBDAO.loadSeccionDBByQuery(null, null);
			// Update the properties of the persistent object
			com.mds.foro.SeccionDBDAO.save(lcommdsforoSeccionDB);
			com.mds.foro.TemaDB lcommdsforoTemaDB = com.mds.foro.TemaDBDAO.loadTemaDBByQuery(null, null);
			// Update the properties of the persistent object
			com.mds.foro.TemaDBDAO.save(lcommdsforoTemaDB);
			com.mds.foro.Usuario_DB lcommdsforoUsuario_DB = com.mds.foro.Usuario_DBDAO.loadUsuario_DBByQuery(null, null);
			// Update the properties of the persistent object
			com.mds.foro.Usuario_DBDAO.save(lcommdsforoUsuario_DB);
			com.mds.foro.AdministradorDB lcommdsforoAdministradorDB = com.mds.foro.AdministradorDBDAO.loadAdministradorDBByQuery(null, null);
			// Update the properties of the persistent object
			com.mds.foro.AdministradorDBDAO.save(lcommdsforoAdministradorDB);
			com.mds.foro.Usuario_registradoDB lcommdsforoUsuario_registradoDB = com.mds.foro.Usuario_registradoDBDAO.loadUsuario_registradoDBByQuery(null, null);
			// Update the properties of the persistent object
			com.mds.foro.Usuario_registradoDBDAO.save(lcommdsforoUsuario_registradoDB);
			com.mds.foro.NotificacionDB lcommdsforoNotificacionDB = com.mds.foro.NotificacionDBDAO.loadNotificacionDBByQuery(null, null);
			// Update the properties of the persistent object
			com.mds.foro.NotificacionDBDAO.save(lcommdsforoNotificacionDB);
			com.mds.foro.Usuario_notificadosDB lcommdsforoUsuario_notificadosDB = com.mds.foro.Usuario_notificadosDBDAO.loadUsuario_notificadosDBByQuery(null, null);
			// Update the properties of the persistent object
			com.mds.foro.Usuario_notificadosDBDAO.save(lcommdsforoUsuario_notificadosDB);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving MensajeDB by MensajeDBCriteria");
		com.mds.foro.MensajeDBCriteria lcommdsforoMensajeDBCriteria = new com.mds.foro.MensajeDBCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommdsforoMensajeDBCriteria.idMensaje.eq();
		System.out.println(lcommdsforoMensajeDBCriteria.uniqueMensajeDB());
		
		System.out.println("Retrieving SeccionDB by SeccionDBCriteria");
		com.mds.foro.SeccionDBCriteria lcommdsforoSeccionDBCriteria = new com.mds.foro.SeccionDBCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommdsforoSeccionDBCriteria.idSeccion.eq();
		System.out.println(lcommdsforoSeccionDBCriteria.uniqueSeccionDB());
		
		System.out.println("Retrieving TemaDB by TemaDBCriteria");
		com.mds.foro.TemaDBCriteria lcommdsforoTemaDBCriteria = new com.mds.foro.TemaDBCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommdsforoTemaDBCriteria.idTema.eq();
		System.out.println(lcommdsforoTemaDBCriteria.uniqueTemaDB());
		
		System.out.println("Retrieving Usuario_DB by Usuario_DBCriteria");
		com.mds.foro.Usuario_DBCriteria lcommdsforoUsuario_DBCriteria = new com.mds.foro.Usuario_DBCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommdsforoUsuario_DBCriteria.idUsuario.eq();
		System.out.println(lcommdsforoUsuario_DBCriteria.uniqueUsuario_DB());
		
		System.out.println("Retrieving AdministradorDB by AdministradorDBCriteria");
		com.mds.foro.AdministradorDBCriteria lcommdsforoAdministradorDBCriteria = new com.mds.foro.AdministradorDBCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommdsforoAdministradorDBCriteria.idUsuario.eq();
		System.out.println(lcommdsforoAdministradorDBCriteria.uniqueAdministradorDB());
		
		System.out.println("Retrieving Usuario_registradoDB by Usuario_registradoDBCriteria");
		com.mds.foro.Usuario_registradoDBCriteria lcommdsforoUsuario_registradoDBCriteria = new com.mds.foro.Usuario_registradoDBCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommdsforoUsuario_registradoDBCriteria.idUsuario.eq();
		System.out.println(lcommdsforoUsuario_registradoDBCriteria.uniqueUsuario_registradoDB());
		
		System.out.println("Retrieving NotificacionDB by NotificacionDBCriteria");
		com.mds.foro.NotificacionDBCriteria lcommdsforoNotificacionDBCriteria = new com.mds.foro.NotificacionDBCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommdsforoNotificacionDBCriteria.idNotificacion.eq();
		System.out.println(lcommdsforoNotificacionDBCriteria.uniqueNotificacionDB());
		
		System.out.println("Retrieving Usuario_notificadosDB by Usuario_notificadosDBCriteria");
		com.mds.foro.Usuario_notificadosDBCriteria lcommdsforoUsuario_notificadosDBCriteria = new com.mds.foro.Usuario_notificadosDBCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcommdsforoUsuario_notificadosDBCriteria.idUsuario.eq();
		System.out.println(lcommdsforoUsuario_notificadosDBCriteria.uniqueUsuario_notificadosDB());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoFinalData retrieveAndUpdateProyectoFinalData = new RetrieveAndUpdateProyectoFinalData();
			try {
				retrieveAndUpdateProyectoFinalData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoFinalData.retrieveByCriteria();
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
