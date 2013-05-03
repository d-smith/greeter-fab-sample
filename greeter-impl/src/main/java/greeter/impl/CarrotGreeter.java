package greeter.impl;

import greeter.Greeter;

public class CarrotGreeter implements Greeter {
    @Override
    public String greeting() {
        return "Hello, meatbag";
    }
}
