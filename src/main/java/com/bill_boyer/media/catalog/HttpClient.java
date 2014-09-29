package com.bill_boyer.media.catalog;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;

public interface HttpClient
{
	public HttpResponse execute(HttpUriRequest request);	
}
