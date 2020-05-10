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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class NotificacionDBCriteria extends AbstractORMCriteria {
	public final IntegerExpression idNotificacion;
	public final IntegerExpression enviada_porId;
	public final AssociationExpression enviada_por;
	public final StringExpression mensajeNotif;
	
	public NotificacionDBCriteria(Criteria criteria) {
		super(criteria);
		idNotificacion = new IntegerExpression("idNotificacion", this);
		enviada_porId = new IntegerExpression("enviada_por.idUsuario", this);
		enviada_por = new AssociationExpression("enviada_por", this);
		mensajeNotif = new StringExpression("mensajeNotif", this);
	}
	
	public NotificacionDBCriteria(PersistentSession session) {
		this(session.createCriteria(NotificacionDB.class));
	}
	
	public NotificacionDBCriteria() throws PersistentException {
		this(ProyectoFinalPersistentManager.instance().getSession());
	}
	
	public Usuario_DBCriteria createEnviada_porCriteria() {
		return new Usuario_DBCriteria(createCriteria("enviada_por"));
	}
	
	public NotificacionDB uniqueNotificacionDB() {
		return (NotificacionDB) super.uniqueResult();
	}
	
	public NotificacionDB[] listNotificacionDB() {
		java.util.List list = super.list();
		return (NotificacionDB[]) list.toArray(new NotificacionDB[list.size()]);
	}
}

