package mum.edu.alphabetstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.alphabetstore.domain.CreditCard;
import mum.edu.alphabetstore.repository.CreditCardRepository;
import mum.edu.alphabetstore.service.CreditCardService;

@Service
@Transactional
public class CreditCardServiceImpl  implements CreditCardService{

	@Autowired
	CreditCardRepository creditCardRepository;
	@Override
	public CreditCard findCreditCardByNumber(String number) {
		
		return creditCardRepository.findCreditCardByNumber(number);
	}

}
