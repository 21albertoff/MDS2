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

public class MensajeDBCriteria extends AbstractORMCriteria {
	public final IntegerExpression idMensaje;
	public final IntegerExpression esta_enId;
	public final AssociationExpression esta_en;
	public final IntegerExpression contieneMId;
	public final AssociationExpression contieneM;
	public final IntegerExpression creado_porId;
	public final AssociationExpression creado_por;
	public final IntegerExpression ocultado_porId;
	public final AssociationExpression ocultado_por;
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
	
	public MensajeDBCriteria(Criteria criteria) {
		super(criteria);
		idMensaje = new IntegerExpression("idMensaje", this);
		esta_enId = new IntegerExpression("esta_en.idMensaje", this);
		esta_en = new AssociationExpression("esta_en", this);
		contieneMId = new IntegerExpression("contieneM.idTema", this);
		contieneM = new AssociationExpression("contieneM", this);
		creado_porId = new IntegerExpression("creado_por.idUsuario", this);
		creado_por = new AssociationExpression("creado_por", this);
		ocultado_porId = new IntegerExpression("ocultado_por.", this);
		ocultado_por = new AssociationExpression("ocultado_por", this);
		mensaje = new StringExpression("mensaje", this);
		cantidadLike = new IntegerExpression("cantidadLike", this);
		eliminado = new BooleanExpression("eliminado", this);
		oculto = new BooleanExpression("oculto", this);
		video = new StringExpression("video", this);
		foto1 = new StringExpression("foto1", this);
		foto2 = new StringExpression("foto2", this);
		foto3 = new StringExpression("foto3", this);
		contiene_respuesta = new CollectionExpression("ORM_contiene_respuesta", this);
		gustado_por = new CollectionExpression("ORM_gustado_por", this);
	}
	
	public MensajeDBCriteria(PersistentSession session) {
		this(session.createCriteria(MensajeDB.class));
	}
	
	public MensajeDBCriteria() throws PersistentException {
		this(ProyectoFinalPersistentManager.instance().getSession());
	}
	
	public MensajeDBCriteria createEsta_enCriteria() {
		return new MensajeDBCriteria(createCriteria("esta_en"));
	}
	
	public TemaDBCriteria createContieneMCriteria() {
		return new TemaDBCriteria(createCriteria("contieneM"));
	}
	
	public Usuario_DBCriteria createCreado_porCriteria() {
		return new Usuario_DBCriteria(createCriteria("creado_por"));
	}
	
	public AdministradorDBCriteria createOcultado_porCriteria() {
		return new AdministradorDBCriteria(createCriteria("ocultado_por"));
	}
	
	public MensajeDBCriteria createContiene_respuestaCriteria() {
		return new MensajeDBCriteria(createCriteria("ORM_contiene_respuesta"));
	}
	
	public Usuario_DBCriteria createGustado_porCriteria() {
		return new Usuario_DBCriteria(createCriteria("ORM_gustado_por"));
	}
	
	public MensajeDB uniqueMensajeDB() {
		return (MensajeDB) super.uniqueResult();
	}
	
	public MensajeDB[] listMensajeDB() {
		java.util.List list = super.list();
		return (MensajeDB[]) list.toArray(new MensajeDB[list.size()]);
	}
}

