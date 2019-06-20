/**
 * 
 */
package org.tofek.SearchApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tofek.khan
 */

@RestController
@RequestMapping("/search")
public class SearchAppController {
	
	@RequestMapping("/username/{username}")
	public void searchByUsername() {
		//TODO: Need to hit the Register service to call and get the data.
	}
	
	@RequestMapping("/name/{name}")
	public void searchByName() {
		
	}
	
	@RequestMapping("/address/{address}")
	public void searchByAddress() {
		
	}
	
	@RequestMapping("/ssn/{ssn}")
	public void searchBySsn() {
		
	}

}
