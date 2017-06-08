package de.awesome.corporate.newworlds.data.financials.repository;


import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.awesome.corporate.newworlds.data.financials.entity.FinancialContract;
import de.awesome.corporate.newworlds.data.financials.service.ContractTerminationType;

@Repository
public interface FinancialContractRepository extends JpaRepository<FinancialContract, Long> {
	
	public Set<FinancialContract> findByOwnerId(String ownerId);
	
	public Set<FinancialContract> findByPartnerId(String partnerId);
	
	public Set<FinancialContract> findByTerminationType(ContractTerminationType terminationType);
	
}
