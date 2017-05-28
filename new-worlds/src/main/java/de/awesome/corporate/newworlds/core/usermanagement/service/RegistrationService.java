package de.awesome.corporate.newworlds.core.usermanagement.service;

import de.awesome.corporate.newworlds.core.usermanagement.controller.rest.PlayerRegistrationBody;
import de.awesome.corporate.newworlds.core.usermanagement.entity.Organization;
import de.awesome.corporate.newworlds.core.usermanagement.entity.Player;
import de.awesome.corporate.newworlds.core.usermanagement.entity.UserAccount;
import de.awesome.corporate.newworlds.core.usermanagement.repository.PlayerRepository;
import de.awesome.corporate.newworlds.core.usermanagement.repository.UserAccountRepository;

import java.util.HashSet;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class RegistrationService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private UserAccountRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public Player registerPlayer(PlayerRegistrationBody registrationBody){
		Player player = new Player();
		player.setBalance(0);
		player.setOwnedOrganizations(new HashSet<Organization>());
		player.setPlayername(registrationBody.getName());
		player.setUserAccount(registrationBody.getUseraccount());
		player.setUid(UUID.randomUUID().toString());
		
		playerRepository.save(player);
		
		UserAccount usrAccount = new UserAccount();
		usrAccount.setAccountName(registrationBody.getUseraccount());
		usrAccount.setEmailAddress(registrationBody.getEmail());
		usrAccount.setPasswordHash(passwordEncoder.encode(registrationBody.getPassword()));
		
		userRepository.save(usrAccount);
		//TODO: remove dummy register in service
		return player;
	}

}
