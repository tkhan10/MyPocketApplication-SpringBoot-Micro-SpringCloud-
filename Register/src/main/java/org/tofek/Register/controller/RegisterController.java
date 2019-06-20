/**
 * 
 */
package org.tofek.Register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tofek.Register.model.UserDTO;
import org.tofek.Register.repository.RegisterRepository;
import org.tofek.Register.service.RegisterService;

/**
 * @author tofek.khan
 *
 */

@RestController
@RequestMapping("/register")
public class RegisterController {

	@PostMapping("/user")
	public void setUserInformation(@RequestBody UserDTO userDTO) {	
		System.out.println("-------------------- inside RegisterController.setUserInformation ---------"+userDTO);
		RegisterService registerService = (userDTO1) -> {
			registerRepository.addUser(userDTO);
		};

		registerService.addUser(userDTO);

	}
	
	
	@GetMapping("/login/{username}")
	public void getLoginInformation(@PathVariable String username) {	
		System.out.println("-------------------- inside RegisterController.getLoginInformation ---------"+username);
		UserDTO userDTO = registerRepository.getLoginInfo(username) != null ? registerRepository.getLoginInfo(username)
				: null;
		System.out.println("User Name :"+userDTO.getUsername());
		System.out.println("Name :"+userDTO.getName());
		System.out.println("This is TOfek KHan");

	}
	
	@Autowired
	private RegisterRepository registerRepository;

}
