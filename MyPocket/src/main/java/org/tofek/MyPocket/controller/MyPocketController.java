/**
 * 
 */
package org.tofek.MyPocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.tofek.MyPocket.model.UserDTO;

/**
 * @author tofek.khan
 *
 */

@RestController
@RequestMapping("/mypocket")
public class MyPocketController {
	
	@PostMapping("/register")
	public void registration(@RequestBody UserDTO userDTO) {
		System.out.println("-------- Inside the MyPocketController ---------------");
		restTemplate.postForEntity("http://localhost:8091/register/user", userDTO, UserDTO.class);
		
	}
	
	@GetMapping("/login/{username}")
	public void getLogin(@PathVariable("username") String username ) {
		System.out.println("-------- Inside the MyPocketController ---------------");
		ResponseEntity<Boolean> isLogin = restTemplate.getForEntity("http://localhost:8092/login/"+username, Boolean.class);
		System.out.println("THis is tofek khan"+isLogin);
	}
	
	@Autowired
	private RestTemplate restTemplate;

}
