package com.shangsha.framework.modules.orm;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.shangsha.utils.ReflectionUtils;



public class DynamicDataSource extends AbstractRoutingDataSource {
	@Override
	protected Object determineCurrentLookupKey() {
		return CustomerContextHolder.getCustomerType();
	}

	@SuppressWarnings("unchecked")
	public Map<String, DataSource> getTargetDataSources() {
		return (Map<String, DataSource>) ReflectionUtils.getFieldValue(this, "targetDataSources");
	}

}
