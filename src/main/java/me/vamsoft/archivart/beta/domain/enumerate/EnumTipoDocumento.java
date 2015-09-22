/**
 * 
 * Author: Sergio García Alonso
 * Date: 22 de sept. de 2015 - 13:37:59
 * Email: sga.vmp@gmail.com
 *
 */
package me.vamsoft.archivart.beta.domain.enumerate;


public enum EnumTipoDocumento {

	TD1("Poder"),TD2("Contrato"),TD3("Inventario"),TD4("Testamento"),TD5("Carta personal"),TD6("Carta pública"),TD7("Carta oficial"),TD8("Otro");
	
	private String value;

    private EnumTipoDocumento(String value) {
            this.value = value;
    }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
