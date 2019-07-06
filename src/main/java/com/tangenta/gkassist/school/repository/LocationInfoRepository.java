package com.tangenta.gkassist.school.repository;

import com.tangenta.gkassist.common.ddd.Repository;
import com.tangenta.gkassist.school.model.LocationInfo;
import com.tangenta.gkassist.school.model.SchoolId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationInfoRepository extends Repository, CrudRepository<LocationInfo, Long> {
    List<LocationInfo> findLocationInfosBySchoolId(SchoolId schoolId);
}
