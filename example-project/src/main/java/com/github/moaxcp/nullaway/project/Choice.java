package com.github.moaxcp.nullaway.project;

import org.jspecify.annotations.Nullable;

import static java.util.Objects.requireNonNull;

public class Choice {
    public static Integer choiceOrZero(@Nullable Integer left, @Nullable Integer right) {
        if (right == null && left == null) {
            return 0;
        }
        if (right == null) {
            return left;
        }
        if (left == null) {
            return right;
        }
        return right;
    }

    public static Integer choiceOrZeroFixed(@Nullable Integer left, @Nullable Integer right) {
        if (right == null && left == null) {
            return 0;
        }
        if (right == null) {
            return requireNonNull(left);
        }
        if (left == null) {
            return requireNonNull(right);
        }
        return right;
    }
}
