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
@Table(name="SeccionDB")
public class SeccionDB implements Serializable {
	public SeccionDB() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SECCIONDB_CONTIENE) {
			return ORM_contiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SECCIONDB_CREADA_POR) {
			this.creada_por = (com.mds.foro.AdministradorDB) owner;
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
	
	@Column(name="IdSeccion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_MDS_FORO_SECCIONDB_IDSECCION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_MDS_FORO_SECCIONDB_IDSECCION_GENERATOR", strategy="native")	
	private int idSeccion;
	
	@ManyToOne(targetEntity=com.mds.foro.AdministradorDB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Creado_poir", referencedColumnName="IdUsuario") }, foreignKey=@ForeignKey(name="FKSeccionDB313182"))	
	private com.mds.foro.AdministradorDB creada_por;
	
	@Column(name="Seccion", nullable=true, length=255)	
	private String seccion;
	
	@Column(name="Icono", nullable=true, length=255)	
	private String icono;
	
	@Column(name="SeccionFija", nullable=false, length=1)	
	private boolean seccionFija;
	
	@Column(name="Eliminado", nullable=false, length=1)	
	private boolean eliminado;
	
	@OneToMany(mappedBy="esta_en", targetEntity=com.mds.foro.TemaDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	private void setIdSeccion(int value) {
		this.idSeccion = value;
	}
	
	public int getIdSeccion() {
		return idSeccion;
	}
	
	public int getORMID() {
		return getIdSeccion();
	}
	
	public void setSeccion(String value) {
		this.seccion = value;
	}
	
	public String getSeccion() {
		return seccion;
	}
	
	public void setIcono(String value) {
		this.icono = value;
	}
	
	public String getIcono() {
		return icono;
	}
	
	public void setSeccionFija(boolean value) {
		this.seccionFija = value;
	}
	
	public boolean getSeccionFija() {
		return seccionFija;
	}
	
	public void setEliminado(boolean value) {
		this.eliminado = value;
	}
	
	public boolean getEliminado() {
		return eliminado;
	}
	
	public void setCreada_por(com.mds.foro.AdministradorDB value) {
		if (creada_por != null) {
			creada_por.crea_seccion.remove(this);
		}
		if (value != null) {
			value.crea_seccion.add(this);
		}
	}
	
	public com.mds.foro.AdministradorDB getCreada_por() {
		return creada_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Creada_por(com.mds.foro.AdministradorDB value) {
		this.creada_por = value;
	}
	
	private com.mds.foro.AdministradorDB getORM_Creada_por() {
		return creada_por;
	}
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	@Transient	
	public final com.mds.foro.TemaDBSetCollection contiene = new com.mds.foro.TemaDBSetCollection(this, _ormAdapter, ORMConstants.KEY_SECCIONDB_CONTIENE, ORMConstants.KEY_TEMADB_ESTA_EN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdSeccion());
	}
	
}
