package com.bill_boyer.media.catalog.impl;

import java.util.Map;

import com.bill_boyer.media.catalog.Provider;
import com.bill_boyer.media.catalog.ProviderFactory;

public class SimpleProviderFactory implements ProviderFactory
{
	static Map<String, Provider> mProviders;

	public Map<String, Provider> getProviders()
	{
		return mProviders;
	}

	public void setProviders(Map<String, Provider> providers)
	{
		mProviders = providers;
	}
}
