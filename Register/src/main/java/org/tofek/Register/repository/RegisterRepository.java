/**
 * 
 */
package org.tofek.Register.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;
import org.tofek.Register.model.UserDTO;

/**
 * @author tofek.khan
 *
 */
@Repository
public class RegisterRepository {

	public static Map<Integer, UserDTO> userMap = new HashMap();

	public void addUser(UserDTO userDTO) {
		userMap.put(userMap.size() + 1, userDTO);
		System.out.println(userMap.size());
	}
	
	public UserDTO getLoginInfo(String username) {
		Collection<UserDTO> userDTOs = userMap.values();

		return userDTOs.stream().filter(userDTO -> username.equals(userDTO.getUsername())).findAny().orElse(null);
	}

}
