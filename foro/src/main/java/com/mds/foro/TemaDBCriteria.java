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

public class TemaDBCriteria extends AbstractORMCriteria {
	public final IntegerExpression idTema;
	public final IntegerExpression ocultado_porId;
	public final AssociationExpression ocultado_por;
	public final IntegerExpression creado_porId;
	public final AssociationExpression creado_por;
	public final IntegerExpression esta_enId;
	public final AssociationExpression esta_en;
	public final StringExpression tema;
	public final StringExpression descripcion;
	public final IntegerExpression cantidadLike;
	public final BooleanExpression eliminado;
	public final BooleanExpression oculto;
	public final CollectionExpression gustado_por_;
	
	public TemaDBCriteria(Criteria criteria) {
		super(criteria);
		idTema = new IntegerExpression("idTema", this);
		ocultado_porId = new IntegerExpression("ocultado_por.", this);
		ocultado_por = new AssociationExpression("ocultado_por", this);
		creado_porId = new IntegerExpression("creado_por.idUsuario", this);
		creado_por = new AssociationExpression("creado_por", this);
		esta_enId = new IntegerExpression("esta_en.idSeccion", this);
		esta_en = new AssociationExpression("esta_en", this);
		tema = new StringExpression("tema", this);
		descripcion = new StringExpression("descripcion", this);
		cantidadLike = new IntegerExpression("cantidadLike", this);
		eliminado = new BooleanExpression("eliminado", this);
		oculto = new BooleanExpression("oculto", this);
		gustado_por_ = new CollectionExpression("ORM_gustado_por_", this);
	}
	
	public TemaDBCriteria(PersistentSession session) {
		this(session.createCriteria(TemaDB.class));
	}
	
	public TemaDBCriteria() throws PersistentException {
		this(ProyectoFinalPersistentManager.instance().getSession());
	}
	
	public AdministradorDBCriteria createOcultado_porCriteria() {
		return new AdministradorDBCriteria(createCriteria("ocultado_por"));
	}
	
	public Usuario_DBCriteria createCreado_porCriteria() {
		return new Usuario_DBCriteria(createCriteria("creado_por"));
	}
	
	public SeccionDBCriteria createEsta_enCriteria() {
		return new SeccionDBCriteria(createCriteria("esta_en"));
	}
	
	public Usuario_DBCriteria createGustado_por_Criteria() {
		return new Usuario_DBCriteria(createCriteria("ORM_gustado_por_"));
	}
	
	public TemaDB uniqueTemaDB() {
		return (TemaDB) super.uniqueResult();
	}
	
	public TemaDB[] listTemaDB() {
		java.util.List list = super.list();
		return (TemaDB[]) list.toArray(new TemaDB[list.size()]);
	}
}

