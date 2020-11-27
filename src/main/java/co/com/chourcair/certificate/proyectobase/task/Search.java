package co.com.chourcair.certificate.proyectobase.task;

import co.com.chourcair.certificate.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private String strCourse;

    public String getStrCourse() {
        return strCourse;
    }

    public void setStrCourse(String strCourse) {
        this.strCourse = strCourse;
    }

    public Search(String strCourse) {
        this.strCourse = strCourse;
    }
    public static Search the(String strCourse) {
        return Tasks.instrumented(Search.class,strCourse);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_UNIVERSITY_CHOUCAIR),
                Enter.theValue(strCourse).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),Click.on(SearchCoursePage.SELECT_COURSE));
    }


}
