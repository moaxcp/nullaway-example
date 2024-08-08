package com.github.moaxcp.nullaway.model;

import com.google.auto.service.AutoService;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.uber.nullaway.LibraryModels;

@AutoService(LibraryModels.class)
public class CheckModel implements LibraryModels {
    private MethodRef method1 = MethodRef.methodRef("com.github.moaxcp.nullaway.external.Check", "method(java.lang.String)");
    private MethodRef method2 = MethodRef.methodRef("com.github.moaxcp.nullaway.external.Check", "method(java.lang.String, java.lang.String)");

    @Override
    public ImmutableSetMultimap<MethodRef, Integer> failIfNullParameters() {
        return ImmutableSetMultimap.<MethodRef, Integer>builder().build();
    }

    @Override
    public ImmutableSetMultimap<MethodRef, Integer> explicitlyNullableParameters() {
        return ImmutableSetMultimap.<MethodRef, Integer>builder().build();
    }

    @Override
    public ImmutableSetMultimap<MethodRef, Integer> nonNullParameters() {
        return ImmutableSetMultimap.<MethodRef, Integer>builder()
                .put(method1, 0)
                .put(method2, 0)
                .build();
    }

    @Override
    public ImmutableSetMultimap<MethodRef, Integer> nullImpliesTrueParameters() {
        return ImmutableSetMultimap.<MethodRef, Integer>builder().build();
    }

    @Override
    public ImmutableSetMultimap<MethodRef, Integer> nullImpliesFalseParameters() {
        return ImmutableSetMultimap.<MethodRef, Integer>builder().build();
    }

    @Override
    public ImmutableSetMultimap<MethodRef, Integer> nullImpliesNullParameters() {
        return ImmutableSetMultimap.<MethodRef, Integer>builder().build();
    }

    @Override
    public ImmutableSet<MethodRef> nullableReturns() {
        return ImmutableSet.<MethodRef>builder()
                .add(method1)
                .add(method2)
                .build();
    }

    @Override
    public ImmutableSet<MethodRef> nonNullReturns() {
        return ImmutableSet.<MethodRef>builder().build();
    }

    @Override
    public ImmutableSetMultimap<MethodRef, Integer> castToNonNullMethods() {
        return ImmutableSetMultimap.<MethodRef, Integer>builder().build();
    }
}
