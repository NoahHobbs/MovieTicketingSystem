package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Sterling Rhone - sprhone
 * Noah Hobbs - ndhobbs
 * 202102 CIS175 26740
 * Apr 12, 2021
 * This class is going to be used to keep track of logins and accounts
 * Has the autowired field of userPassword
 */

@Data
@Entity
@NoArgsConstructor
public class ProgramUsers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	private String userType;	//Employee or Customer or Manager(can edit employees)
	private String userAccess;	//Do they get elevated access? Edit level or view only
	@Column(unique = true)
	private String userName;
	@Autowired
	private Passwords userPassword;
	
	public ProgramUsers(String userType, String userAccess, String userName) {
		// TODO Auto-generated constructor stub
		this.userType = userType;
		this.userAccess = userAccess;
		this.userName = userName;
	}
}
