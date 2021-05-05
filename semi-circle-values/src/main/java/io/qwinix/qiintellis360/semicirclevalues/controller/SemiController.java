package io.qwinix.qiintellis360.semicirclevalues.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.qwinix.qiintellis360.semicirclevalues.model.Count;
import io.qwinix.qiintellis360.semicirclevalues.service.CountService;

@RestController
public class SemiController {

	@Autowired
	private CountService service;

	@GetMapping("/values")
	public List<Count> getAllValues() {
		return service.findAll();
	}

	@GetMapping("/value/{title}")
	public Count findByTitle(@PathVariable String title) {
		return service.findByTitle(title);
	}
}
