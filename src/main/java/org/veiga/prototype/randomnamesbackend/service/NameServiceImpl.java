package org.veiga.prototype.randomnamesbackend.service;

import org.springframework.stereotype.Service;
import org.veiga.prototype.randomnamesbackend.dao.NameDao;
import org.veiga.prototype.randomnamesbackend.model.Name;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NameServiceImpl implements NameService {

	private final NameDao dao;

	public NameServiceImpl(NameDao nameDao) {
		this.dao = nameDao;
	}

	@Override public String getRandomName() {
		return dao.getRandomName();
	}

	@Override public void addNames(List<String> names) {
		List<Name> toStore = names.stream().map(x -> new Name(x)).collect(Collectors.toList());
		dao.insertNames(toStore);
	}

	@Override public void addName(String name) {
		Name newName = new Name(name);
		dao.insertName(newName);
	}

}
