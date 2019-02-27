package com.appleframework.data.hbase;

import org.apache.hadoop.hbase.client.HTableInterface;
import org.springframework.data.hadoop.hbase.HbaseTemplate;

import com.appleframework.model.page.Paginator;

/**
 * Callback interface for Hbase code. To be used with {@link HbaseTemplate}'s execution methods, often as anonymous classes within a method implementation without
 * having to worry about exception handling. 
 * 
 * @author Costin Leau
 */
@SuppressWarnings("deprecation")
public interface PageCallback<T> {

	/**
	 * Gets called by {@link HbaseTemplate} execute with an active Hbase table. Does need to care about activating or closing down the table.
	 * 
	 * @param table active Hbase table
	 * @return a result object, or null if none
	 * @throws Throwable thrown by the Hbase API
	 */
	Paginator<T> doInPage(HTableInterface table) throws Throwable;

}
