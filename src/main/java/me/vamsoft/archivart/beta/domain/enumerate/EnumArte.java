/**
 * 
 * Author: Sergio García Alonso
 * Date: 22 de sept. de 2015 - 15:30:36
 * Email: sga.vmp@gmail.com
 *
 */
package me.vamsoft.archivart.beta.domain.enumerate;

public enum EnumArte {
	
	A1("Pintura"),A2("Escultura"),A3("Arquitectura"),A4("Arte Efímero"),A5("Orfebrería");
	
	private String value;

    private EnumArte(String value) {
            this.value = value;
    }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
