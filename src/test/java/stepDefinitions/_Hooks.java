package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.gwd;

public class _Hooks {

    @Before
    public void before() {
        System.out.println("Senaryo basladi");
    }

    @After
    public void after() {

        // Hata oldugunda bu kisimda ekran görüntüsü alinacak

        gwd.quitDriver();
    }

}
