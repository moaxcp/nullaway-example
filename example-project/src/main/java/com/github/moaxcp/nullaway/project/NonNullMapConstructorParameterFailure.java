package com.github.moaxcp.nullaway.project;

import com.github.moaxcp.nullaway.external.NonNullMapConstructorParameterCheck;

public class NonNullMapConstructorParameterFailure {
    public static void main(String... args) {
        new NonNullMapConstructorParameterCheck(null);
    }
}
