/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Alberto Fuentes(University of Almeria)
 * License Type: Academic
 */
package com.mds.foro;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class NotificacionDBDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idNotificacion;
	public final IntegerExpression enviada_porId;
	public final AssociationExpression enviada_por;
	public final StringExpression mensajeNotif;
	
	public NotificacionDBDetachedCriteria() {
		super(com.mds.foro.NotificacionDB.class, com.mds.foro.NotificacionDBCriteria.class);
		idNotificacion = new IntegerExpression("idNotificacion", this.getDetachedCriteria());
		enviada_porId = new IntegerExpression("enviada_por.idUsuario", this.getDetachedCriteria());
		enviada_por = new AssociationExpression("enviada_por", this.getDetachedCriteria());
		mensajeNotif = new StringExpression("mensajeNotif", this.getDetachedCriteria());
	}
	
	public NotificacionDBDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds.foro.NotificacionDBCriteria.class);
		idNotificacion = new IntegerExpression("idNotificacion", this.getDetachedCriteria());
		enviada_porId = new IntegerExpression("enviada_por.idUsuario", this.getDetachedCriteria());
		enviada_por = new AssociationExpression("enviada_por", this.getDetachedCriteria());
		mensajeNotif = new StringExpression("mensajeNotif", this.getDetachedCriteria());
	}
	
	public Usuario_DBDetachedCriteria createEnviada_porCriteria() {
		return new Usuario_DBDetachedCriteria(createCriteria("enviada_por"));
	}
	
	public NotificacionDB uniqueNotificacionDB(PersistentSession session) {
		return (NotificacionDB) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public NotificacionDB[] listNotificacionDB(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (NotificacionDB[]) list.toArray(new NotificacionDB[list.size()]);
	}
}

