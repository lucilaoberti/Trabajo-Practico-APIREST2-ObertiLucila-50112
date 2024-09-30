package com.example.inicial1.services;


import com.example.inicial1.entities.Domicilio;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.DomicilioRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long>{
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
