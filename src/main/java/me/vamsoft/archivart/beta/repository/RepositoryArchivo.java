/**
 * 
 * Author: Sergio García Alonso
 * Date: 22 de sept. de 2015 - 16:25:47
 * Email: sga.vmp@gmail.com
 *
 */
package me.vamsoft.archivart.beta.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import me.vamsoft.archivart.beta.domain.Archivo;

@RepositoryRestResource(collectionResourceRel = "archivos", path = "archivos")
public interface RepositoryArchivo extends PagingAndSortingRepository<Archivo, String> {

}
