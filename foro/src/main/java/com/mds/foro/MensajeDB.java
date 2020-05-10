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
@Table(name="MensajeDB")
public class MensajeDB implements Serializable {
	public MensajeDB() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MENSAJEDB_CONTIENE_RESPUESTA) {
			return ORM_contiene_respuesta;
		}
		else if (key == ORMConstants.KEY_MENSAJEDB_GUSTADO_POR) {
			return ORM_gustado_por;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MENSAJEDB_CREADO_POR) {
			this.creado_por = (com.mds.foro.Usuario_DB) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJEDB_OCULTADO_POR) {
			this.ocultado_por = (com.mds.foro.AdministradorDB) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJEDB_ESTA_EN) {
			this.esta_en = (com.mds.foro.MensajeDB) owner;
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
	
	@Column(name="IdMensaje", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_MDS_FORO_MENSAJEDB_IDMENSAJE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_MDS_FORO_MENSAJEDB_IDMENSAJE_GENERATOR", strategy="native")	
	private int idMensaje;
	
	@ManyToOne(targetEntity=com.mds.foro.AdministradorDB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorDBUsuario_DBIdUsuario", referencedColumnName="Usuario_DBIdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKMensajeDB160401"))	
	private com.mds.foro.AdministradorDB ocultado_por;
	
	@ManyToOne(targetEntity=com.mds.foro.Usuario_DB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Usuario_DBIdUsuario", referencedColumnName="IdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKMensajeDB218802"))	
	private com.mds.foro.Usuario_DB creado_por;
	
	@ManyToOne(targetEntity=com.mds.foro.MensajeDB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeDBIdMensaje", referencedColumnName="IdMensaje") }, foreignKey=@ForeignKey(name="FKMensajeDB386301"))	
	private com.mds.foro.MensajeDB esta_en;
	
	@Column(name="Mensaje", nullable=true, length=255)	
	private String mensaje;
	
	@Column(name="CantidadLike", nullable=false, length=10)	
	private int cantidadLike;
	
	@Column(name="Eliminado", nullable=false, length=1)	
	private boolean eliminado;
	
	@Column(name="Oculto", nullable=false, length=1)	
	private boolean oculto;
	
	@Column(name="Video", nullable=true, length=255)	
	private String video;
	
	@Column(name="Foto", nullable=true, length=255)	
	private String foto;
	
	@Column(name="Foto2", nullable=true, length=255)	
	private String foto2;
	
	@Column(name="Foto3", nullable=true, length=255)	
	private String foto3;
	
	@OneToMany(mappedBy="esta_en", targetEntity=com.mds.foro.MensajeDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene_respuesta = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_da_megusta", targetEntity=com.mds.foro.Usuario_DB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gustado_por = new java.util.HashSet();
	
	private void setIdMensaje(int value) {
		this.idMensaje = value;
	}
	
	public int getIdMensaje() {
		return idMensaje;
	}
	
	public int getORMID() {
		return getIdMensaje();
	}
	
	public void setMensaje(String value) {
		this.mensaje = value;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setCantidadLike(int value) {
		this.cantidadLike = value;
	}
	
	public int getCantidadLike() {
		return cantidadLike;
	}
	
	public void setEliminado(boolean value) {
		this.eliminado = value;
	}
	
	public boolean getEliminado() {
		return eliminado;
	}
	
	public void setOculto(boolean value) {
		this.oculto = value;
	}
	
	public boolean getOculto() {
		return oculto;
	}
	
	public void setVideo(String value) {
		this.video = value;
	}
	
	public String getVideo() {
		return video;
	}
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFoto2(String value) {
		this.foto2 = value;
	}
	
	public String getFoto2() {
		return foto2;
	}
	
	public void setFoto3(String value) {
		this.foto3 = value;
	}
	
	public String getFoto3() {
		return foto3;
	}
	
	private void setORM_Contiene_respuesta(java.util.Set value) {
		this.ORM_contiene_respuesta = value;
	}
	
	private java.util.Set getORM_Contiene_respuesta() {
		return ORM_contiene_respuesta;
	}
	
	@Transient	
	public final com.mds.foro.MensajeDBSetCollection contiene_respuesta = new com.mds.foro.MensajeDBSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJEDB_CONTIENE_RESPUESTA, ORMConstants.KEY_MENSAJEDB_ESTA_EN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setCreado_por(com.mds.foro.Usuario_DB value) {
		if (creado_por != null) {
			creado_por.crea_mensaje.remove(this);
		}
		if (value != null) {
			value.crea_mensaje.add(this);
		}
	}
	
	public com.mds.foro.Usuario_DB getCreado_por() {
		return creado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Creado_por(com.mds.foro.Usuario_DB value) {
		this.creado_por = value;
	}
	
	private com.mds.foro.Usuario_DB getORM_Creado_por() {
		return creado_por;
	}
	
	public void setOcultado_por(com.mds.foro.AdministradorDB value) {
		if (ocultado_por != null) {
			ocultado_por.oculta_mensaje.remove(this);
		}
		if (value != null) {
			value.oculta_mensaje.add(this);
		}
	}
	
	public com.mds.foro.AdministradorDB getOcultado_por() {
		return ocultado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Ocultado_por(com.mds.foro.AdministradorDB value) {
		this.ocultado_por = value;
	}
	
	private com.mds.foro.AdministradorDB getORM_Ocultado_por() {
		return ocultado_por;
	}
	
	public void setEsta_en(com.mds.foro.MensajeDB value) {
		if (esta_en != null) {
			esta_en.contiene_respuesta.remove(this);
		}
		if (value != null) {
			value.contiene_respuesta.add(this);
		}
	}
	
	public com.mds.foro.MensajeDB getEsta_en() {
		return esta_en;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Esta_en(com.mds.foro.MensajeDB value) {
		this.esta_en = value;
	}
	
	private com.mds.foro.MensajeDB getORM_Esta_en() {
		return esta_en;
	}
	
	private void setORM_Gustado_por(java.util.Set value) {
		this.ORM_gustado_por = value;
	}
	
	private java.util.Set getORM_Gustado_por() {
		return ORM_gustado_por;
	}
	
	@Transient	
	public final com.mds.foro.Usuario_DBSetCollection gustado_por = new com.mds.foro.Usuario_DBSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJEDB_GUSTADO_POR, ORMConstants.KEY_USUARIO_DB_DA_MEGUSTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdMensaje());
	}
	
}
