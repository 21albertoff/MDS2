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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorDBCriteria extends AbstractORMCriteria {
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
	
	public AdministradorDBCriteria(Criteria criteria) {
		super(criteria);
		idUsuario = new IntegerExpression("idUsuario", this);
		convertido_porId = new IntegerExpression("convertido_por.", this);
		convertido_por = new AssociationExpression("convertido_por", this);
		baneado_porId = new IntegerExpression("baneado_por.", this);
		baneado_por = new AssociationExpression("baneado_por", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		nombreCompleto = new StringExpression("nombreCompleto", this);
		correo = new StringExpression("correo", this);
		password = new StringExpression("password", this);
		descripcion = new StringExpression("descripcion", this);
		foto = new StringExpression("foto", this);
		recibir_notificacion = new BooleanExpression("recibir_notificacion", this);
		recibir_por_correo = new BooleanExpression("recibir_por_correo", this);
		perfil_oculto = new BooleanExpression("perfil_oculto", this);
		permiso = new IntegerExpression("permiso", this);
		baneado = new BooleanExpression("baneado", this);
		amigo = new CollectionExpression("ORM_amigo", this);
		da_megusta = new CollectionExpression("ORM_da_megusta", this);
		amigo_de = new CollectionExpression("ORM_amigo_de", this);
		recibe = new CollectionExpression("ORM_recibe", this);
		crea_tema = new CollectionExpression("ORM_crea_tema", this);
		crea_mensaje = new CollectionExpression("ORM_crea_mensaje", this);
		da_megusta_ = new CollectionExpression("ORM_da_megusta_", this);
		convierte_en_moderador = new CollectionExpression("ORM_convierte_en_moderador", this);
		banea = new CollectionExpression("ORM_banea", this);
		crea_seccion = new CollectionExpression("ORM_crea_seccion", this);
		baneaN = new CollectionExpression("ORM_baneaN", this);
		oculta_tema = new CollectionExpression("ORM_oculta_tema", this);
		oculta_mensaje = new CollectionExpression("ORM_oculta_mensaje", this);
	}
	
	public AdministradorDBCriteria(PersistentSession session) {
		this(session.createCriteria(AdministradorDB.class));
	}
	
	public AdministradorDBCriteria() throws PersistentException {
		this(ProyectoFinalPersistentManager.instance().getSession());
	}
	
	public Usuario_DBCriteria createConvierte_en_moderadorCriteria() {
		return new Usuario_DBCriteria(createCriteria("ORM_convierte_en_moderador"));
	}
	
	public Usuario_DBCriteria createBaneaCriteria() {
		return new Usuario_DBCriteria(createCriteria("ORM_banea"));
	}
	
	public SeccionDBCriteria createCrea_seccionCriteria() {
		return new SeccionDBCriteria(createCriteria("ORM_crea_seccion"));
	}
	
	public Usuario_notificadosDBCriteria createBaneaNCriteria() {
		return new Usuario_notificadosDBCriteria(createCriteria("ORM_baneaN"));
	}
	
	public TemaDBCriteria createOculta_temaCriteria() {
		return new TemaDBCriteria(createCriteria("ORM_oculta_tema"));
	}
	
	public MensajeDBCriteria createOculta_mensajeCriteria() {
		return new MensajeDBCriteria(createCriteria("ORM_oculta_mensaje"));
	}
	
	public AdministradorDBCriteria createConvertido_porCriteria() {
		return new AdministradorDBCriteria(createCriteria("convertido_por"));
	}
	
	public AdministradorDBCriteria createBaneado_porCriteria() {
		return new AdministradorDBCriteria(createCriteria("baneado_por"));
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
	
	public AdministradorDB uniqueAdministradorDB() {
		return (AdministradorDB) super.uniqueResult();
	}
	
	public AdministradorDB[] listAdministradorDB() {
		java.util.List list = super.list();
		return (AdministradorDB[]) list.toArray(new AdministradorDB[list.size()]);
	}
}

