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

public class AdministradorDBDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idUsuario;
	public final IntegerExpression convertido_porId;
	public final AssociationExpression convertido_por;
	public final IntegerExpression baneado_porId;
	public final AssociationExpression baneado_por;
	public final StringExpression nombreUsuario;
	public final StringExpression nombreCompleto;
	public final StringExpression correo;
	public final StringExpression password;
	public final StringExpression descripcion;
	public final StringExpression foto;
	public final BooleanExpression recibir_notificacion;
	public final BooleanExpression recibir_por_correo;
	public final BooleanExpression perfil_oculto;
	public final IntegerExpression permiso;
	public final BooleanExpression baneado;
	public final CollectionExpression amigo;
	public final CollectionExpression da_megusta;
	public final CollectionExpression amigo_de;
	public final CollectionExpression recibe;
	public final CollectionExpression crea_tema;
	public final CollectionExpression crea_mensaje;
	public final CollectionExpression da_megusta_;
	public final CollectionExpression convierte_en_moderador;
	public final CollectionExpression banea;
	public final CollectionExpression crea_seccion;
	public final CollectionExpression baneaN;
	public final CollectionExpression oculta_tema;
	public final CollectionExpression oculta_mensaje;
	
	public AdministradorDBDetachedCriteria() {
		super(com.mds.foro.AdministradorDB.class, com.mds.foro.AdministradorDBCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		convertido_porId = new IntegerExpression("convertido_por.", this.getDetachedCriteria());
		convertido_por = new AssociationExpression("convertido_por", this.getDetachedCriteria());
		baneado_porId = new IntegerExpression("baneado_por.", this.getDetachedCriteria());
		baneado_por = new AssociationExpression("baneado_por", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		nombreCompleto = new StringExpression("nombreCompleto", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		recibir_notificacion = new BooleanExpression("recibir_notificacion", this.getDetachedCriteria());
		recibir_por_correo = new BooleanExpression("recibir_por_correo", this.getDetachedCriteria());
		perfil_oculto = new BooleanExpression("perfil_oculto", this.getDetachedCriteria());
		permiso = new IntegerExpression("permiso", this.getDetachedCriteria());
		baneado = new BooleanExpression("baneado", this.getDetachedCriteria());
		amigo = new CollectionExpression("ORM_amigo", this.getDetachedCriteria());
		da_megusta = new CollectionExpression("ORM_da_megusta", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		recibe = new CollectionExpression("ORM_recibe", this.getDetachedCriteria());
		crea_tema = new CollectionExpression("ORM_crea_tema", this.getDetachedCriteria());
		crea_mensaje = new CollectionExpression("ORM_crea_mensaje", this.getDetachedCriteria());
		da_megusta_ = new CollectionExpression("ORM_da_megusta_", this.getDetachedCriteria());
		convierte_en_moderador = new CollectionExpression("ORM_convierte_en_moderador", this.getDetachedCriteria());
		banea = new CollectionExpression("ORM_banea", this.getDetachedCriteria());
		crea_seccion = new CollectionExpression("ORM_crea_seccion", this.getDetachedCriteria());
		baneaN = new CollectionExpression("ORM_baneaN", this.getDetachedCriteria());
		oculta_tema = new CollectionExpression("ORM_oculta_tema", this.getDetachedCriteria());
		oculta_mensaje = new CollectionExpression("ORM_oculta_mensaje", this.getDetachedCriteria());
	}
	
	public AdministradorDBDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds.foro.AdministradorDBCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		convertido_porId = new IntegerExpression("convertido_por.", this.getDetachedCriteria());
		convertido_por = new AssociationExpression("convertido_por", this.getDetachedCriteria());
		baneado_porId = new IntegerExpression("baneado_por.", this.getDetachedCriteria());
		baneado_por = new AssociationExpression("baneado_por", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		nombreCompleto = new StringExpression("nombreCompleto", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		recibir_notificacion = new BooleanExpression("recibir_notificacion", this.getDetachedCriteria());
		recibir_por_correo = new BooleanExpression("recibir_por_correo", this.getDetachedCriteria());
		perfil_oculto = new BooleanExpression("perfil_oculto", this.getDetachedCriteria());
		permiso = new IntegerExpression("permiso", this.getDetachedCriteria());
		baneado = new BooleanExpression("baneado", this.getDetachedCriteria());
		amigo = new CollectionExpression("ORM_amigo", this.getDetachedCriteria());
		da_megusta = new CollectionExpression("ORM_da_megusta", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		recibe = new CollectionExpression("ORM_recibe", this.getDetachedCriteria());
		crea_tema = new CollectionExpression("ORM_crea_tema", this.getDetachedCriteria());
		crea_mensaje = new CollectionExpression("ORM_crea_mensaje", this.getDetachedCriteria());
		da_megusta_ = new CollectionExpression("ORM_da_megusta_", this.getDetachedCriteria());
		convierte_en_moderador = new CollectionExpression("ORM_convierte_en_moderador", this.getDetachedCriteria());
		banea = new CollectionExpression("ORM_banea", this.getDetachedCriteria());
		crea_seccion = new CollectionExpression("ORM_crea_seccion", this.getDetachedCriteria());
		baneaN = new CollectionExpression("ORM_baneaN", this.getDetachedCriteria());
		oculta_tema = new CollectionExpression("ORM_oculta_tema", this.getDetachedCriteria());
		oculta_mensaje = new CollectionExpression("ORM_oculta_mensaje", this.getDetachedCriteria());
	}
	
	public Usuario_DBDetachedCriteria createConvierte_en_moderadorCriteria() {
		return new Usuario_DBDetachedCriteria(createCriteria("ORM_convierte_en_moderador"));
	}
	
	public Usuario_DBDetachedCriteria createBaneaCriteria() {
		return new Usuario_DBDetachedCriteria(createCriteria("ORM_banea"));
	}
	
	public SeccionDBDetachedCriteria createCrea_seccionCriteria() {
		return new SeccionDBDetachedCriteria(createCriteria("ORM_crea_seccion"));
	}
	
	public Usuario_notificadosDBDetachedCriteria createBaneaNCriteria() {
		return new Usuario_notificadosDBDetachedCriteria(createCriteria("ORM_baneaN"));
	}
	
	public TemaDBDetachedCriteria createOculta_temaCriteria() {
		return new TemaDBDetachedCriteria(createCriteria("ORM_oculta_tema"));
	}
	
	public MensajeDBDetachedCriteria createOculta_mensajeCriteria() {
		return new MensajeDBDetachedCriteria(createCriteria("ORM_oculta_mensaje"));
	}
	
	public AdministradorDBDetachedCriteria createConvertido_porCriteria() {
		return new AdministradorDBDetachedCriteria(createCriteria("convertido_por"));
	}
	
	public AdministradorDBDetachedCriteria createBaneado_porCriteria() {
		return new AdministradorDBDetachedCriteria(createCriteria("baneado_por"));
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
	
	public AdministradorDB uniqueAdministradorDB(PersistentSession session) {
		return (AdministradorDB) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public AdministradorDB[] listAdministradorDB(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (AdministradorDB[]) list.toArray(new AdministradorDB[list.size()]);
	}
}

