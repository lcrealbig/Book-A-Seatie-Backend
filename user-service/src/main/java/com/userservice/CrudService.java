package com.userservice;

import com.userservice.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.persistence.EntityManager;

@Service
public class CrudService {

    @PersistenceContext
    EntityManager em;
    @Transactional
    public ResponseEntity createEmployee(Employee employee) {
        em.persist(employee);
        return ResponseEntity.ok().body(employee);
    }

    @Transactional
    public void getStatus(){
        CrudService crudService = new CrudService();
        crudService.getStatus();
    }


}
