package com.sh3.java.repo.designpattern.dao.v2;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author MSA
 */

public interface BaseDAO<T extends BaseEntity> {
	Stream<T> getAll() throws Exception;
	
	Optional<T> getById(int id) throws Exception;

	void add(T entity) throws Exception;

	void update(T entity) throws Exception;

	void delete(T entity) throws Exception;
}