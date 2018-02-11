package com.github.andreidore.testsmartbillclient;

import java.util.Date;
import java.util.List;

import com.github.andreidore.smartbillclient.SeriesInfo;
import com.github.andreidore.smartbillclient.SmartBillClient;
import com.github.andreidore.smartbillclient.Stock;
import com.github.andreidore.smartbillclient.Tax;

public class Test {

    public static void main(String[] args) {

	testTaxes();
	System.out.println("---------------------------------------");
	testSeries();
	System.out.println("---------------------------------------");
	testStock();

    }

    public static void testSeries() {

	System.out.println("Test getSeries.");
	SmartBillClient client = new SmartBillClient(System.getProperty("username"), System.getProperty("token"));

	List<SeriesInfo> list2 = client.getSeries(System.getProperty("cif"));

	for (SeriesInfo t : list2) {
	    System.out.println(t);
	}

    }

    public static void testTaxes() {

	System.out.println("Test getTaxes.");

	SmartBillClient client = new SmartBillClient(System.getProperty("username"), System.getProperty("token"));

	List<Tax> list = client.getTaxes(System.getProperty("cif"));

	for (Tax t : list) {
	    System.out.println(t);
	}

    }

    public static void testStock() {

	System.out.println("Test getTaxes.");

	SmartBillClient client = new SmartBillClient(System.getProperty("username"), System.getProperty("token"));

	List<Stock> list = client.getStocks(System.getProperty("cif"), new Date());

	for (Stock t : list) {
	    System.out.println(t);
	}

    }

}
