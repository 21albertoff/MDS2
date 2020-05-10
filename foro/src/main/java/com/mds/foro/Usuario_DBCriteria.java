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

public class Usuario_DBCriteria extends AbstractORMCriteria {
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
	
	public Usuario_DBCriteria(Criteria criteria) {
		super(criteria);
		idUsuario = new IntegerExpression("idUsuario", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		nombreCompleto = new StringExpression("nombreCompleto", this);
		correo = new StringExpression("correo", this);
		contraseña = new StringExpression("contraseña", this);
		descripcion = new StringExpression("descripcion", this);
		foto = new StringExpression("foto", this);
		recibir_notificacion = new BooleanExpression("recibir_notificacion", this);
		recibir_por_correo = new BooleanExpression("recibir_por_correo", this);
		perfil_oculto = new BooleanExpression("perfil_oculto", this);
		amigo = new CollectionExpression("ORM_amigo", this);
		da_megusta = new CollectionExpression("ORM_da_megusta", this);
		amigo_de = new CollectionExpression("ORM_amigo_de", this);
		recibe = new CollectionExpression("ORM_recibe", this);
		crea_tema = new CollectionExpression("ORM_crea_tema", this);
		crea_mensaje = new CollectionExpression("ORM_crea_mensaje", this);
		da_megusta_ = new CollectionExpression("ORM_da_megusta_", this);
	}
	
	public Usuario_DBCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario_DB.class));
	}
	
	public Usuario_DBCriteria() throws PersistentException {
		this(ProyectoFinalPersistentManager.instance().getSession());
	}
	
	public Usuario_DBCriteria createAmigoCriteria() {
		return new Usuario_DBCriteria(createCriteria("ORM_amigo"));
	}
	
	public MensajeDBCriteria createDa_megustaCriteria() {
		return new MensajeDBCriteria(createCriteria("ORM_da_megusta"));
	}
	
	public Usuario_DBCriteria createAmigo_deCriteria() {
		return new Usuario_DBCriteria(createCriteria("ORM_amigo_de"));
	}
	
	public NotificacionDBCriteria createRecibeCriteria() {
		return new NotificacionDBCriteria(createCriteria("ORM_recibe"));
	}
	
	public TemaDBCriteria createCrea_temaCriteria() {
		return new TemaDBCriteria(createCriteria("ORM_crea_tema"));
	}
	
	public MensajeDBCriteria createCrea_mensajeCriteria() {
		return new MensajeDBCriteria(createCriteria("ORM_crea_mensaje"));
	}
	
	public TemaDBCriteria createDa_megusta_Criteria() {
		return new TemaDBCriteria(createCriteria("ORM_da_megusta_"));
	}
	
	public Usuario_DB uniqueUsuario_DB() {
		return (Usuario_DB) super.uniqueResult();
	}
	
	public Usuario_DB[] listUsuario_DB() {
		java.util.List list = super.list();
		return (Usuario_DB[]) list.toArray(new Usuario_DB[list.size()]);
	}
}

