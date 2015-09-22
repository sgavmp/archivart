/**
 * 
 * Author: Sergio García Alonso
 * Date: 22 de sept. de 2015 - 16:24:31
 * Email: sga.vmp@gmail.com
 *
 */
package me.vamsoft.archivart.beta.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import me.vamsoft.archivart.beta.domain.Persona;

@RepositoryRestResource(collectionResourceRel = "personas", path = "personas")
public interface RepositoryPersona extends PagingAndSortingRepository<Persona, String> {

}
