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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Usuario_registradoDB")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Usuario_registradoDB")
@PrimaryKeyJoinColumn(name="Usuario_DBIdUsuario", referencedColumnName="IdUsuario")
public class Usuario_registradoDB extends com.mds.foro.Usuario_DB implements Serializable {
	public Usuario_registradoDB() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_REGISTRADODB_NOTIFICA) {
			return ORM_notifica;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADODB_REPORTA) {
			return ORM_reporta;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADODB_REPORTADO_POR) {
			return ORM_reportado_por;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIO_REGISTRADODB_CONVERTIDO_POR) {
			this.convertido_por = (com.mds.foro.AdministradorDB) owner;
		}
		
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADODB_BANEADO_POR) {
			this.baneado_por = (com.mds.foro.AdministradorDB) owner;
		}
		
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADODB_NOTIFICADO_POR_MODERADOR) {
			this.notificado_por_Moderador = (com.mds.foro.Usuario_registradoDB) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="UsuarioModerador", nullable=false, length=1)	
	private boolean usuarioModerador;
	
	@Column(name="UsuarioBaneado", nullable=false, length=1)	
	private boolean usuarioBaneado;
	
	@ManyToMany(targetEntity=com.mds.foro.Usuario_registradoDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_registradoDB_Usuario_registradoDB", joinColumns={ @JoinColumn(name="Usuario_registradoDBUsuario_DBIdUsuario2") }, inverseJoinColumns={ @JoinColumn(name="Usuario_registradoDBUsuario_DBIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reporta = new java.util.HashSet();
	
	@ManyToOne(targetEntity=com.mds.foro.AdministradorDB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorDBUsuario_DBIdUsuario2", referencedColumnName="Usuario_DBIdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKUsuario_re761079"))	
	private com.mds.foro.AdministradorDB baneado_por;
	
	@ManyToOne(targetEntity=com.mds.foro.AdministradorDB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorDBUsuario_DBIdUsuario", referencedColumnName="Usuario_DBIdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKUsuario_re102833"))	
	private com.mds.foro.AdministradorDB convertido_por;
	
	@OneToMany(mappedBy="notificado_por_Moderador", targetEntity=com.mds.foro.Usuario_registradoDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_notifica = new java.util.HashSet();
	
	@ManyToOne(targetEntity=com.mds.foro.Usuario_registradoDB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Usuario_registradoDBUsuario_DBIdUsuario", referencedColumnName="Usuario_DBIdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKUsuario_re942948"))	
	private com.mds.foro.Usuario_registradoDB notificado_por_Moderador;
	
	@ManyToMany(mappedBy="ORM_reporta", targetEntity=com.mds.foro.Usuario_registradoDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reportado_por = new java.util.HashSet();
	
	public void setUsuarioModerador(boolean value) {
		this.usuarioModerador = value;
	}
	
	public boolean getUsuarioModerador() {
		return usuarioModerador;
	}
	
	public void setUsuarioBaneado(boolean value) {
		this.usuarioBaneado = value;
	}
	
	public boolean getUsuarioBaneado() {
		return usuarioBaneado;
	}
	
	private void setORM_Notifica(java.util.Set value) {
		this.ORM_notifica = value;
	}
	
	private java.util.Set getORM_Notifica() {
		return ORM_notifica;
	}
	
	@Transient	
	public final com.mds.foro.Usuario_registradoDBSetCollection notifica = new com.mds.foro.Usuario_registradoDBSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADODB_NOTIFICA, ORMConstants.KEY_USUARIO_REGISTRADODB_NOTIFICADO_POR_MODERADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Reporta(java.util.Set value) {
		this.ORM_reporta = value;
	}
	
	private java.util.Set getORM_Reporta() {
		return ORM_reporta;
	}
	
	@Transient	
	public final com.mds.foro.Usuario_registradoDBSetCollection reporta = new com.mds.foro.Usuario_registradoDBSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADODB_REPORTA, ORMConstants.KEY_USUARIO_REGISTRADODB_REPORTADO_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setConvertido_por(com.mds.foro.AdministradorDB value) {
		if (convertido_por != null) {
			convertido_por.convierte_en_moderador.remove(this);
		}
		if (value != null) {
			value.convierte_en_moderador.add(this);
		}
	}
	
	public com.mds.foro.AdministradorDB getConvertido_por() {
		return convertido_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Convertido_por(com.mds.foro.AdministradorDB value) {
		this.convertido_por = value;
	}
	
	private com.mds.foro.AdministradorDB getORM_Convertido_por() {
		return convertido_por;
	}
	
	public void setBaneado_por(com.mds.foro.AdministradorDB value) {
		if (baneado_por != null) {
			baneado_por.banea.remove(this);
		}
		if (value != null) {
			value.banea.add(this);
		}
	}
	
	public com.mds.foro.AdministradorDB getBaneado_por() {
		return baneado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Baneado_por(com.mds.foro.AdministradorDB value) {
		this.baneado_por = value;
	}
	
	private com.mds.foro.AdministradorDB getORM_Baneado_por() {
		return baneado_por;
	}
	
	public void setNotificado_por_Moderador(com.mds.foro.Usuario_registradoDB value) {
		if (notificado_por_Moderador != null) {
			notificado_por_Moderador.notifica.remove(this);
		}
		if (value != null) {
			value.notifica.add(this);
		}
	}
	
	public com.mds.foro.Usuario_registradoDB getNotificado_por_Moderador() {
		return notificado_por_Moderador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Notificado_por_Moderador(com.mds.foro.Usuario_registradoDB value) {
		this.notificado_por_Moderador = value;
	}
	
	private com.mds.foro.Usuario_registradoDB getORM_Notificado_por_Moderador() {
		return notificado_por_Moderador;
	}
	
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
