package com.techadit.util.pipe.base;

import java.util.Objects;
import java.util.function.Function;

/**
 * StepBase.java
 * 07/04/2018 - File Creation
 * Copyright(c) 2018-present, Oscar A. Carrera.
 * Distributed under the MIT License (http://opensource.org/licenses/MIT)
 */

public abstract class StepBase<I> {

    protected Function<I,I> step;

    public StepBase(Function<I,I> step) {
        this.step = Objects.requireNonNull(step);
    }

}
