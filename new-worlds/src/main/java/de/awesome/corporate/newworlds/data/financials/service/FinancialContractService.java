package de.awesome.corporate.newworlds.data.financials.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.awesome.corporate.newworlds.core.gameserver.service.GameTimerService;
import de.awesome.corporate.newworlds.core.usermanagement.entity.Player;
import de.awesome.corporate.newworlds.data.financials.entity.FinancialContract;
import de.awesome.corporate.newworlds.data.financials.repository.FinancialContractRepository;

@Service
public class FinancialContractService {

	@Autowired
	private FinancialContractRepository financialContractRepository;
	
	@Autowired
	private GameTimerService timerService;
	
	public void createFinancialContract(Player contractor, Player contractee, double amount, double interest, int length, int interval){
		FinancialContract contract = new FinancialContract();
		contract.setOwnerId(contractor.getUid());
		contract.setPartnerId(contractee.getUid());
		contract.setValue(amount);
		contract.setAutomaticInterest(true);
		contract.setDuration(length);
		contract.setActive(true);
		contract.setObligationToOwner(true);
		contract.setInitiationTime(timerService.getCurrentTurn());
		contract.setReevaluationTime(interval);
		contract.setTotalInterest(0);
		financialContractRepository.save(contract);
	}
	
	
}
