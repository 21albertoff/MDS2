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

public class MensajeDBDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idMensaje;
	public final IntegerExpression ocultado_porId;
	public final AssociationExpression ocultado_por;
	public final IntegerExpression creado_porId;
	public final AssociationExpression creado_por;
	public final IntegerExpression esta_enId;
	public final AssociationExpression esta_en;
	public final StringExpression mensaje;
	public final IntegerExpression cantidadLike;
	public final BooleanExpression eliminado;
	public final BooleanExpression oculto;
	public final StringExpression video;
	public final StringExpression foto1;
	public final StringExpression foto2;
	public final StringExpression foto3;
	public final CollectionExpression contiene_respuesta;
	public final CollectionExpression gustado_por;
	
	public MensajeDBDetachedCriteria() {
		super(com.mds.foro.MensajeDB.class, com.mds.foro.MensajeDBCriteria.class);
		idMensaje = new IntegerExpression("idMensaje", this.getDetachedCriteria());
		ocultado_porId = new IntegerExpression("ocultado_por.", this.getDetachedCriteria());
		ocultado_por = new AssociationExpression("ocultado_por", this.getDetachedCriteria());
		creado_porId = new IntegerExpression("creado_por.idUsuario", this.getDetachedCriteria());
		creado_por = new AssociationExpression("creado_por", this.getDetachedCriteria());
		esta_enId = new IntegerExpression("esta_en.idMensaje", this.getDetachedCriteria());
		esta_en = new AssociationExpression("esta_en", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		cantidadLike = new IntegerExpression("cantidadLike", this.getDetachedCriteria());
		eliminado = new BooleanExpression("eliminado", this.getDetachedCriteria());
		oculto = new BooleanExpression("oculto", this.getDetachedCriteria());
		video = new StringExpression("video", this.getDetachedCriteria());
		foto1 = new StringExpression("foto1", this.getDetachedCriteria());
		foto2 = new StringExpression("foto2", this.getDetachedCriteria());
		foto3 = new StringExpression("foto3", this.getDetachedCriteria());
		contiene_respuesta = new CollectionExpression("ORM_contiene_respuesta", this.getDetachedCriteria());
		gustado_por = new CollectionExpression("ORM_gustado_por", this.getDetachedCriteria());
	}
	
	public MensajeDBDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds.foro.MensajeDBCriteria.class);
		idMensaje = new IntegerExpression("idMensaje", this.getDetachedCriteria());
		ocultado_porId = new IntegerExpression("ocultado_por.", this.getDetachedCriteria());
		ocultado_por = new AssociationExpression("ocultado_por", this.getDetachedCriteria());
		creado_porId = new IntegerExpression("creado_por.idUsuario", this.getDetachedCriteria());
		creado_por = new AssociationExpression("creado_por", this.getDetachedCriteria());
		esta_enId = new IntegerExpression("esta_en.idMensaje", this.getDetachedCriteria());
		esta_en = new AssociationExpression("esta_en", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		cantidadLike = new IntegerExpression("cantidadLike", this.getDetachedCriteria());
		eliminado = new BooleanExpression("eliminado", this.getDetachedCriteria());
		oculto = new BooleanExpression("oculto", this.getDetachedCriteria());
		video = new StringExpression("video", this.getDetachedCriteria());
		foto1 = new StringExpression("foto1", this.getDetachedCriteria());
		foto2 = new StringExpression("foto2", this.getDetachedCriteria());
		foto3 = new StringExpression("foto3", this.getDetachedCriteria());
		contiene_respuesta = new CollectionExpression("ORM_contiene_respuesta", this.getDetachedCriteria());
		gustado_por = new CollectionExpression("ORM_gustado_por", this.getDetachedCriteria());
	}
	
	public AdministradorDBDetachedCriteria createOcultado_porCriteria() {
		return new AdministradorDBDetachedCriteria(createCriteria("ocultado_por"));
	}
	
	public Usuario_DBDetachedCriteria createCreado_porCriteria() {
		return new Usuario_DBDetachedCriteria(createCriteria("creado_por"));
	}
	
	public MensajeDBDetachedCriteria createEsta_enCriteria() {
		return new MensajeDBDetachedCriteria(createCriteria("esta_en"));
	}
	
	public MensajeDBDetachedCriteria createContiene_respuestaCriteria() {
		return new MensajeDBDetachedCriteria(createCriteria("ORM_contiene_respuesta"));
	}
	
	public Usuario_DBDetachedCriteria createGustado_porCriteria() {
		return new Usuario_DBDetachedCriteria(createCriteria("ORM_gustado_por"));
	}
	
	public MensajeDB uniqueMensajeDB(PersistentSession session) {
		return (MensajeDB) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public MensajeDB[] listMensajeDB(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (MensajeDB[]) list.toArray(new MensajeDB[list.size()]);
	}
}

