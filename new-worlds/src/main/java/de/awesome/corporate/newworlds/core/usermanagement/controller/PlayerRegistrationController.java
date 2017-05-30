/**
 * 
 */
package de.awesome.corporate.newworlds.core.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.awesome.corporate.newworlds.core.usermanagement.controller.rest.PlayerRegistrationBody;
import de.awesome.corporate.newworlds.core.usermanagement.controller.rest.PlayerRegistrationOrganisationSetupBody;
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
	public PlayerRegistrationResponseBody registerPlayer(PlayerRegistrationBody registrationBody, BindingResult bindingResult){
		Player player = registrationService.registerPlayer(registrationBody);

		PlayerRegistrationResponseBody response = new PlayerRegistrationResponseBody();
		response.setPlayername(player.getPlayername());;
		response.setUuid(player.getUid());
		
		return response; 
	}
	
	@PostMapping("register/setup/")
	public void createOrganization(PlayerRegistrationOrganisationSetupBody setupBody){
		Organization org = registrationService.setupOrganization(setupBody);
	}
}
