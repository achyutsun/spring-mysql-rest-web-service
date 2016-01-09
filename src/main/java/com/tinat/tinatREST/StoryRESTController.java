package com.tinat.tinatREST;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoryRESTController {
	    @RequestMapping("/page")
	    public Page servePage(@RequestParam(value="page", defaultValue="1") int pageNumber) {
	        return new Page(pageNumber);
	    }
}
