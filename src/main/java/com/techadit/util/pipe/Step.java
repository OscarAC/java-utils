package com.techadit.util.pipe;

/**
 * Step.java
 * 07/04/2018 - File Creation
 * Copyright(c) 2018-present, Oscar A. Carrera.
 * Distributed under the MIT License (http://opensource.org/licenses/MIT)
 */

public interface Step<I> {

    /**
     * Process the step
     * @param input instance of context
     */
    I execute(I input);

}
