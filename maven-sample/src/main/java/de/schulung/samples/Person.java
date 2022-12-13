package de.schulung.samples;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Person {

    private final String name;

    public String sayHello() {
        return "Hello, I'm " + name;
    }

}
