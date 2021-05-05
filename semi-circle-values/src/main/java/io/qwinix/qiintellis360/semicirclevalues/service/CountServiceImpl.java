package io.qwinix.qiintellis360.semicirclevalues.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.qwinix.qiintellis360.semicirclevalues.model.Count;
import io.qwinix.qiintellis360.semicirclevalues.repo.CountRepository;

@Service
public class CountServiceImpl implements CountService {

	@Autowired
	private CountRepository countRepo;

	@Override
	public List<Count> findAll() {
		return countRepo.findAll();
	}

	@Override
	public Count findByTitle(String title) {
		Count result = countRepo.findByTitle(title);
		if (result == null) {
			throw new RuntimeException(title + " Not Found ");
		}
		return result;
	}

}
