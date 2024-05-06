package com.example.vargasmodularmonolith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class VargasModularMonolithApplicationTests {

	@Test
	void verifiesModularStructure() {
		ApplicationModules modules = ApplicationModules.of(VargasModularMonolithApplication.class);
		modules.verify();
	}

	@Test
	void createApplicationModuleModel() {
		ApplicationModules modules = ApplicationModules.of(VargasModularMonolithApplication.class);
		modules.forEach(System.out::println);
	}

	@Test
	void createModuleDocumentation() {
		ApplicationModules modules = ApplicationModules.of(VargasModularMonolithApplication.class);
		new Documenter(modules)
				.writeDocumentation()
				.writeIndividualModulesAsPlantUml();
	}



}
