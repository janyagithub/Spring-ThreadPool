package com.asimio.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asimio.demo.tenant.TenantStore;

@Service
public class DemoService {

	@Autowired
	private TenantStore tenantStore;

	public String getTenantValue() {

		return tenantStore.getTenantId();
	}

	@Override
	public String toString() {
		return "DemoService\n\t{\n\t\ttenantStore : " + tenantStore + "\n\t}";
	}

}
