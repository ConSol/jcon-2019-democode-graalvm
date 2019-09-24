package de.consol.dus.graal.pojo;

import java.io.IOException;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

public class CreateUserInJavaModifyItInJS {
    public static void main(final String... args) throws IOException {
        final User user = User.of("John Doe", "john@doe.com");
        final Context context = Context.newBuilder()
                .allowAllAccess(true)
                .build();
        context.getBindings("js").putMember("user", user);
        loadJsScript("js/modify.java.user.js", context);
        System.out.println(user);
    }

    private static void loadJsScript(final String pathToSourceFile, final Context context) throws IOException {
        final Source source = Source.newBuilder("js", ClassLoader.getSystemResource(pathToSourceFile))
                .cached(true)
                .build();
        context.eval(source);
    }
}
