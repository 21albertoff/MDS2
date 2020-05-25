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
@Table(name="TemaDB")
public class TemaDB implements Serializable {
	public TemaDB() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TEMADB_GUSTADO_POR_) {
			return ORM_gustado_por_;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TEMADB_CREADO_POR) {
			this.creado_por = (com.mds.foro.Usuario_DB) owner;
		}
		
		else if (key == ORMConstants.KEY_TEMADB_ESTA_EN) {
			this.esta_en = (com.mds.foro.SeccionDB) owner;
		}
		
		else if (key == ORMConstants.KEY_TEMADB_OCULTADO_POR) {
			this.ocultado_por = (com.mds.foro.AdministradorDB) owner;
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
	
	@Column(name="IdTema", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_MDS_FORO_TEMADB_IDTEMA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_MDS_FORO_TEMADB_IDTEMA_GENERATOR", strategy="native")	
	private int idTema;
	
	@ManyToOne(targetEntity=com.mds.foro.AdministradorDB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Ocultado_por", referencedColumnName="IdUsuario") }, foreignKey=@ForeignKey(name="FKTemaDB355008"))	
	private com.mds.foro.AdministradorDB ocultado_por;
	
	@ManyToOne(targetEntity=com.mds.foro.Usuario_DB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Creado_por", referencedColumnName="IdUsuario") }, foreignKey=@ForeignKey(name="FKTemaDB48119"))	
	private com.mds.foro.Usuario_DB creado_por;
	
	@ManyToOne(targetEntity=com.mds.foro.SeccionDB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Esta_en", referencedColumnName="IdSeccion") }, foreignKey=@ForeignKey(name="FKTemaDB646077"))	
	private com.mds.foro.SeccionDB esta_en;
	
	@Column(name="Tema", nullable=true, length=255)	
	private String tema;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="CantidadLike", nullable=false, length=10)	
	private int cantidadLike;
	
	@Column(name="Eliminado", nullable=false, length=1)	
	private boolean eliminado;
	
	@Column(name="Oculto", nullable=false, length=1)	
	private boolean oculto;
	
	@ManyToMany(targetEntity=com.mds.foro.Usuario_DB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_DB_TemaDB", joinColumns={ @JoinColumn(name="TemaDBIdTema") }, inverseJoinColumns={ @JoinColumn(name="Usuario_DBIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gustado_por_ = new java.util.HashSet();
	
	private void setIdTema(int value) {
		this.idTema = value;
	}
	
	public int getIdTema() {
		return idTema;
	}
	
	public int getORMID() {
		return getIdTema();
	}
	
	public void setTema(String value) {
		this.tema = value;
	}
	
	public String getTema() {
		return tema;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
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
	
	public void setCreado_por(com.mds.foro.Usuario_DB value) {
		if (creado_por != null) {
			creado_por.crea_tema.remove(this);
		}
		if (value != null) {
			value.crea_tema.add(this);
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
	
	public void setEsta_en(com.mds.foro.SeccionDB value) {
		if (esta_en != null) {
			esta_en.contiene.remove(this);
		}
		if (value != null) {
			value.contiene.add(this);
		}
	}
	
	public com.mds.foro.SeccionDB getEsta_en() {
		return esta_en;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Esta_en(com.mds.foro.SeccionDB value) {
		this.esta_en = value;
	}
	
	private com.mds.foro.SeccionDB getORM_Esta_en() {
		return esta_en;
	}
	
	public void setOcultado_por(com.mds.foro.AdministradorDB value) {
		if (ocultado_por != null) {
			ocultado_por.oculta_tema.remove(this);
		}
		if (value != null) {
			value.oculta_tema.add(this);
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
	
	private void setORM_Gustado_por_(java.util.Set value) {
		this.ORM_gustado_por_ = value;
	}
	
	private java.util.Set getORM_Gustado_por_() {
		return ORM_gustado_por_;
	}
	
	@Transient	
	public final com.mds.foro.Usuario_DBSetCollection gustado_por_ = new com.mds.foro.Usuario_DBSetCollection(this, _ormAdapter, ORMConstants.KEY_TEMADB_GUSTADO_POR_, ORMConstants.KEY_USUARIO_DB_DA_MEGUSTA_, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdTema());
	}
	
}
