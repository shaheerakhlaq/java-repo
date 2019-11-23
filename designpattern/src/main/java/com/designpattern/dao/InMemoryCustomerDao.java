package com.designpattern.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author MSA
 */

public class InMemoryCustomerDao implements CustomerDao {
	private Map<Integer, Customer> idToCustomer = new HashMap<>();

	public Stream<Customer> getAll() {
		return idToCustomer.values().stream();
	}

	public Optional<Customer> getById(final int id) {
		return Optional.ofNullable(idToCustomer.get(id));
	}

	public boolean add(final Customer customer) {
		if (getById(customer.getId()).isPresent()) {
			return false;
		}

		idToCustomer.put(customer.getId(), customer);
		return true;
	}
	
	public boolean update(final Customer customer) {
		return idToCustomer.replace(customer.getId(), customer) != null;
	}

	public boolean delete(final Customer customer) {
		return idToCustomer.remove(customer.getId()) != null;
	}
}