/**
 * 
 */
package org.tofek.Register.model;

import java.util.Date;

/**
 * @author tofek.khan
 *
 */
public class UserDTO {

	private int id;
	private String name;
	private Date dob;
	private String address;
	private String SSN;
	private String username;
	private String password;

	/**
	 * @param id
	 * @param name
	 * @param dob
	 * @param address
	 * @param sSN
	 * @param username
	 * @param password
	 */
	public UserDTO(int id, String name, Date dob, String address, String sSN, String username, String password) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		SSN = sSN;
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the sSN
	 */
	public String getSSN() {
		return SSN;
	}

	/**
	 * @param sSN the sSN to set
	 */
	public void setSSN(String sSN) {
		SSN = sSN;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
