package com.crm.comcast.product.Test;

import org.testng.annotations.Test;

public class CreateProductTest {
	@Test(groups="smokeTest")
	public void createProduct()
	{
		System.out.println("Product has been created");
	}

	@Test(groups="regressionTest")
	public void productQty()
	{
		System.out.println("80 MILLION TONS");
	}
}
