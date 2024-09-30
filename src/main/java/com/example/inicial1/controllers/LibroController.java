package com.example.inicial1.controllers;


import com.example.inicial1.entities.Base;
import com.example.inicial1.entities.Libro;
import com.example.inicial1.services.LibroServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping(path="api/v1/libro")
public class LibroController extends BaseControllerImpl<Libro,LibroServiceImpl> {

}
