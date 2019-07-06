package com.tangenta.gkassist.major.repository;

import com.tangenta.gkassist.common.ddd.Repository;
import com.tangenta.gkassist.major.model.Majorinfo;
import org.springframework.data.repository.CrudRepository;

public interface MajorInfoRepository extends Repository, CrudRepository<Majorinfo, String> {

}

