package com.my131.demo_di;

import com.my131.demo_di.repository.DemoRepository;
import com.my131.demo_di.service.DemoService.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoDiApplicationTests {

	@Test
	void contextLoads() {
		DemoRepository repo = new DemoRepository();
		DemoService service = new DemoService(repo);

		service.doSomething();

	}

}
