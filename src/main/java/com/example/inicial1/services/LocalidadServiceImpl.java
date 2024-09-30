package com.example.inicial1.services;

import com.example.inicial1.entities.Localidad;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.LocalidadRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long>{

    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}


