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

public class TemaDBDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public TemaDBDetachedCriteria() {
		super(com.mds.foro.TemaDB.class, com.mds.foro.TemaDBCriteria.class);
		idTema = new IntegerExpression("idTema", this.getDetachedCriteria());
		ocultado_porId = new IntegerExpression("ocultado_por.", this.getDetachedCriteria());
		ocultado_por = new AssociationExpression("ocultado_por", this.getDetachedCriteria());
		creado_porId = new IntegerExpression("creado_por.idUsuario", this.getDetachedCriteria());
		creado_por = new AssociationExpression("creado_por", this.getDetachedCriteria());
		esta_enId = new IntegerExpression("esta_en.idSeccion", this.getDetachedCriteria());
		esta_en = new AssociationExpression("esta_en", this.getDetachedCriteria());
		tema = new StringExpression("tema", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		cantidadLike = new IntegerExpression("cantidadLike", this.getDetachedCriteria());
		eliminado = new BooleanExpression("eliminado", this.getDetachedCriteria());
		oculto = new BooleanExpression("oculto", this.getDetachedCriteria());
		gustado_por_ = new CollectionExpression("ORM_gustado_por_", this.getDetachedCriteria());
	}
	
	public TemaDBDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds.foro.TemaDBCriteria.class);
		idTema = new IntegerExpression("idTema", this.getDetachedCriteria());
		ocultado_porId = new IntegerExpression("ocultado_por.", this.getDetachedCriteria());
		ocultado_por = new AssociationExpression("ocultado_por", this.getDetachedCriteria());
		creado_porId = new IntegerExpression("creado_por.idUsuario", this.getDetachedCriteria());
		creado_por = new AssociationExpression("creado_por", this.getDetachedCriteria());
		esta_enId = new IntegerExpression("esta_en.idSeccion", this.getDetachedCriteria());
		esta_en = new AssociationExpression("esta_en", this.getDetachedCriteria());
		tema = new StringExpression("tema", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		cantidadLike = new IntegerExpression("cantidadLike", this.getDetachedCriteria());
		eliminado = new BooleanExpression("eliminado", this.getDetachedCriteria());
		oculto = new BooleanExpression("oculto", this.getDetachedCriteria());
		gustado_por_ = new CollectionExpression("ORM_gustado_por_", this.getDetachedCriteria());
	}
	
	public AdministradorDBDetachedCriteria createOcultado_porCriteria() {
		return new AdministradorDBDetachedCriteria(createCriteria("ocultado_por"));
	}
	
	public Usuario_DBDetachedCriteria createCreado_porCriteria() {
		return new Usuario_DBDetachedCriteria(createCriteria("creado_por"));
	}
	
	public SeccionDBDetachedCriteria createEsta_enCriteria() {
		return new SeccionDBDetachedCriteria(createCriteria("esta_en"));
	}
	
	public Usuario_DBDetachedCriteria createGustado_por_Criteria() {
		return new Usuario_DBDetachedCriteria(createCriteria("ORM_gustado_por_"));
	}
	
	public TemaDB uniqueTemaDB(PersistentSession session) {
		return (TemaDB) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TemaDB[] listTemaDB(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TemaDB[]) list.toArray(new TemaDB[list.size()]);
	}
}

