/**
 * 
 * Author: Sergio García Alonso
 * Date: 22 de sept. de 2015 - 15:24:12
 * Email: sga.vmp@gmail.com
 *
 */
package me.vamsoft.archivart.beta.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import me.vamsoft.archivart.beta.domain.enumerate.EnumArte;
import me.vamsoft.archivart.beta.domain.enumerate.EnumGenero;
import me.vamsoft.archivart.beta.domain.enumerate.EnumTipoDocumento;
import me.vamsoft.archivart.beta.domain.enumerate.EnumTranscrito;

@Entity
public class Archivo {
	
	private String nombre;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String numReferencia;//Automatico
	@CreatedDate
	private Date fechaInventario;//Automatico
	private String referencia;
	private String pagina;
	private String notario;
	private Date fecha;
	private EnumTipoDocumento tipoDocumento;
	@ManyToOne
	private Persona firmante;
	@ManyToOne
	private Persona receptor;
	private boolean receptorAusente;
	private String accion;
	@Embedded
	private List<String> testigos;
	@Embedded
	private List<String> otrasPersonas;
	private EnumArte arte;
	private String destinoObra;
	private Date fechaLimite;
	private String observaciones;
	private EnumGenero genero;
	private EnumTranscrito transcrito;
	private String idioma;
	
	public Archivo() {
		super();
		this.testigos = new ArrayList<String>();
		this.otrasPersonas = new ArrayList<String>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumReferencia() {
		return numReferencia;
	}
	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}
	public Date getFechaInventario() {
		return fechaInventario;
	}
	public void setFechaInventario(Date fechaInventario) {
		this.fechaInventario = fechaInventario;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getPagina() {
		return pagina;
	}
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	public String getNotario() {
		return notario;
	}
	public void setNotario(String notario) {
		this.notario = notario;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public EnumTipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(EnumTipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Persona getFirmante() {
		return firmante;
	}
	public void setFirmante(Persona firmante) {
		this.firmante = firmante;
	}
	public Persona getReceptor() {
		return receptor;
	}
	public void setReceptor(Persona receptor) {
		this.receptor = receptor;
	}
	public boolean isReceptorAusente() {
		return receptorAusente;
	}
	public void setReceptorAusente(boolean receptorAusente) {
		this.receptorAusente = receptorAusente;
	}
	public String getAccion() {
		return accion;
	}
	public void setAccion(String accion) {
		this.accion = accion;
	}
	public List<String> getTestigos() {
		return testigos;
	}
	public void setTestigos(List<String> testigos) {
		this.testigos = testigos;
	}
	public List<String> getOtrasPersonas() {
		return otrasPersonas;
	}
	public void setOtrasPersonas(List<String> otrasPersonas) {
		this.otrasPersonas = otrasPersonas;
	}
	public EnumArte getArte() {
		return arte;
	}
	public void setArte(EnumArte arte) {
		this.arte = arte;
	}
	public String getDestinoObra() {
		return destinoObra;
	}
	public void setDestinoObra(String destinoObra) {
		this.destinoObra = destinoObra;
	}
	public Date getFechaLimite() {
		return fechaLimite;
	}
	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public EnumGenero getGenero() {
		return genero;
	}
	public void setGenero(EnumGenero genero) {
		this.genero = genero;
	}
	public EnumTranscrito getTranscrito() {
		return transcrito;
	}
	public void setTranscrito(EnumTranscrito transcrito) {
		this.transcrito = transcrito;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}
