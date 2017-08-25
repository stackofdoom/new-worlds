package de.awesome.corporate.newworlds.core.types;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public class AbstractNamedEntity {
	
	@Id
	@Column(name="UID")
	@NotNull
	private String uid;
	
	private String name;

	public String getUid() {
		return uid;
	}

	public String getName() {
		return name;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
