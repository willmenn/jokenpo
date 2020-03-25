package com.jokenpo;

import java.util.function.Function;
import java.util.function.Supplier;

import static com.jokenpo.Result.*;

public enum Item {
    ROCK(rockRule()),
    PAPER(paperRule()),
    SCISSOR(scissorRule());

    private Function<Item, Result> getResult;

    Item(Function<Item, Result> getResult) {
        this.getResult = getResult;
    }

    public Function<Item, Result> getRule() {
        return getResult;
    }

    private static Function<Item, Result> rockRule() {
        return item -> {
            if (item == SCISSOR) return WIN;
            if (item == ROCK) return TIE;
            return LOSE;
        };
    }

    private static Function<Item, Result> paperRule() {
        return item -> {
            if (item == ROCK) return WIN;
            if (item == PAPER) return TIE;
            return LOSE;
        };
    }

    private static Function<Item, Result> scissorRule() {
        return item -> {
            if (item == PAPER) return WIN;
            if (item == SCISSOR) return TIE;
            return LOSE;
        };
    }
}
