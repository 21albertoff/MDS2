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
@Table(name="Usuario_notificadosDB")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Usuario_notificadosDB")
@PrimaryKeyJoinColumn(name="IdUsuario", referencedColumnName="IdUsuario")
public class Usuario_notificadosDB extends com.mds.foro.Usuario_DB implements Serializable {
	public Usuario_notificadosDB() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIO_NOTIFICADOSDB_BANEADO_PORN) {
			this.baneado_porN = (com.mds.foro.AdministradorDB) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Motivo", nullable=true, length=255)	
	private String motivo;
	
	@ManyToOne(targetEntity=com.mds.foro.AdministradorDB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="notificadoPor", referencedColumnName="IdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKUsuario_no848103"))	
	private com.mds.foro.AdministradorDB baneado_porN;
	
	public void setMotivo(String value) {
		this.motivo = value;
	}
	
	public String getMotivo() {
		return motivo;
	}
	
	public void setBaneado_porN(com.mds.foro.AdministradorDB value) {
		if (baneado_porN != null) {
			baneado_porN.baneaN.remove(this);
		}
		if (value != null) {
			value.baneaN.add(this);
		}
	}
	
	public com.mds.foro.AdministradorDB getBaneado_porN() {
		return baneado_porN;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Baneado_porN(com.mds.foro.AdministradorDB value) {
		this.baneado_porN = value;
	}
	
	private com.mds.foro.AdministradorDB getORM_Baneado_porN() {
		return baneado_porN;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
