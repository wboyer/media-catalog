package com.bill_boyer.media.catalog;

import java.util.Map;

public interface ProviderFactory
{
	public Map<String, Provider> getProviders();
	public void getProviders(Map<String, Provider> providers);
}
