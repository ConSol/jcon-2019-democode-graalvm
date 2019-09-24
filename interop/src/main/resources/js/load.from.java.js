// run with: js --jvm load.from.java.js
var User;

loadUserTypeFromJar();
var me = createUser("Jane Doe", "jane@doe.com");
console.log(me);

function loadUserTypeFromJar() {
    Java.addToClasspath('../../../../target/dus.graal.interop-1.0-SNAPSHOT.jar');
    User = Java.type('de.consol.dus.graal.pojo.User');
}

function createUser(name, email) {
    return User.of(name, email);
}