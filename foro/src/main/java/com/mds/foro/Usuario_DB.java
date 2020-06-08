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
@Table(name="Usuario_DB")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario_DB implements Serializable {
	public Usuario_DB() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_DB_AMIGO) {
			return ORM_amigo;
		}
		else if (key == ORMConstants.KEY_USUARIO_DB_DA_MEGUSTA) {
			return ORM_da_megusta;
		}
		else if (key == ORMConstants.KEY_USUARIO_DB_AMIGO_DE) {
			return ORM_amigo_de;
		}
		else if (key == ORMConstants.KEY_USUARIO_DB_RECIBE) {
			return ORM_recibe;
		}
		else if (key == ORMConstants.KEY_USUARIO_DB_CREA_TEMA) {
			return ORM_crea_tema;
		}
		else if (key == ORMConstants.KEY_USUARIO_DB_CREA_MENSAJE) {
			return ORM_crea_mensaje;
		}
		else if (key == ORMConstants.KEY_USUARIO_DB_DA_MEGUSTA_) {
			return ORM_da_megusta_;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIO_DB_BANEADO_POR) {
			this.baneado_por = (com.mds.foro.AdministradorDB) owner;
		}
		
		else if (key == ORMConstants.KEY_USUARIO_DB_CONVERTIDO_POR) {
			this.convertido_por = (com.mds.foro.AdministradorDB) owner;
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
	
	@Column(name="IdUsuario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_MDS_FORO_USUARIO_DB_IDUSUARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_MDS_FORO_USUARIO_DB_IDUSUARIO_GENERATOR", strategy="native")	
	private int idUsuario;
	
	@ManyToOne(targetEntity=com.mds.foro.AdministradorDB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Convertido_por", referencedColumnName="IdUsuario") }, foreignKey=@ForeignKey(name="FKUsuario_DB613758"))	
	private com.mds.foro.AdministradorDB convertido_por;
	
	@ManyToOne(targetEntity=com.mds.foro.AdministradorDB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Baneado_por", referencedColumnName="IdUsuario") }, foreignKey=@ForeignKey(name="FKUsuario_DB750296"))	
	private com.mds.foro.AdministradorDB baneado_por;
	
	@Column(name="NombreUsuario", nullable=true, length=255)	
	private String nombreUsuario;
	
	@Column(name="NombreCompleto", nullable=true, length=255)	
	private String nombreCompleto;
	
	@Column(name="Correo", nullable=true, length=255)	
	private String correo;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="Foto", nullable=true, length=255)	
	private String foto;
	
	@Column(name="Recibir_notificacion", nullable=false, length=1)	
	private boolean recibir_notificacion;
	
	@Column(name="Recibir_por_correo", nullable=false, length=1)	
	private boolean recibir_por_correo;
	
	@Column(name="Perfil_oculto", nullable=false, length=1)	
	private boolean perfil_oculto;
	
	@Column(name="Permiso", nullable=false, length=10)	
	private int permiso;
	
	@ManyToMany(targetEntity=com.mds.foro.Usuario_DB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_DB_Usuario_DB2", joinColumns={ @JoinColumn(name="Usuario_DBIdUsuario2") }, inverseJoinColumns={ @JoinColumn(name="Usuario_DBIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_amigo = new java.util.HashSet();
	
	@ManyToMany(targetEntity=com.mds.foro.MensajeDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="MensajeDB_Usuario_DB2", joinColumns={ @JoinColumn(name="Usuario_DBIdUsuario") }, inverseJoinColumns={ @JoinColumn(name="MensajeDBIdMensaje") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_da_megusta = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_amigo", targetEntity=com.mds.foro.Usuario_DB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_amigo_de = new java.util.HashSet();
	
	@OneToMany(mappedBy="enviada_por", targetEntity=com.mds.foro.NotificacionDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_recibe = new java.util.HashSet();
	
	@OneToMany(mappedBy="creado_por", targetEntity=com.mds.foro.TemaDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_crea_tema = new java.util.HashSet();
	
	@OneToMany(mappedBy="creado_por", targetEntity=com.mds.foro.MensajeDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_crea_mensaje = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_gustado_por_", targetEntity=com.mds.foro.TemaDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_da_megusta_ = new java.util.HashSet();
	
	private void setIdUsuario(int value) {
		this.idUsuario = value;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public int getORMID() {
		return getIdUsuario();
	}
	
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombreCompleto(String value) {
		this.nombreCompleto = value;
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setRecibir_notificacion(boolean value) {
		this.recibir_notificacion = value;
	}
	
	public boolean getRecibir_notificacion() {
		return recibir_notificacion;
	}
	
	public void setRecibir_por_correo(boolean value) {
		this.recibir_por_correo = value;
	}
	
	public boolean getRecibir_por_correo() {
		return recibir_por_correo;
	}
	
	public void setPerfil_oculto(boolean value) {
		this.perfil_oculto = value;
	}
	
	public boolean getPerfil_oculto() {
		return perfil_oculto;
	}
	
	public void setPermiso(int value) {
		this.permiso = value;
	}
	
	public int getPermiso() {
		return permiso;
	}
	
	private void setORM_Amigo(java.util.Set value) {
		this.ORM_amigo = value;
	}
	
	private java.util.Set getORM_Amigo() {
		return ORM_amigo;
	}
	
	@Transient	
	public final com.mds.foro.Usuario_DBSetCollection amigo = new com.mds.foro.Usuario_DBSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_DB_AMIGO, ORMConstants.KEY_USUARIO_DB_AMIGO_DE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Da_megusta(java.util.Set value) {
		this.ORM_da_megusta = value;
	}
	
	private java.util.Set getORM_Da_megusta() {
		return ORM_da_megusta;
	}
	
	@Transient	
	public final com.mds.foro.MensajeDBSetCollection da_megusta = new com.mds.foro.MensajeDBSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_DB_DA_MEGUSTA, ORMConstants.KEY_MENSAJEDB_GUSTADO_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Amigo_de(java.util.Set value) {
		this.ORM_amigo_de = value;
	}
	
	private java.util.Set getORM_Amigo_de() {
		return ORM_amigo_de;
	}
	
	@Transient	
	public final com.mds.foro.Usuario_DBSetCollection amigo_de = new com.mds.foro.Usuario_DBSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_DB_AMIGO_DE, ORMConstants.KEY_USUARIO_DB_AMIGO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Recibe(java.util.Set value) {
		this.ORM_recibe = value;
	}
	
	private java.util.Set getORM_Recibe() {
		return ORM_recibe;
	}
	
	@Transient	
	public final com.mds.foro.NotificacionDBSetCollection recibe = new com.mds.foro.NotificacionDBSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_DB_RECIBE, ORMConstants.KEY_NOTIFICACIONDB_ENVIADA_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Crea_tema(java.util.Set value) {
		this.ORM_crea_tema = value;
	}
	
	private java.util.Set getORM_Crea_tema() {
		return ORM_crea_tema;
	}
	
	@Transient	
	public final com.mds.foro.TemaDBSetCollection crea_tema = new com.mds.foro.TemaDBSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_DB_CREA_TEMA, ORMConstants.KEY_TEMADB_CREADO_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Crea_mensaje(java.util.Set value) {
		this.ORM_crea_mensaje = value;
	}
	
	private java.util.Set getORM_Crea_mensaje() {
		return ORM_crea_mensaje;
	}
	
	@Transient	
	public final com.mds.foro.MensajeDBSetCollection crea_mensaje = new com.mds.foro.MensajeDBSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_DB_CREA_MENSAJE, ORMConstants.KEY_MENSAJEDB_CREADO_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Da_megusta_(java.util.Set value) {
		this.ORM_da_megusta_ = value;
	}
	
	private java.util.Set getORM_Da_megusta_() {
		return ORM_da_megusta_;
	}
	
	@Transient	
	public final com.mds.foro.TemaDBSetCollection da_megusta_ = new com.mds.foro.TemaDBSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_DB_DA_MEGUSTA_, ORMConstants.KEY_TEMADB_GUSTADO_POR_, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
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
	
	public String toString() {
		return String.valueOf(getIdUsuario());
	}
	
}
