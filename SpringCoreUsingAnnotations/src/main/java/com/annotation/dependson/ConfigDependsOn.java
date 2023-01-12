package com.annotation.dependson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@ComponentScan
public class ConfigDependsOn {
/*By using @DependsOn annotation we can resolve Circular dependancy..
 * i.e A is dependant on B, B on C & C is dependant on A..
 * */
	@Bean
	@DependsOn({"maths","english"})
	public Subjects getSub() {
		System.out.println("Subjects");
		return new Subjects();
	}
	
	@Bean("maths")
	public Maths getMaths() {
		System.out.println("maths");
		return new Maths("Integration", 90);
	}
	
	@Bean("english")
	public English getEnglish() {
		System.out.println("english");
		return new English("Grammer", 88);
	}
	@Bean("comp")
	public Computer getComp() {
		return new Computer("Effective Java", 99);
	}
}
