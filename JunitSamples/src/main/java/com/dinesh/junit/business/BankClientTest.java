package com.dinesh.junit.business;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.dinesh.junit.business.exception.DifferentCurrenciesException;
import com.dinesh.junit.model.Amount;
import com.dinesh.junit.model.AmountImpl;
import com.dinesh.junit.model.ClientImpl;
import com.dinesh.junit.model.ClientType;
import com.dinesh.junit.model.Collateral;
import com.dinesh.junit.model.CollateralImpl;
import com.dinesh.junit.model.CollateralType;
import com.dinesh.junit.model.Currency;
import com.dinesh.junit.model.Product;
import com.dinesh.junit.model.ProductImpl;
import com.dinesh.junit.model.ProductType;

public class BankClientTest {

	public static void main(String... args) throws DifferentCurrenciesException {
		List<Collateral> collaterals = new ArrayList<Collateral>();
		collaterals.add(new CollateralImpl(10, "Bonds", CollateralType.BONDS));

		List<Product> products = new ArrayList<Product>();

		products.add(new ProductImpl(100, "Product 15", ProductType.BANK_GUARANTEE,
				new AmountImpl(new BigDecimal("5.0"), Currency.INDIAN_RUPEE)));

		products.add(new ProductImpl(101, "Product Loan", ProductType.LOAN,
				new AmountImpl(new BigDecimal("3.0"), Currency.INDIAN_RUPEE)));

		ClientImpl clientImpl = new ClientImpl(3311L, "Dinesh", ClientType.PRIVATE, collaterals, products);

		ClientBOImpl clientBOImpl = new ClientBOImpl();

		Amount clientProductsSum = clientBOImpl.getClientProductsSum(products);
		clientImpl.setProductAmount(clientProductsSum.getValue());
		
		System.out.println(clientImpl);
		
		
	}

}
