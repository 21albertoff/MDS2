/**
 * Licensee: Alberto Fuentes(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectoFinalData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario_DB...");
		com.mds.foro.Usuario_DB[] commdsforoUsuario_DBs = com.mds.foro.Usuario_DBDAO.listUsuario_DBByQuery(null, null);
		int length = Math.min(commdsforoUsuario_DBs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commdsforoUsuario_DBs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing AdministradorDB...");
		com.mds.foro.AdministradorDB[] commdsforoAdministradorDBs = com.mds.foro.AdministradorDBDAO.listAdministradorDBByQuery(null, null);
		length = Math.min(commdsforoAdministradorDBs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commdsforoAdministradorDBs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing SeccionDB...");
		com.mds.foro.SeccionDB[] commdsforoSeccionDBs = com.mds.foro.SeccionDBDAO.listSeccionDBByQuery(null, null);
		length = Math.min(commdsforoSeccionDBs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commdsforoSeccionDBs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TemaDB...");
		com.mds.foro.TemaDB[] commdsforoTemaDBs = com.mds.foro.TemaDBDAO.listTemaDBByQuery(null, null);
		length = Math.min(commdsforoTemaDBs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commdsforoTemaDBs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_registradoDB...");
		com.mds.foro.Usuario_registradoDB[] commdsforoUsuario_registradoDBs = com.mds.foro.Usuario_registradoDBDAO.listUsuario_registradoDBByQuery(null, null);
		length = Math.min(commdsforoUsuario_registradoDBs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commdsforoUsuario_registradoDBs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing MensajeDB...");
		com.mds.foro.MensajeDB[] commdsforoMensajeDBs = com.mds.foro.MensajeDBDAO.listMensajeDBByQuery(null, null);
		length = Math.min(commdsforoMensajeDBs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commdsforoMensajeDBs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing NotificacionDB...");
		com.mds.foro.NotificacionDB[] commdsforoNotificacionDBs = com.mds.foro.NotificacionDBDAO.listNotificacionDBByQuery(null, null);
		length = Math.min(commdsforoNotificacionDBs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(commdsforoNotificacionDBs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuario_DB by Criteria...");
		com.mds.foro.Usuario_DBCriteria lcommdsforoUsuario_DBCriteria = new com.mds.foro.Usuario_DBCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommdsforoUsuario_DBCriteria.idUsuario.eq();
		lcommdsforoUsuario_DBCriteria.setMaxResults(ROW_COUNT);
		com.mds.foro.Usuario_DB[] commdsforoUsuario_DBs = lcommdsforoUsuario_DBCriteria.listUsuario_DB();
		int length =commdsforoUsuario_DBs== null ? 0 : Math.min(commdsforoUsuario_DBs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commdsforoUsuario_DBs[i]);
		}
		System.out.println(length + " Usuario_DB record(s) retrieved."); 
		
		System.out.println("Listing AdministradorDB by Criteria...");
		com.mds.foro.AdministradorDBCriteria lcommdsforoAdministradorDBCriteria = new com.mds.foro.AdministradorDBCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommdsforoAdministradorDBCriteria.idUsuario.eq();
		lcommdsforoAdministradorDBCriteria.setMaxResults(ROW_COUNT);
		com.mds.foro.AdministradorDB[] commdsforoAdministradorDBs = lcommdsforoAdministradorDBCriteria.listAdministradorDB();
		length =commdsforoAdministradorDBs== null ? 0 : Math.min(commdsforoAdministradorDBs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commdsforoAdministradorDBs[i]);
		}
		System.out.println(length + " AdministradorDB record(s) retrieved."); 
		
		System.out.println("Listing SeccionDB by Criteria...");
		com.mds.foro.SeccionDBCriteria lcommdsforoSeccionDBCriteria = new com.mds.foro.SeccionDBCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommdsforoSeccionDBCriteria.idSeccion.eq();
		lcommdsforoSeccionDBCriteria.setMaxResults(ROW_COUNT);
		com.mds.foro.SeccionDB[] commdsforoSeccionDBs = lcommdsforoSeccionDBCriteria.listSeccionDB();
		length =commdsforoSeccionDBs== null ? 0 : Math.min(commdsforoSeccionDBs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commdsforoSeccionDBs[i]);
		}
		System.out.println(length + " SeccionDB record(s) retrieved."); 
		
		System.out.println("Listing TemaDB by Criteria...");
		com.mds.foro.TemaDBCriteria lcommdsforoTemaDBCriteria = new com.mds.foro.TemaDBCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommdsforoTemaDBCriteria.idTema.eq();
		lcommdsforoTemaDBCriteria.setMaxResults(ROW_COUNT);
		com.mds.foro.TemaDB[] commdsforoTemaDBs = lcommdsforoTemaDBCriteria.listTemaDB();
		length =commdsforoTemaDBs== null ? 0 : Math.min(commdsforoTemaDBs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commdsforoTemaDBs[i]);
		}
		System.out.println(length + " TemaDB record(s) retrieved."); 
		
		System.out.println("Listing Usuario_registradoDB by Criteria...");
		com.mds.foro.Usuario_registradoDBCriteria lcommdsforoUsuario_registradoDBCriteria = new com.mds.foro.Usuario_registradoDBCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommdsforoUsuario_registradoDBCriteria.idUsuario.eq();
		lcommdsforoUsuario_registradoDBCriteria.setMaxResults(ROW_COUNT);
		com.mds.foro.Usuario_registradoDB[] commdsforoUsuario_registradoDBs = lcommdsforoUsuario_registradoDBCriteria.listUsuario_registradoDB();
		length =commdsforoUsuario_registradoDBs== null ? 0 : Math.min(commdsforoUsuario_registradoDBs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commdsforoUsuario_registradoDBs[i]);
		}
		System.out.println(length + " Usuario_registradoDB record(s) retrieved."); 
		
		System.out.println("Listing MensajeDB by Criteria...");
		com.mds.foro.MensajeDBCriteria lcommdsforoMensajeDBCriteria = new com.mds.foro.MensajeDBCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommdsforoMensajeDBCriteria.idMensaje.eq();
		lcommdsforoMensajeDBCriteria.setMaxResults(ROW_COUNT);
		com.mds.foro.MensajeDB[] commdsforoMensajeDBs = lcommdsforoMensajeDBCriteria.listMensajeDB();
		length =commdsforoMensajeDBs== null ? 0 : Math.min(commdsforoMensajeDBs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commdsforoMensajeDBs[i]);
		}
		System.out.println(length + " MensajeDB record(s) retrieved."); 
		
		System.out.println("Listing NotificacionDB by Criteria...");
		com.mds.foro.NotificacionDBCriteria lcommdsforoNotificacionDBCriteria = new com.mds.foro.NotificacionDBCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcommdsforoNotificacionDBCriteria.idNotificacion.eq();
		lcommdsforoNotificacionDBCriteria.setMaxResults(ROW_COUNT);
		com.mds.foro.NotificacionDB[] commdsforoNotificacionDBs = lcommdsforoNotificacionDBCriteria.listNotificacionDB();
		length =commdsforoNotificacionDBs== null ? 0 : Math.min(commdsforoNotificacionDBs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(commdsforoNotificacionDBs[i]);
		}
		System.out.println(length + " NotificacionDB record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoFinalData listProyectoFinalData = new ListProyectoFinalData();
			try {
				listProyectoFinalData.listTestData();
				//listProyectoFinalData.listByCriteria();
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
