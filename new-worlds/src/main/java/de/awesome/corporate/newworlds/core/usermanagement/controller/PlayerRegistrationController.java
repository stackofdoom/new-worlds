/**
 * 
 */
package de.awesome.corporate.newworlds.core.usermanagement.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.awesome.corporate.newworlds.core.usermanagement.controller.rest.PlayerRegistrationBody;
import de.awesome.corporate.newworlds.core.usermanagement.controller.rest.PlayerRegistrationResponseBody;
import de.awesome.corporate.newworlds.core.usermanagement.entity.Organization;
import de.awesome.corporate.newworlds.core.usermanagement.entity.Player;
import de.awesome.corporate.newworlds.core.usermanagement.service.RegistrationService;

/**
 * @author Patrick Schmolke
 *
 */
@RestController
@RequestMapping("/registration")
public class PlayerRegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@PostMapping("/register")
	public Player registerPlayer(PlayerRegistrationBody registrationBody, BindingResult bindingResult){
		Player player = registrationService.registerPlayer(registrationBody);

		PlayerRegistrationResponseBody response = new PlayerRegistrationResponseBody();
		response.setPlayername(player.getPlayername());;
		response.setUuid(player.getUid());
		return player;
	}
	
}
