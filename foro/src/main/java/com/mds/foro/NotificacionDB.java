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
@Table(name="NotificacionDB")
public class NotificacionDB implements Serializable {
	public NotificacionDB() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_NOTIFICACIONDB_ENVIADA_POR) {
			this.enviada_por = (com.mds.foro.Usuario_DB) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdNotificacion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_MDS_FORO_NOTIFICACIONDB_IDNOTIFICACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_MDS_FORO_NOTIFICACIONDB_IDNOTIFICACION_GENERATOR", strategy="native")	
	private int idNotificacion;
	
	@ManyToOne(targetEntity=com.mds.foro.Usuario_DB.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Usuario_DBIdUsuario", referencedColumnName="IdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKNotificaci133591"))	
	private com.mds.foro.Usuario_DB enviada_por;
	
	@Column(name="MensajeNotif", nullable=true, length=255)	
	private String mensajeNotif;
	
	private void setIdNotificacion(int value) {
		this.idNotificacion = value;
	}
	
	public int getIdNotificacion() {
		return idNotificacion;
	}
	
	public int getORMID() {
		return getIdNotificacion();
	}
	
	public void setMensajeNotif(String value) {
		this.mensajeNotif = value;
	}
	
	public String getMensajeNotif() {
		return mensajeNotif;
	}
	
	public void setEnviada_por(com.mds.foro.Usuario_DB value) {
		if (enviada_por != null) {
			enviada_por.recibe.remove(this);
		}
		if (value != null) {
			value.recibe.add(this);
		}
	}
	
	public com.mds.foro.Usuario_DB getEnviada_por() {
		return enviada_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Enviada_por(com.mds.foro.Usuario_DB value) {
		this.enviada_por = value;
	}
	
	private com.mds.foro.Usuario_DB getORM_Enviada_por() {
		return enviada_por;
	}
	
	public String toString() {
		return String.valueOf(getIdNotificacion());
	}
	
}
