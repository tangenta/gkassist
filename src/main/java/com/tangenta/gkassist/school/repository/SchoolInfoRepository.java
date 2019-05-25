package com.tangenta.gkassist.school.repository;

import com.tangenta.gkassist.common.ddd.Repository;
import com.tangenta.gkassist.school.model.SchoolId;
import com.tangenta.gkassist.school.model.SchoolInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SchoolInfoRepository extends Repository, CrudRepository<SchoolInfo, String> { }
