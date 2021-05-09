package com.crm.comcast.product.Test;

import org.testng.annotations.Test;

public class EditProductTest {
	@Test(groups="smokeTest")
	public void editProduct()
	{
		System.out.println("Product has been edited Succesffuly");
	}
    @Test(groups="regressionTest")
    public void productDeployedTo()
    {
    	System.out.println("Syndney,Austrailia");
    }
}
