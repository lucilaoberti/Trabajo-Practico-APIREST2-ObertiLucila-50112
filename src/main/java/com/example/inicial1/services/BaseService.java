package com.example.inicial1.services;

import com.example.inicial1.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

// Interfaz que define los métodos para operaciones CRUD (Creación, Obtención, Actualización, Eliminación)
public interface BaseService<E extends Base, ID extends Serializable> {
    // Método para obtener una lista de todas las entidades
    List<E> findAll() throws Exception; // Se pueden manejar excepciones específicas según sea necesario

    // Método para obtener una lista de entidades paginadas
    Page<E> findAll(Pageable pageable) throws Exception;

    // Método para obtener una entidad por su ID
    E findById(ID id) throws Exception;

    // Método para guardar una nueva entidad
    E save(E entity) throws Exception;

    // Método para actualizar una entidad existente
    E update(ID id, E entity) throws Exception;

    // Método para eliminar una entidad por su ID
    boolean delete(ID id) throws Exception;
}
