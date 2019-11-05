package com.ajr.repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.ajr.model.Contato;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author root
 */
public interface ContatoRepository extends CrudRepository<Contato, Integer> {
    
}



