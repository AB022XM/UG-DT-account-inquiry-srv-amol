package ug.co.absa.amol.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ug.co.absa.amol.validation.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
