/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajr.repository;

import com.ajr.model.Curriculo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author root
 */
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface CurriculoRepository extends CrudRepository<Curriculo, Integer> {

}
