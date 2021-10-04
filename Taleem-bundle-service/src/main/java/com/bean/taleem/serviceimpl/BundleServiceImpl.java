package com.bean.taleem.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.bean.taleem.entity.Bundle;
import com.bean.taleem.repository.BundleRepository;
import com.bean.taleem.service.BundleService;

@Service
public class BundleServiceImpl implements BundleService {

	@Autowired
	BundleRepository bundleRepository;
	
	@Override
	public List<Bundle> findAll() {
		return bundleRepository.findAll();
	}

	@Override
	public List<Bundle> findAll(Sort sort) {
		return bundleRepository.findAll(sort);
	}

	@Override
	public List<Bundle> findAllById(Iterable<Integer> ids) {
		return bundleRepository.findAllById(ids);
	}

	@Override
	public <S extends Bundle> List<S> saveAll(Iterable<S> entities) {
		return bundleRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		bundleRepository.flush();
	}

	@Override
	public <S extends Bundle> S saveAndFlush(S entity) {
		return bundleRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends Bundle> List<S> saveAllAndFlush(Iterable<S> entities) {
		return bundleRepository.saveAllAndFlush(entities);
	}

	@Override
	public void deleteAllInBatch(Iterable<Bundle> entities) {
		bundleRepository.deleteAllInBatch(entities);;
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		bundleRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public void deleteAllInBatch() {
		bundleRepository.deleteAllInBatch();
	}

	@Override
	public Bundle getOne(Integer id) {
		return bundleRepository.getOne(id);
	}

	@Override
	public Bundle getById(Integer id) {
		return bundleRepository.getById(id);
	}

	@Override
	public <S extends Bundle> List<S> findAll(Example<S> example) {
		return bundleRepository.findAll(example);
	}

	@Override
	public <S extends Bundle> List<S> findAll(Example<S> example, Sort sort) {
		return bundleRepository.findAll(example, sort);
	}

	@Override
	public Page<Bundle> findAll(Pageable pageable) {
		return bundleRepository.findAll(pageable);
	}

	@Override
	public <S extends Bundle> S save(S entity) {
		return bundleRepository.save(entity);
	}

	@Override
	public Optional<Bundle> findById(Integer id) {
		return bundleRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return bundleRepository.existsById(id);
	}

	@Override
	public long count() {
		return bundleRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		bundleRepository.deleteById(id);
	}

	@Override
	public void delete(Bundle entity) {
		bundleRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		bundleRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Bundle> entities) {
		bundleRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		bundleRepository.deleteAll();
	}

	@Override
	public <S extends Bundle> Optional<S> findOne(Example<S> example) {
		return bundleRepository.findOne(example);
	}

	@Override
	public <S extends Bundle> Page<S> findAll(Example<S> example, Pageable pageable) {
		return bundleRepository.findAll(example, pageable);
	}

	@Override
	public <S extends Bundle> long count(Example<S> example) {
		return bundleRepository.count(example);
	}

	@Override
	public <S extends Bundle> boolean exists(Example<S> example) {
		return bundleRepository.exists(example);
	}

	
}