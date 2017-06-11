package de.awesome.corporate.newworlds.core.types;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class AbstractNamedEntity {
	
	@Id
	@Column(name="UID")
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
