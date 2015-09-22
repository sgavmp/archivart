/**
 * 
 * Author: Sergio García Alonso
 * Date: 22 de sept. de 2015 - 13:39:15
 * Email: sga.vmp@gmail.com
 *
 */
package me.vamsoft.archivart.beta.domain.enumerate;

public enum EnumGenero {

	G1("Arte"),G2("Cultura"),G3("Economía"),G4("Política"),G5("Otros");
	
	private String value;

    private EnumGenero(String value) {
            this.value = value;
    }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
