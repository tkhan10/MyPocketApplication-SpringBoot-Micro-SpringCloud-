/**
 * 
 */
package org.tofek.Register.service;

import org.tofek.Register.model.UserDTO;

/**
 * @author tofek.khan
 *
 */
@FunctionalInterface
public interface RegisterService {
	void addUser(UserDTO userDTO);
}
