package de.awesome.corporate.newworlds.data.financials.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import de.awesome.corporate.newworlds.data.financials.entity.FinancialContract;

@Component
public interface FinancialContractRepository extends JpaRepository<FinancialContract, Long> {
	
}
