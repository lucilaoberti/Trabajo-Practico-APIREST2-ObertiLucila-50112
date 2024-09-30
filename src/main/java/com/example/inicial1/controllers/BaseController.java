package com.example.inicial1.controllers;

import com.example.inicial1.entities.Base;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.Serializable;

public interface BaseController <E extends Base,ID extends Serializable>{
    // Cualquier tipo que extends de object <?>
    public ResponseEntity<?> getAll(); // retornan un tipo response entity no recibe ningun parametro
    public ResponseEntity<?> getAll(Pageable pegeable) ;
    public ResponseEntity<?> getOne(@PathVariable ID id); //  recibe una varible tipo id
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@PathVariable ID id , @RequestBody E entity);
    public ResponseEntity<?> delete(@PathVariable ID id);


}
