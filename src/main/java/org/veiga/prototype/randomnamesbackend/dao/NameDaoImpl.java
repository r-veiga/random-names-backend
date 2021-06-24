package org.veiga.prototype.randomnamesbackend.dao;

import org.springframework.stereotype.Component;
import org.veiga.prototype.randomnamesbackend.model.Name;
import org.veiga.prototype.randomnamesbackend.repo.NameRepo;

import java.util.List;

@Component
public class NameDaoImpl implements NameDao {

	private NameRepo repo;

	NameDaoImpl(NameRepo repo) {
		this.repo = repo;
	}

	@Override public String getRandomName() {
		int size = repo.getNames().size();
		if (size == 0) {
			return "***** There are no names *****";
		}
		int index = (int) (Math.random() * size);
		return repo.getNames().get(index).getName();
	}

	@Override public void insertNames(List<Name> names) {
		repo.getNames().addAll(names);
	}

	@Override public void insertName(Name newName) {
		repo.getNames().add(newName);
	}

}
