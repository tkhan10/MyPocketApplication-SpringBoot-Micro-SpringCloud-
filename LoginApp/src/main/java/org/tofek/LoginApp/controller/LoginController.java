/**
 * 
 */
package org.tofek.LoginApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.tofek.LoginApp.model.UserDTO;

/**
 * @author tofek.khan
 *
 */
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/{username}")
	public boolean getLoginInformation(@PathVariable("username") String username) {
		
		restTemplate.getForEntity("http://localhost:8091/register/login/"+username, UserDTO.class);

		return false;
	}
	
	@Autowired
	private RestTemplate restTemplate;

}
