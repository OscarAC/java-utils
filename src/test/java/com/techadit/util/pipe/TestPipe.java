package com.techadit.util.pipe;


import org.junit.Assert;
import org.junit.Test;

/**
 * TestPipe.java
 * 07/04/2018 - File Creation
 * Copyright(c) 2018-present, Oscar A. Carrera.
 * Distributed under the MIT License (http://opensource.org/licenses/MIT)
 */

public class TestPipe {

    @Test
    public void testSingleChain() {

        Chain<String> pipe = Pipe.chain((String s) -> s);

        String result = pipe.collect("hello");

        Assert.assertEquals("hello", result);
    }


    @Test
    public void testChain() {

        String result = Pipe.chain((String s) -> s).chain(String::toUpperCase).chain(s -> s).collect("hello");

        Assert.assertEquals("HELLO", result);
    }


    @Test
    public void testSameReference() {

        String test = "hello";

        String result = Pipe.chain((String s) -> s).chain(s -> s).collect(test);

        Assert.assertSame(test, result);
    }


    @Test
    public void testNull() {

        Integer result = Pipe.chain((Integer i) -> i).chain(i -> i).collect(null);

        Assert.assertNull(result);

    }

}
