/**
 * 
 * Author: Sergio García Alonso
 * Date: 22 de sept. de 2015 - 15:27:10
 * Email: sga.vmp@gmail.com
 *
 */
package me.vamsoft.archivart.beta.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String apellidos;
	private String nombre;
	private String lugarOrigen;
	private String lugarResidencia;
	private String profesion;
	
	public Persona() {
		super();
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLugarOrigen() {
		return lugarOrigen;
	}
	public void setLugarOrigen(String lugarOrigen) {
		this.lugarOrigen = lugarOrigen;
	}
	public String getLugarResidencia() {
		return lugarResidencia;
	}
	public void setLugarResidencia(String lugarResidencia) {
		this.lugarResidencia = lugarResidencia;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
}
