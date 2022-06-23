package com.voter;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.voter.entities.Voter;

import org.springframework.http.MediaType;

/*@SpringBootTest
public class VoterApplicationTests {

	@Autowired
	private VoterApplication VoterApplication;
	@Test
	void contextLoads() {
		assertThat(VoterApplication).isNotNull();
	}*/

	@SpringBootTest
	@TestInstance(TestInstance.Lifecycle.PER_CLASS)
	class VoterApplicationTests extends AbstractTest {

		@Override
		@BeforeAll
		public void setUp() {
			super.setUp();
		}
        // test case for adding voter
		@Test
		public void AddVoter() throws Exception {
			String uri = "/AddVoter";
			Voter voter = new Voter();
			voter.setvoterId(4);
			voter.setvoterName("Sara");
			voter.setStatus("Yes");
			voter.setDistrict("Bangalore");
			voter.setMobile(445566);
			voter.setDOB("September");
			voter.setGender("Female");
			voter.setAddress("Bangalore,Karnataka");
			voter.setPassword("6789");

			String inputJson = super.mapToJson(voter);
			MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
					.contentType(MediaType.APPLICATION_JSON_VALUE)
					.content(inputJson)).andReturn();

			int status = mvcResult.getResponse().getStatus();
			 assertEquals(404,status);
		}
		//test case for getting voter by id
		public void getVoterById() throws Exception {
			   String uri = "/getVoterById";
			   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
			         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
			   int status = mvcResult.getResponse().getStatus();
			   assertEquals(200, status);
			   String content = mvcResult.getResponse().getContentAsString();
			   Voter voter = super.mapFromJson(content,Voter.class);
			   assertEquals(voter.getvoterId(), 102);
			}
		
}
