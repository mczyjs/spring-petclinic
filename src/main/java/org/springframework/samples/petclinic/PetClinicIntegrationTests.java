package org.springframework.samples.petclinic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootApplication
@ImportRuntimeHints(PetClinicRuntimeHints.class)
public class PetClinicIntegrationTests {

	@Test
	public void dummyTest() {
		assertEquals(1, 1, "1 should not be equal to 1");
	}
}
