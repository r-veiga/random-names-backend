package org.veiga.prototype.randomnamesbackend.repo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.veiga.prototype.randomnamesbackend.model.Name;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NameRepo {
	private List<Name> names = new ArrayList<>();
}