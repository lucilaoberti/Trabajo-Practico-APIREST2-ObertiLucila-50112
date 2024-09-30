package com.example.inicial1.services;

import com.example.inicial1.entities.Base;
import com.example.inicial1.repositories.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() {
        try {
            return baseRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error retrieving all entities: " + e.getMessage(), e);
        }
    }

    @Override
    @Transactional
    public Page<E> findAll(Pageable pageable) {
        try {
            return baseRepository.findAll(pageable);
        } catch (Exception e) {
            throw new RuntimeException("Error retrieving entities with pagination: " + e.getMessage(), e);
        }
    }

    @Override
    @Transactional
    public E findById(ID id) {
        return baseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entity not found with id: " + id));
    }

    @Override
    @Transactional
    public E save(E entity) {
        try {
            return baseRepository.save(entity);
        } catch (Exception e) {
            throw new RuntimeException("Error saving entity: " + e.getMessage(), e);
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) {
        if (!baseRepository.existsById(id)) {
            throw new RuntimeException("Entity not found with id: " + id);
        }
        try {
            return baseRepository.save(entity);
        } catch (Exception e) {
            throw new RuntimeException("Error updating entity: " + e.getMessage(), e);
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) {
        if (!baseRepository.existsById(id)) {
            throw new RuntimeException("Entity not found with id: " + id);
        }
        try {
            baseRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Error deleting entity: " + e.getMessage(), e);
        }
    }
}
