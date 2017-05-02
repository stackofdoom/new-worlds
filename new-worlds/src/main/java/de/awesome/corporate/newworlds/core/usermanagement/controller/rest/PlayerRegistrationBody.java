/**
 * 
 */
package de.awesome.corporate.newworlds.core.usermanagement.controller.rest;

import javax.validation.constraints.NotNull;

/**
 * @author Patrick Schmolke (patrick.schmolke@acando.de)
 *
 */
public class PlayerRegistrationBody {
	
	@NotNull
	private String name;
	
	@NotNull
	private String useraccount;
	
	public PlayerRegistrationBody(){
		
	}
	
	public PlayerRegistrationBody(String name, String useraccount){
		this.name=name;
		this.useraccount = useraccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUseraccount() {
		return useraccount;
	}

	public void setUseraccount(String useraccount) {
		this.useraccount = useraccount;
	}

}
