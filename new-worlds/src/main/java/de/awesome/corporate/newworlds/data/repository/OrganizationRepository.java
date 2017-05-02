package de.awesome.corporate.newworlds.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.awesome.corporate.newworlds.data.entity.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, String>{

}
