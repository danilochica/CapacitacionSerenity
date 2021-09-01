package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.LoginPage.*;

public class Login implements Task {

    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(username).into(USERNAME));
        actor.attemptsTo(Enter.theValue(password).into(PASSWORD));
        actor.attemptsTo(Click.on(LOGIN));
    }

    public static Login with(String user, String password) {
        return Tasks.instrumented(Login.class, user, password);
    }

}
