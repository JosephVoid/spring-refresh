package com.warmup.warmup;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/* 
 * FOR INTEGRATION TESTING WHERE THE APP CONTEXT RUNS FULLY, USEFULL FOR API/ENDPOINT TESTING
 * USES YOUR ACTUAL DB
*/
@SpringBootTest
@AutoConfigureMockMvc
//@ActiveProfiles("test") // INSTRUCT SPRING TO USE TEST DATASOURCE FOR THE A TEST CLASS
// YOU MUST CREATE AN application-test.properties IN RESOURCE FOLDER
class WarmupApplicationTests {
	@Autowired
	private MockMvc mocker;

	// @Test
	// void shouldaddAtask() throws Exception {
	// 	this.mocker.perform(post("/task/add?task=Test2"))
	// 		.andDo(print())
	// 		.andExpect(status().isOk())
	// 		.andExpect(content().string(containsString("Added")));
	// }

	// @Test
	// void shouldPrintSomething() throws Exception {
	// 	this.mocker.perform(get("/task/all"))
	// 		.andDo(print())
	// 		.andExpect(status().isOk())
	// 		.andExpect(content().string(containsString("}")));
	// }

}
