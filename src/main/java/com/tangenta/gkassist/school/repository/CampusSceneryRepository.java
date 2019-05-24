package com.tangenta.gkassist.school.repository;

import com.tangenta.gkassist.common.ddd.Repository;
import com.tangenta.gkassist.school.model.CampusScenery;
import com.tangenta.gkassist.school.model.SchoolId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CampusSceneryRepository extends Repository, CrudRepository<CampusScenery, Integer> {
    List<CampusScenery> findAllBySchoolId(SchoolId schoolId);
}
