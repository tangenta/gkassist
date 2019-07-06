package com.tangenta.gkassist.major.repository;

import com.tangenta.gkassist.common.ddd.Repository;
import com.tangenta.gkassist.major.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends Repository, CrudRepository<Comment, String> {
}
