package com.bean.taleem.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.bean.taleem.entity.Application;
import com.bean.taleem.repository.ApplicationRepository;
import com.bean.taleem.service.ApplicationService;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	ApplicationRepository applicationRepository;
	
	@Override
	public List<Application> findAll() {
		return applicationRepository.findAll();
	}

	@Override
	public List<Application> findAll(Sort sort) {
		return applicationRepository.findAll(sort);
	}

	@Override
	public List<Application> findAllById(Iterable<Integer> ids) {
		return applicationRepository.findAllById(ids);
	}

	@Override
	public <S extends Application> List<S> saveAll(Iterable<S> entities) {
		return applicationRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		applicationRepository.flush();
	}

	@Override
	public <S extends Application> S saveAndFlush(S entity) {
		return applicationRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends Application> List<S> saveAllAndFlush(Iterable<S> entities) {
		return applicationRepository.saveAllAndFlush(entities);
	}

	@Override
	public void deleteAllInBatch(Iterable<Application> entities) {
		applicationRepository.deleteAllInBatch(entities);;
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		applicationRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public void deleteAllInBatch() {
		applicationRepository.deleteAllInBatch();
	}

	@Override
	public Application getOne(Integer id) {
		return applicationRepository.getOne(id);
	}

	@Override
	public Application getById(Integer id) {
		return applicationRepository.getById(id);
	}

	@Override
	public <S extends Application> List<S> findAll(Example<S> example) {
		return applicationRepository.findAll(example);
	}

	@Override
	public <S extends Application> List<S> findAll(Example<S> example, Sort sort) {
		return applicationRepository.findAll(example, sort);
	}

	@Override
	public Page<Application> findAll(Pageable pageable) {
		return applicationRepository.findAll(pageable);
	}

	@Override
	public <S extends Application> S save(S entity) {
		return applicationRepository.save(entity);
	}

	@Override
	public Optional<Application> findById(Integer id) {
		return applicationRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return applicationRepository.existsById(id);
	}

	@Override
	public long count() {
		return applicationRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		applicationRepository.deleteById(id);
	}

	@Override
	public void delete(Application entity) {
		applicationRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		applicationRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Application> entities) {
		applicationRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		applicationRepository.deleteAll();
	}

	@Override
	public <S extends Application> Optional<S> findOne(Example<S> example) {
		return applicationRepository.findOne(example);
	}

	@Override
	public <S extends Application> Page<S> findAll(Example<S> example, Pageable pageable) {
		return applicationRepository.findAll(example, pageable);
	}

	@Override
	public <S extends Application> long count(Example<S> example) {
		return applicationRepository.count(example);
	}

	@Override
	public <S extends Application> boolean exists(Example<S> example) {
		return applicationRepository.exists(example);
	}

	
}