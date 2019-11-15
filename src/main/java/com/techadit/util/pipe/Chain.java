package com.techadit.util.pipe;

import java.util.function.Function;

/**
 * Chain.java
 * 07/04/2018 - File Creation
 * Copyright(c) 2018-present, Oscar A. Carrera.
 * Distributed under the MIT License (http://opensource.org/licenses/MIT)
 */

public interface Chain<I> extends Step<I>, Pipe {

    /**
     * Chain a step
     *
     * @param step next Step
     * @return reference to the Chain
     */
    Chain<I> chain(Function<I, I> step);

    /**
     * Process the input and collect the result
     *
     * @param input Input to process
     * @return Input result
     */
    I collect(I input);

}
