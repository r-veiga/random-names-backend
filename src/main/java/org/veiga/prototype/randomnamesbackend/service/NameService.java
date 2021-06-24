package org.veiga.prototype.randomnamesbackend.service;

import org.springframework.stereotype.Service;

import java.util.List;

public interface NameService {
	String getRandomName();
	void addNames(List<String> names);
	void addName(String name);
}
