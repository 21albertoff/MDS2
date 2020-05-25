/**
 * Licensee: Alberto Fuentes(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoFinalData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = com.mds.foro.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		try {
			com.mds.foro.Usuario_DB lcommdsforoUsuario_DB = com.mds.foro.Usuario_DBDAO.createUsuario_DB();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : da_megusta_, amigo_de, da_megusta, amigo, baneado, permiso, perfil_oculto, recibir_por_correo, recibir_notificacion
			com.mds.foro.Usuario_DBDAO.save(lcommdsforoUsuario_DB);
			com.mds.foro.Usuario_registradoDB lcommdsforoUsuario_registradoDB = com.mds.foro.Usuario_registradoDBDAO.createUsuario_registradoDB();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reportado_por, reporta, usuarioBaneado, usuarioModerador
			com.mds.foro.Usuario_registradoDBDAO.save(lcommdsforoUsuario_registradoDB);
			com.mds.foro.SeccionDB lcommdsforoSeccionDB = com.mds.foro.SeccionDBDAO.createSeccionDB();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eliminado, seccionFija
			com.mds.foro.SeccionDBDAO.save(lcommdsforoSeccionDB);
			com.mds.foro.MensajeDB lcommdsforoMensajeDB = com.mds.foro.MensajeDBDAO.createMensajeDB();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : gustado_por, oculto, eliminado, cantidadLike
			com.mds.foro.MensajeDBDAO.save(lcommdsforoMensajeDB);
			com.mds.foro.TemaDB lcommdsforoTemaDB = com.mds.foro.TemaDBDAO.createTemaDB();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : gustado_por_, oculto, eliminado, cantidadLike
			com.mds.foro.TemaDBDAO.save(lcommdsforoTemaDB);
			com.mds.foro.AdministradorDB lcommdsforoAdministradorDB = com.mds.foro.AdministradorDBDAO.createAdministradorDB();
			// Initialize the properties of the persistent object here
			com.mds.foro.AdministradorDBDAO.save(lcommdsforoAdministradorDB);
			com.mds.foro.NotificacionDB lcommdsforoNotificacionDB = com.mds.foro.NotificacionDBDAO.createNotificacionDB();
			// Initialize the properties of the persistent object here
			com.mds.foro.NotificacionDBDAO.save(lcommdsforoNotificacionDB);
			com.mds.foro.Usuario_notificadosDB lcommdsforoUsuario_notificadosDB = com.mds.foro.Usuario_notificadosDBDAO.createUsuario_notificadosDB();
			// Initialize the properties of the persistent object here
			com.mds.foro.Usuario_notificadosDBDAO.save(lcommdsforoUsuario_notificadosDB);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoFinalData createProyectoFinalData = new CreateProyectoFinalData();
			try {
				createProyectoFinalData.createTestData();
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
