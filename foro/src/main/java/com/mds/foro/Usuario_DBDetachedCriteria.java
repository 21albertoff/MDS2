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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Usuario_DBDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idUsuario;
	public final StringExpression nombreUsuario;
	public final StringExpression nombreCompleto;
	public final StringExpression correo;
	public final StringExpression contraseña;
	public final StringExpression descripcion;
	public final StringExpression foto;
	public final BooleanExpression recibir_notificacion;
	public final BooleanExpression recibir_por_correo;
	public final BooleanExpression perfil_oculto;
	public final CollectionExpression amigo;
	public final CollectionExpression da_megusta;
	public final CollectionExpression amigo_de;
	public final CollectionExpression recibe;
	public final CollectionExpression crea_tema;
	public final CollectionExpression crea_mensaje;
	public final CollectionExpression da_megusta_;
	
	public Usuario_DBDetachedCriteria() {
		super(com.mds.foro.Usuario_DB.class, com.mds.foro.Usuario_DBCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		nombreCompleto = new StringExpression("nombreCompleto", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		recibir_notificacion = new BooleanExpression("recibir_notificacion", this.getDetachedCriteria());
		recibir_por_correo = new BooleanExpression("recibir_por_correo", this.getDetachedCriteria());
		perfil_oculto = new BooleanExpression("perfil_oculto", this.getDetachedCriteria());
		amigo = new CollectionExpression("ORM_amigo", this.getDetachedCriteria());
		da_megusta = new CollectionExpression("ORM_da_megusta", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		recibe = new CollectionExpression("ORM_recibe", this.getDetachedCriteria());
		crea_tema = new CollectionExpression("ORM_crea_tema", this.getDetachedCriteria());
		crea_mensaje = new CollectionExpression("ORM_crea_mensaje", this.getDetachedCriteria());
		da_megusta_ = new CollectionExpression("ORM_da_megusta_", this.getDetachedCriteria());
	}
	
	public Usuario_DBDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds.foro.Usuario_DBCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		nombreCompleto = new StringExpression("nombreCompleto", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		recibir_notificacion = new BooleanExpression("recibir_notificacion", this.getDetachedCriteria());
		recibir_por_correo = new BooleanExpression("recibir_por_correo", this.getDetachedCriteria());
		perfil_oculto = new BooleanExpression("perfil_oculto", this.getDetachedCriteria());
		amigo = new CollectionExpression("ORM_amigo", this.getDetachedCriteria());
		da_megusta = new CollectionExpression("ORM_da_megusta", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		recibe = new CollectionExpression("ORM_recibe", this.getDetachedCriteria());
		crea_tema = new CollectionExpression("ORM_crea_tema", this.getDetachedCriteria());
		crea_mensaje = new CollectionExpression("ORM_crea_mensaje", this.getDetachedCriteria());
		da_megusta_ = new CollectionExpression("ORM_da_megusta_", this.getDetachedCriteria());
	}
	
	public Usuario_DBDetachedCriteria createAmigoCriteria() {
		return new Usuario_DBDetachedCriteria(createCriteria("ORM_amigo"));
	}
	
	public MensajeDBDetachedCriteria createDa_megustaCriteria() {
		return new MensajeDBDetachedCriteria(createCriteria("ORM_da_megusta"));
	}
	
	public Usuario_DBDetachedCriteria createAmigo_deCriteria() {
		return new Usuario_DBDetachedCriteria(createCriteria("ORM_amigo_de"));
	}
	
	public NotificacionDBDetachedCriteria createRecibeCriteria() {
		return new NotificacionDBDetachedCriteria(createCriteria("ORM_recibe"));
	}
	
	public TemaDBDetachedCriteria createCrea_temaCriteria() {
		return new TemaDBDetachedCriteria(createCriteria("ORM_crea_tema"));
	}
	
	public MensajeDBDetachedCriteria createCrea_mensajeCriteria() {
		return new MensajeDBDetachedCriteria(createCriteria("ORM_crea_mensaje"));
	}
	
	public TemaDBDetachedCriteria createDa_megusta_Criteria() {
		return new TemaDBDetachedCriteria(createCriteria("ORM_da_megusta_"));
	}
	
	public Usuario_DB uniqueUsuario_DB(PersistentSession session) {
		return (Usuario_DB) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_DB[] listUsuario_DB(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_DB[]) list.toArray(new Usuario_DB[list.size()]);
	}
}

