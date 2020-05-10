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

public class SeccionDBCriteria extends AbstractORMCriteria {
	public final IntegerExpression idSeccion;
	public final IntegerExpression creada_porId;
	public final AssociationExpression creada_por;
	public final StringExpression seccion;
	public final StringExpression icono;
	public final BooleanExpression seccionFija;
	public final BooleanExpression eliminado;
	public final CollectionExpression contiene;
	
	public SeccionDBCriteria(Criteria criteria) {
		super(criteria);
		idSeccion = new IntegerExpression("idSeccion", this);
		creada_porId = new IntegerExpression("creada_por.", this);
		creada_por = new AssociationExpression("creada_por", this);
		seccion = new StringExpression("seccion", this);
		icono = new StringExpression("icono", this);
		seccionFija = new BooleanExpression("seccionFija", this);
		eliminado = new BooleanExpression("eliminado", this);
		contiene = new CollectionExpression("ORM_contiene", this);
	}
	
	public SeccionDBCriteria(PersistentSession session) {
		this(session.createCriteria(SeccionDB.class));
	}
	
	public SeccionDBCriteria() throws PersistentException {
		this(ProyectoFinalPersistentManager.instance().getSession());
	}
	
	public AdministradorDBCriteria createCreada_porCriteria() {
		return new AdministradorDBCriteria(createCriteria("creada_por"));
	}
	
	public TemaDBCriteria createContieneCriteria() {
		return new TemaDBCriteria(createCriteria("ORM_contiene"));
	}
	
	public SeccionDB uniqueSeccionDB() {
		return (SeccionDB) super.uniqueResult();
	}
	
	public SeccionDB[] listSeccionDB() {
		java.util.List list = super.list();
		return (SeccionDB[]) list.toArray(new SeccionDB[list.size()]);
	}
}

