package com.dinesh.junit.business;

import java.util.List;

import com.dinesh.junit.business.exception.DifferentCurrenciesException;
import com.dinesh.junit.model.Amount;
import com.dinesh.junit.model.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}