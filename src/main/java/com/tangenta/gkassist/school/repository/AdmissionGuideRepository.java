package com.tangenta.gkassist.school.repository;

import com.tangenta.gkassist.common.ddd.Repository;
import com.tangenta.gkassist.school.model.AdmissionGuide;
import com.tangenta.gkassist.school.model.SchoolId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdmissionGuideRepository extends Repository, CrudRepository<AdmissionGuide, Integer> {
    List<AdmissionGuide> findAllBySchoolId(SchoolId schoolId);
}
