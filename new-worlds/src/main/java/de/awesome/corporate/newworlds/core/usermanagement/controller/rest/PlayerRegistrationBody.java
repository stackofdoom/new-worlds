/**
 * 
 */
package de.awesome.corporate.newworlds.core.usermanagement.controller.rest;

import javax.validation.constraints.NotNull;

/**
 * @author Patrick Schmolke
 *
 */
public class PlayerRegistrationBody {
	
	@NotNull
	private String name;
	
	@NotNull
	private String useraccount;
	
	@NotNull
	private String password;
	
	@NotNull
	private String email;
	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
