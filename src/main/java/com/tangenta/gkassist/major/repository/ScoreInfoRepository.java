package com.tangenta.gkassist.major.repository;

import com.tangenta.gkassist.common.ddd.Repository;
import com.tangenta.gkassist.major.model.Scoreinfo;
import org.springframework.data.repository.CrudRepository;

public interface ScoreInfoRepository  extends Repository, CrudRepository<Scoreinfo, String> {
}
