package io.qwinix.qiintellis360.semicirclevalues.service;

import java.util.List;

import io.qwinix.qiintellis360.semicirclevalues.model.Count;
import io.qwinix.qiintellis360.semicirclevalues.repo.CountRepository;

public interface CountService  {

	List<Count> findAll();
	Count findByTitle(String title);
}
