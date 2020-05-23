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

public class SeccionDBDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idSeccion;
	public final IntegerExpression creada_porId;
	public final AssociationExpression creada_por;
	public final StringExpression seccion;
	public final StringExpression icono;
	public final BooleanExpression seccionFija;
	public final BooleanExpression eliminado;
	public final CollectionExpression contiene;
	
	public SeccionDBDetachedCriteria() {
		super(com.mds.foro.SeccionDB.class, com.mds.foro.SeccionDBCriteria.class);
		idSeccion = new IntegerExpression("idSeccion", this.getDetachedCriteria());
		creada_porId = new IntegerExpression("creada_por.", this.getDetachedCriteria());
		creada_por = new AssociationExpression("creada_por", this.getDetachedCriteria());
		seccion = new StringExpression("seccion", this.getDetachedCriteria());
		icono = new StringExpression("icono", this.getDetachedCriteria());
		seccionFija = new BooleanExpression("seccionFija", this.getDetachedCriteria());
		eliminado = new BooleanExpression("eliminado", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
	}
	
	public SeccionDBDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.mds.foro.SeccionDBCriteria.class);
		idSeccion = new IntegerExpression("idSeccion", this.getDetachedCriteria());
		creada_porId = new IntegerExpression("creada_por.", this.getDetachedCriteria());
		creada_por = new AssociationExpression("creada_por", this.getDetachedCriteria());
		seccion = new StringExpression("seccion", this.getDetachedCriteria());
		icono = new StringExpression("icono", this.getDetachedCriteria());
		seccionFija = new BooleanExpression("seccionFija", this.getDetachedCriteria());
		eliminado = new BooleanExpression("eliminado", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
	}
	
	public AdministradorDBDetachedCriteria createCreada_porCriteria() {
		return new AdministradorDBDetachedCriteria(createCriteria("creada_por"));
	}
	
	public TemaDBDetachedCriteria createContieneCriteria() {
		return new TemaDBDetachedCriteria(createCriteria("ORM_contiene"));
	}
	
	public SeccionDB uniqueSeccionDB(PersistentSession session) {
		return (SeccionDB) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SeccionDB[] listSeccionDB(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SeccionDB[]) list.toArray(new SeccionDB[list.size()]);
	}
}

