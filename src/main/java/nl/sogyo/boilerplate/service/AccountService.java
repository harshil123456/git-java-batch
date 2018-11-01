package nl.sogyo.boilerplate.service;

import java.util.List;

import nl.sogyo.boilerplate.domain.SavingsAccount;

public interface AccountService {
//checking by me 10/31/2018 

	public List<SavingsAccount> getSavingsAccounts();
	public SavingsAccount getSavingsAccount(int accountId);
	public void createSavingsAccount(SavingsAccount savingsAccount);

	public void DELETESavingsAccount(int accountId, SavingsAccount savingsAccount);//delete by me

}
