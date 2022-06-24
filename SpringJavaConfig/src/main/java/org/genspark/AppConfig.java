package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public Address add1() {
        return new Address("Seattle", "WA", "USA", "98444");
    }
    @Bean
    public Phone phone1() {
        return new Phone("222-233-2323");
    }
    @Bean
    public Phone phone2() {
        return new Phone("777-444-8888");
    }
    @Bean
    public Student student() {
        List<Phone> phones = new ArrayList<>();
        phones.add(phone1());
        phones.add(phone2());
        return new Student(1, "Cesar", phones, add1());
    }

}
