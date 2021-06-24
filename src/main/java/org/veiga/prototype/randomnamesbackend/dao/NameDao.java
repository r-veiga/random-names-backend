package org.veiga.prototype.randomnamesbackend.dao;

import org.springframework.stereotype.Component;
import org.veiga.prototype.randomnamesbackend.exception.EmptyNamesException;
import org.veiga.prototype.randomnamesbackend.model.Name;

import java.util.List;

public interface NameDao {
	String getRandomName();
	void insertNames(List<Name> names);
	void insertName(Name newName);
}
