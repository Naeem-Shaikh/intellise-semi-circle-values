package io.qwinix.qiintellis360.semicirclevalues.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.qwinix.qiintellis360.semicirclevalues.model.Count;

public interface CountRepository extends JpaRepository<Count, Integer> {
	
	Count findByTitle(String title);

}
