package com.bean.taleem.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bean.taleem.entity.Bundle;

@FeignClient(value = "bundle-service", url = "http://localhost:1767")
public interface ClientBundleService {
	
	@GetMapping("/bundles/{bundleId}")
	Bundle bundle(@PathVariable String pathVariable);

	
}