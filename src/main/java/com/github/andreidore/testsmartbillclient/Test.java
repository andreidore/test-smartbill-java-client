package com.github.andreidore.testsmartbillclient;

import java.util.List;

import com.github.andreidore.smartbillclient.SeriesInfo;
import com.github.andreidore.smartbillclient.SmartBillClient;

public class Test {

    public static void main(String[] args) {

	SmartBillClient client = new SmartBillClient(System.getProperty("username"), System.getProperty("token"));

	/*
	 * List<Tax> list = client.getTaxes(System.getProperty("cif"));
	 * 
	 * 
	 * for (Tax t : list) { System.out.println(t); }
	 */

	List<SeriesInfo> list2 = client.getSeries(System.getProperty("cif"));

	for (SeriesInfo t : list2) {
	    System.out.println(t);
	}

    }

}
