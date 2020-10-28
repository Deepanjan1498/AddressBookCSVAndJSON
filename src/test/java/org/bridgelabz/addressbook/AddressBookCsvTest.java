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
    @Test
    public void givenThreeContacts_WhenWrittenAs_JSONFileShouldPassTheTest()
    {
    		AddressBookJSON addressBookJSON=new AddressBookJSON();
    		int numberOfContacts = addressBookJSON.readAddressBookFromAJSONFile("D:\\DEEPANJAN\\PROJECTS\\AddressBookCSV\\src\\AddressBookJSONTesting.json");
    		Assert.assertEquals(3, numberOfContacts);
    }
}
