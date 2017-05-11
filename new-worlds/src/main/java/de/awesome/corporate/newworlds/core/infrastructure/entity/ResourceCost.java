package de.awesome.corporate.newworlds.core.infrastructure.entity;

import de.awesome.corporate.newworlds.core.infrastructure.types.EResourceType;

public class ResourceCost {

	private EResourceType resource;
	// the price
	private long price;
	// the amount that is already paid.
	private long progress;

	public EResourceType getResource() {
		return resource;
	}

	public long getPrice() {
		return price;
	}

	public long getProgress() {
		return progress;
	}

	public void setResource(EResourceType resource) {
		this.resource = resource;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void setProgress(long progress) {
		this.progress = progress;
	}

}
