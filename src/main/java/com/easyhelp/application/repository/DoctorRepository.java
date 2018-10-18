package com.easyhelp.application.repository;

import com.easyhelp.application.model.users.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
