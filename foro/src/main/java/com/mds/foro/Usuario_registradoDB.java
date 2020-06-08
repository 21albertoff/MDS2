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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Usuario_registradoDB")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Usuario_registradoDB")
@PrimaryKeyJoinColumn(name="IdUsuario", referencedColumnName="IdUsuario")
public class Usuario_registradoDB extends com.mds.foro.Usuario_DB implements Serializable {
	public Usuario_registradoDB() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_REGISTRADODB_REPORTA) {
			return ORM_reporta;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADODB_REPORTADO_POR) {
			return ORM_reportado_por;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Motivo", nullable=false, length=255)	
	private String motivo;
	
	@Column(name="Baneado", nullable=false, length=1)	
	private boolean baneado;
	
	@ManyToMany(targetEntity=com.mds.foro.Usuario_registradoDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_registradoDB_Usuario_registradoDB2", joinColumns={ @JoinColumn(name="Usuario_registradoDBUsuario_DBIdUsuario2") }, inverseJoinColumns={ @JoinColumn(name="Usuario_registradoDBUsuario_DBIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reporta = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_reporta", targetEntity=com.mds.foro.Usuario_registradoDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reportado_por = new java.util.HashSet();
	
	public void setMotivo(String value) {
		this.motivo = value;
	}
	
	public String getMotivo() {
		return motivo;
	}
	
	public void setBaneado(boolean value) {
		this.baneado = value;
	}
	
	public boolean getBaneado() {
		return baneado;
	}
	
	private void setORM_Reporta(java.util.Set value) {
		this.ORM_reporta = value;
	}
	
	private java.util.Set getORM_Reporta() {
		return ORM_reporta;
	}
	
	@Transient	
	public final com.mds.foro.Usuario_registradoDBSetCollection reporta = new com.mds.foro.Usuario_registradoDBSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADODB_REPORTA, ORMConstants.KEY_USUARIO_REGISTRADODB_REPORTADO_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Reportado_por(java.util.Set value) {
		this.ORM_reportado_por = value;
	}
	
	private java.util.Set getORM_Reportado_por() {
		return ORM_reportado_por;
	}
	
	@Transient	
	public final com.mds.foro.Usuario_registradoDBSetCollection reportado_por = new com.mds.foro.Usuario_registradoDBSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADODB_REPORTADO_POR, ORMConstants.KEY_USUARIO_REGISTRADODB_REPORTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
