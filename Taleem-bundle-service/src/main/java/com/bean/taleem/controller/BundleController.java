package com.bean.taleem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.taleem.entity.Bundle;
import com.bean.taleem.service.BundleService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/bundles")
@Slf4j
public class BundleController {

	@Autowired
	BundleService bundleService;

	@GetMapping("/{bundleId}")
	public Bundle getBundle(@PathVariable("bundleId") String bundleId) {
		log.info("getting bundle from db service "+bundleId);
		Bundle bundle=bundleService.getById(Integer.parseInt(bundleId));
		return bundle;
	}

	
//	@GetMapping("/subscribed/users/{bundleId}")
//	public Bundle getSubscribedUsers(@PathVariable("bundleId") String bundleId) {
//		log.info("getting bundle from db service "+bundleId);
//		Bundle bundle=bundleService.getById(Integer.parseInt(bundleId));
//		return bundle;
//	}

	
	@PostMapping("/save")
	public void saveBundle(@RequestBody Bundle bundle) {
		log.info("Saving bundle from db service");
		bundleService.save(bundle);
	}

	
}
