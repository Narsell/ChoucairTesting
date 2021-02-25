package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target COURSES_BUTTON =  Target.the("Button that takes us into the course list")
            .located(By.id("certificaciones"));
    public static final Target SEARCH_BUTTON = Target.the("Button that searches for the course")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SEARCH_FIELD = Target.the("Search input field")
            .located(By.id("coursesearchbox"));
    public static final Target SELECTED_COURSE = Target.the("Button that takes us into the desired course")
            .located(By.xpath("//a[contains(text(), 'ISTQB - Test Automation Engineer')]"));
}
