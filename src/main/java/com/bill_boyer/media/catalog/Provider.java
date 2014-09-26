package com.bill_boyer.media.catalog;

import java.util.List;

public interface Provider
{
	public List<Title> getLatestTitles(int start, int num);
}
