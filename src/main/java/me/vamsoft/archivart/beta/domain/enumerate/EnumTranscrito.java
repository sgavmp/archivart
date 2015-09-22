/**
 * 
 * Author: Sergio García Alonso
 * Date: 22 de sept. de 2015 - 13:39:34
 * Email: sga.vmp@gmail.com
 *
 */
package me.vamsoft.archivart.beta.domain.enumerate;

public enum EnumTranscrito {
	
	T1("Si"),T2("No"),T3("Parcialmente");
	
	private String value;

    private EnumTranscrito(String value) {
            this.value = value;
    }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
