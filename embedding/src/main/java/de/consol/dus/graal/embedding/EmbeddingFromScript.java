package de.consol.dus.graal.embedding;

import java.io.IOException;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

public class EmbeddingFromScript {
    public static void main(final String[] args) {
        try (final Context context = Context.create()) {
            final Source source = Source.newBuilder("js", ClassLoader.getSystemResource("js/hello.js")).build();
            context.eval(source);
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
