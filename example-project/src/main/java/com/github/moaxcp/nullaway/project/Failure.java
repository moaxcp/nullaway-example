package com.github.moaxcp.nullaway.project;

import com.github.moaxcp.nullaway.external.Check;

public class Failure {
    public static void main(String... args) {
        Check check = new Check();

        check.method(null, null);
        check.method(null);
    }
}
