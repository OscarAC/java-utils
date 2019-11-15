package com.techadit.util.pipe.base;

import com.techadit.util.pipe.Chain;
import com.techadit.util.pipe.Step;

import java.util.Objects;
import java.util.function.Function;

/**
 * ChainBase.java
 * 07/04/2018 - File Creation
 * Copyright(c) 2018-present, Oscar A. Carrera.
 * Distributed under the MIT License (http://opensource.org/licenses/MIT)
 */

public abstract class ChainBase<I> extends StepBase<I> implements Chain<I> {

    protected Step<I> source;
    protected Step<I> next;

    protected ChainBase(Function<I, I> step) {

        super(step);
    }

    protected ChainBase(ChainBase<I> previous, Function<I,I> step) {

        super(step);
        this.source = previous.source;
        previous.next = this;
    }


    @Override
    public Chain<I> chain(Function<I, I> step) {

        return new ChainBase<I>(this, step) {

            @Override
            public I execute(I input) {

                if(Objects.isNull(next))
                    return step.apply(input);

                return next.execute(step.apply(input));
            }
        };
    }


    @Override
    public I collect(I input) {

        return source.execute(input);
    }

    public static class Source<I> extends ChainBase<I> {

        public Source(Function<I,I> step) {
            super(step);
            this.source = this;
        }

        @Override
        public I execute(I input) {

            if(Objects.isNull(next))
                return step.apply(input);

            return next.execute(step.apply(input));
        }
    }

}
