package de.awesome.corporate.newworlds.core.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.awesome.corporate.newworlds.core.usermanagement.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, String>{

}
