package com.bean.taleem.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "bundle-service", url = "http://localhost:1767")
public interface ClientBundleService {

}
