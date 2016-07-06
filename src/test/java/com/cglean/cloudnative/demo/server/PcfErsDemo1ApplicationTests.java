package com.cglean.cloudnative.demo.server;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.text.ParseException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cglean.cloudnative.demo.PcfErsDemo1Application;
import com.cglean.cloudnative.demo.server.model.Attendee;
import com.cglean.cloudnative.demo.server.repository.AttendeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PcfErsDemo1Application.class)
@WebAppConfiguration
public class PcfErsDemo1ApplicationTests {
	
	@Autowired
	private AttendeeRepository attendeeRepository;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void attendeeRepository() throws ParseException {
		
		attendeeRepository.deleteAll();
		
		Attendee a1 = new Attendee();
		a1.setFirstName("Phil");
		a1.setLastName("Berman");
		attendeeRepository.save(a1);
		
		a1 = new Attendee();
		a1.setFirstName("Marcelo");
		a1.setLastName("Borges");
		attendeeRepository.save(a1);
		
		List<Attendee> attendees = attendeeRepository.findAll();
		assertThat(attendees.size(), is(2));
		
	}

}
