package de.consol.dus.graal.embedding;

import java.util.function.UnaryOperator;

import org.graalvm.polyglot.Context;

public class Embedding {
    public static void main(final String... args) {
        try (final Context context = Context.create()) {
            context.eval("js",
                    "function sayHello() {"
                                + "console.log('Hello JCON 2019! This is JS speaking')"
                            + "}");
            @SuppressWarnings("unchecked") final UnaryOperator<Void> sayHello =
                    context.getBindings("js").getMember("sayHello").as(UnaryOperator.class);
            sayHello.apply(null);
        }
    }
}
