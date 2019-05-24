package com.tangenta.gkassist.school.repository;

import com.tangenta.gkassist.common.ddd.Repository;
import com.tangenta.gkassist.school.model.SchoolBadge;
import com.tangenta.gkassist.school.model.SchoolId;
import org.springframework.data.repository.CrudRepository;

public interface SchoolBadgeRepository extends Repository, CrudRepository<SchoolBadge, String> {

}
