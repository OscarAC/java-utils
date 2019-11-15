package com.techadit.util.pipe;

import com.techadit.util.pipe.base.ChainBase;

import java.util.function.Function;

/**
 * Pipe.java
 * 07/04/2018 - File Creation
 * Copyright(c) 2018-present, Oscar A. Carrera.
 * Distributed under the MIT License (http://opensource.org/licenses/MIT)
 */

public interface Pipe {

    /**
     * Chain a step
     *
     * @param step next Step
     * @return reference to the Chain
     */
    static <I> Chain<I> chain(Function<I, I> step) {
        return new ChainBase.Source<>(step);
    }

}
