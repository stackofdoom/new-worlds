package de.awesome.corporate.newworlds.data.login.repository;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import de.awesome.corporate.newworlds.data.login.entity.UserAccount;

@Component
public interface UserAccountRepository extends Repository<UserAccount, String> {
	
}
