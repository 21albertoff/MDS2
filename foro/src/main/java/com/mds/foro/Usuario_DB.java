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
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdUsuario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_MDS_FORO_USUARIO_DB_IDUSUARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_MDS_FORO_USUARIO_DB_IDUSUARIO_GENERATOR", strategy="native")	
	private int idUsuario;
	
	@Column(name="NombreUsuario", nullable=true, length=255)	
	private String nombreUsuario;
	
	@Column(name="NombreCompleto", nullable=true, length=255)	
	private String nombreCompleto;
	
	@Column(name="Correo", nullable=true, length=255)	
	private String correo;
	
	@Column(name="Contraseña", nullable=true, length=255)	
	private String contraseña;
	
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
	
	@ManyToMany(targetEntity=com.mds.foro.Usuario_DB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_DB_Usuario_DB", joinColumns={ @JoinColumn(name="Usuario_DBIdUsuario2") }, inverseJoinColumns={ @JoinColumn(name="Usuario_DBIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_amigo = new java.util.HashSet();
	
	@ManyToMany(targetEntity=com.mds.foro.MensajeDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="MensajeDB_Usuario_DB", joinColumns={ @JoinColumn(name="Usuario_DBIdUsuario") }, inverseJoinColumns={ @JoinColumn(name="MensajeDBIdMensaje") })	
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
	
	public void setContraseña(String value) {
		this.contraseña = value;
	}
	
	public String getContraseña() {
		return contraseña;
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
	
	public String toString() {
		return String.valueOf(getIdUsuario());
	}
	
}
