package com.bean.taleem.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.bean.taleem.entity.Education;
import com.bean.taleem.repository.EducationRepository;
import com.bean.taleem.service.EducationService;

@Service
public class EducationServiceImpl implements EducationService {

	@Autowired
	EducationRepository educationRepository;
	
	@Override
	public List<Education> findAll() {
		return educationRepository.findAll();
	}

	@Override
	public List<Education> findAll(Sort sort) {
		return educationRepository.findAll(sort);
	}

	@Override
	public List<Education> findAllById(Iterable<Integer> ids) {
		return educationRepository.findAllById(ids);
	}

	@Override
	public <S extends Education> List<S> saveAll(Iterable<S> entities) {
		return educationRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		educationRepository.flush();
	}

	@Override
	public <S extends Education> S saveAndFlush(S entity) {
		return educationRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends Education> List<S> saveAllAndFlush(Iterable<S> entities) {
		return educationRepository.saveAllAndFlush(entities);
	}

	@Override
	public void deleteAllInBatch(Iterable<Education> entities) {
		educationRepository.deleteAllInBatch(entities);;
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		educationRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public void deleteAllInBatch() {
		educationRepository.deleteAllInBatch();
	}

	@Override
	public Education getOne(Integer id) {
		return educationRepository.getOne(id);
	}

	@Override
	public Education getById(Integer id) {
		return educationRepository.getById(id);
	}

	@Override
	public <S extends Education> List<S> findAll(Example<S> example) {
		return educationRepository.findAll(example);
	}

	@Override
	public <S extends Education> List<S> findAll(Example<S> example, Sort sort) {
		return educationRepository.findAll(example, sort);
	}

	@Override
	public Page<Education> findAll(Pageable pageable) {
		return educationRepository.findAll(pageable);
	}

	@Override
	public <S extends Education> S save(S entity) {
		return educationRepository.save(entity);
	}

	@Override
	public Optional<Education> findById(Integer id) {
		return educationRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return educationRepository.existsById(id);
	}

	@Override
	public long count() {
		return educationRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		educationRepository.deleteById(id);
	}

	@Override
	public void delete(Education entity) {
		educationRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		educationRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Education> entities) {
		educationRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		educationRepository.deleteAll();
	}

	@Override
	public <S extends Education> Optional<S> findOne(Example<S> example) {
		return educationRepository.findOne(example);
	}

	@Override
	public <S extends Education> Page<S> findAll(Example<S> example, Pageable pageable) {
		return educationRepository.findAll(example, pageable);
	}

	@Override
	public <S extends Education> long count(Example<S> example) {
		return educationRepository.count(example);
	}

	@Override
	public <S extends Education> boolean exists(Example<S> example) {
		return educationRepository.exists(example);
	}

	
}