package org.bridgelabz.addressbook;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookCsvTest {

	@Test
	public void givenThreeContacts_WhenWrittenIn_CSVFileShouldPassTheTest() 
    {
		AddressBookCSV addressBookCSVobject=new AddressBookCSV("D:\\DEEPANJAN\\PROJECTS\\AddressBookCSV\\src\\AddressBookCSVTesting.csv");
		int readCSVContacts=addressBookCSVobject.readAddressBookFromCSVFile();
		Assert.assertEquals(3,readCSVContacts);
	} 
}
