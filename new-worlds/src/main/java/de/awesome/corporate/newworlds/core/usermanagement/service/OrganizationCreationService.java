package de.awesome.corporate.newworlds.core.usermanagement.service;

import java.util.ArrayList;
import java.util.Arrays;

import javax.validation.ValidationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;

import de.awesome.corporate.newworlds.core.usermanagement.controller.rest.PlayerRegistrationOrganisationSetupBody;
import de.awesome.corporate.newworlds.core.usermanagement.entity.Organization;
import de.awesome.corporate.newworlds.core.usermanagement.entity.Player;
import de.awesome.corporate.newworlds.core.usermanagement.repository.PlayerRepository;
import de.awesome.corporate.newworlds.data.financials.entity.FinancialContract;
import de.awesome.corporate.newworlds.data.financials.service.FinancialContractService;

public class OrganizationCreationService {
	
	@Autowired
	private FinancialContractService finService;
	
	@Autowired
	private PlayerRepository playerRep;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationCreationService.class);

	private static final double BASIC_INTEREST = 0.04;

	private static final int DEFAULT_INTERVAL = 5;

	private static final int DEFAULT_LENGTH = 100;
	//TODO: extract to external location, database or property file
	private static double CAPSULE_PRICE = 5000000;
	private static double INDUSTRY_PRICE = 20000;
	private static double CROPS_PRICE = 200000;
	private static double CATTLE_PRICE = 350000;
	private static double POPULATION_PRICE = 1000;
	private static double HEADQUARTERS_PRICE = 1000000;
	
	private static int CAPSULE_SIZE = 1000;
	private static int INDUSTRY_SIZE = 2;
	private static int CROPS_SIZE = 50;
	private static int CATTLE_SIZE = 150;
	private static int POPULATION_SIZE = 1;
	private static int HEADQUARTERS_SIZE = 200;

	public Organization createOrganization(PlayerRegistrationOrganisationSetupBody setupBody) {
		Organization org = new Organization();
		
		
		double totalExpenses = 0;
		int spaceAvailable = 0;
		int spaceUsed = 0;
		
		//capsule
		totalExpenses += setupBody.getNumberOfCapsules()*CAPSULE_PRICE;
		spaceAvailable = setupBody.getNumberOfCapsules()*CAPSULE_SIZE;
		
		//industry
		totalExpenses += setupBody.getIndustry()*INDUSTRY_PRICE;
		spaceUsed += setupBody.getIndustry()*INDUSTRY_SIZE;
		
		//crops
		totalExpenses += setupBody.getCrops()*CROPS_PRICE;
		spaceUsed += setupBody.getCrops()*CROPS_SIZE;
		
		//cattle
		totalExpenses += setupBody.getCattle()*CATTLE_PRICE;
		spaceUsed += setupBody.getCattle()*CATTLE_SIZE;
		
		//pops
		totalExpenses += setupBody.getPopulation()*POPULATION_PRICE;
		spaceUsed += setupBody.getPopulation()*POPULATION_SIZE;
		
		//hq
		totalExpenses += HEADQUARTERS_PRICE;
		spaceUsed += HEADQUARTERS_SIZE;
		
		if(spaceAvailable < spaceUsed){
			throw new ValidationException("The chosen " + setupBody.getNumberOfCapsules() + " Capsules only provide " + CAPSULE_SIZE + " space, but chosen loadout uses " + spaceUsed);
		}
		if(setupBody.getNumberOfCapsules() < 1){
			throw new ValidationException("Then number of capsules you start with cannot be less than one.");
		}
		
		OrganizationSetup setup = new OrganizationSetup();
		
		setup.setCapsules(setupBody.getNumberOfCapsules());
		setup.setIndustry(setupBody.getIndustry());
		setup.setPopulation(setupBody.getPopulation()); 
		setup.setCrops(setupBody.getCrops());
		setup.setCattle(setupBody.getCattle());
		
		org.setOwner(setupBody.getPlayerid());
		org.setOrganizationName(setupBody.getOrganizationName());
		Player player = playerRep.getOne(setupBody.getPlayerid());
		FinancialContract contract = finService.createFinancialContract(playerRep.getOne("TerraUnited"), player, totalExpenses, BASIC_INTEREST, DEFAULT_LENGTH, DEFAULT_INTERVAL);
		org.setFinContracts(Arrays.asList(contract));
		
		LOGGER.info("created new player organization for player={} with a starting setup of {}, where organization={}", player, setup, org);
		return org;
	}
	

}
