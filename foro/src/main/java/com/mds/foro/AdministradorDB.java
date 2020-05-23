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
@Table(name="AdministradorDB")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("AdministradorDB")
@PrimaryKeyJoinColumn(name="IdUsuario", referencedColumnName="IdUsuario")
public class AdministradorDB extends com.mds.foro.Usuario_DB implements Serializable {
	public AdministradorDB() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMINISTRADORDB_CONVIERTE_EN_MODERADOR) {
			return ORM_convierte_en_moderador;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADORDB_BANEA) {
			return ORM_banea;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADORDB_CREA_SECCION) {
			return ORM_crea_seccion;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADORDB_BANEAN) {
			return ORM_baneaN;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADORDB_OCULTA_TEMA) {
			return ORM_oculta_tema;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADORDB_OCULTA_MENSAJE) {
			return ORM_oculta_mensaje;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="convertido_por", targetEntity=com.mds.foro.Usuario_DB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_convierte_en_moderador = new java.util.HashSet();
	
	@OneToMany(mappedBy="baneado_por", targetEntity=com.mds.foro.Usuario_DB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_banea = new java.util.HashSet();
	
	@OneToMany(mappedBy="creada_por", targetEntity=com.mds.foro.SeccionDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_crea_seccion = new java.util.HashSet();
	
	@OneToMany(mappedBy="baneado_porN", targetEntity=com.mds.foro.Usuario_notificadosDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_baneaN = new java.util.HashSet();
	
	@OneToMany(mappedBy="ocultado_por", targetEntity=com.mds.foro.TemaDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_oculta_tema = new java.util.HashSet();
	
	@OneToMany(mappedBy="ocultado_por", targetEntity=com.mds.foro.MensajeDB.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_oculta_mensaje = new java.util.HashSet();
	
	private void setORM_Convierte_en_moderador(java.util.Set value) {
		this.ORM_convierte_en_moderador = value;
	}
	
	private java.util.Set getORM_Convierte_en_moderador() {
		return ORM_convierte_en_moderador;
	}
	
	@Transient	
	public final com.mds.foro.Usuario_DBSetCollection convierte_en_moderador = new com.mds.foro.Usuario_DBSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADORDB_CONVIERTE_EN_MODERADOR, ORMConstants.KEY_USUARIO_DB_CONVERTIDO_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Banea(java.util.Set value) {
		this.ORM_banea = value;
	}
	
	private java.util.Set getORM_Banea() {
		return ORM_banea;
	}
	
	@Transient	
	public final com.mds.foro.Usuario_DBSetCollection banea = new com.mds.foro.Usuario_DBSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADORDB_BANEA, ORMConstants.KEY_USUARIO_DB_BANEADO_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Crea_seccion(java.util.Set value) {
		this.ORM_crea_seccion = value;
	}
	
	private java.util.Set getORM_Crea_seccion() {
		return ORM_crea_seccion;
	}
	
	@Transient	
	public final com.mds.foro.SeccionDBSetCollection crea_seccion = new com.mds.foro.SeccionDBSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADORDB_CREA_SECCION, ORMConstants.KEY_SECCIONDB_CREADA_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_BaneaN(java.util.Set value) {
		this.ORM_baneaN = value;
	}
	
	private java.util.Set getORM_BaneaN() {
		return ORM_baneaN;
	}
	
	@Transient	
	public final com.mds.foro.Usuario_notificadosDBSetCollection baneaN = new com.mds.foro.Usuario_notificadosDBSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADORDB_BANEAN, ORMConstants.KEY_USUARIO_NOTIFICADOSDB_BANEADO_PORN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Oculta_tema(java.util.Set value) {
		this.ORM_oculta_tema = value;
	}
	
	private java.util.Set getORM_Oculta_tema() {
		return ORM_oculta_tema;
	}
	
	@Transient	
	public final com.mds.foro.TemaDBSetCollection oculta_tema = new com.mds.foro.TemaDBSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADORDB_OCULTA_TEMA, ORMConstants.KEY_TEMADB_OCULTADO_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Oculta_mensaje(java.util.Set value) {
		this.ORM_oculta_mensaje = value;
	}
	
	private java.util.Set getORM_Oculta_mensaje() {
		return ORM_oculta_mensaje;
	}
	
	@Transient	
	public final com.mds.foro.MensajeDBSetCollection oculta_mensaje = new com.mds.foro.MensajeDBSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADORDB_OCULTA_MENSAJE, ORMConstants.KEY_MENSAJEDB_OCULTADO_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
