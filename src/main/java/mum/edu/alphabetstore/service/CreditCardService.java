package mum.edu.alphabetstore.service;

import mum.edu.alphabetstore.domain.CreditCard;

public interface CreditCardService {

	CreditCard findCreditCardByNumber(String number);
}
