package com.amouchere.bdd;

public class TestMe {

    private final int    CONSTANT = 5;
    private final MockMe mockMe;

    public TestMe(final MockMe mockMe) {
        this.mockMe = mockMe;
    }

    public int addFive(int a) {
        return mockMe.makeAnOperation(a, CONSTANT);
    }

}
