package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dmacc.beans.ProgramUsers;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Apr 12, 2021
 */

@Repository
public interface ProgramUsersRepository extends JpaRepository<ProgramUsers, Long>{
	@Query("SELECT n FROM ProgramUsers n WHERE n.userName = ?1")
	public ProgramUsers findByUserName(String userName);
}
