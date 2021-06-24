package org.veiga.prototype.randomnamesbackend.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.veiga.prototype.randomnamesbackend.service.NameService;

import java.util.List;

@Api(tags = "Names")
@RestController
@RequestMapping("name")
@CrossOrigin(origins= "*", allowedHeaders = "*")
public class NameController {

	private final NameService service;

	public NameController(NameService nameService) {
		this.service = nameService;
	}

	@ApiOperation("Return a random name")
	@GetMapping("")
	public ResponseEntity<String> getRandomName() {
		String randomName = service.getRandomName();
		ResponseEntity<String> response = new ResponseEntity(randomName, HttpStatus.OK);
		return response;
	}

	@ApiOperation("Insert a list of selectable names")
	@PostMapping("/prepare")
	public ResponseEntity<String> postNames(@RequestBody List<String> names) {
		System.out.println("names = " + names);
		service.addNames(names);
		ResponseEntity<String> response = new ResponseEntity(HttpStatus.OK);
		return response;
	}

	@ApiOperation("Insert one new name")
	@PostMapping("")
	public ResponseEntity<String> postName(@RequestBody String name) {
		service.addName(name);
		ResponseEntity<String> response = new ResponseEntity(HttpStatus.OK);
		return response;
	}
}
