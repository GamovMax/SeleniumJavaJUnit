package com.example.tasks;

import org.junit.*;
import java.util.Random;
import static constants.Constant.Urls.URL_CLIENT;

public class TestTask11TestReg extends BasePage.BasePage {

    @Test
    public void Reg()
    {
        get(URL_CLIENT);
        //maximize();

        clickCssSelector("form[name='login_form'] > table > tbody > tr:nth-child(5) > td > a");

        clickCssSelector("input[name='firstname']");
        sendKeysCssSelector("input[name='firstname']","1");

        clickCssSelector("input[name='lastname']");
        sendKeysCssSelector("input[name='lastname']","2");

        clickCssSelector("input[name='address1']");
        sendKeysCssSelector("input[name='address1']","3");

        clickCssSelector("input[name='postcode']");
        sendKeysCssSelector("input[name='postcode']","36601");

        clickCssSelector("input[name='city']");
        sendKeysCssSelector("input[name='city']","4");

        clickClassName("selection");

        clickClassName("select2-search__field");
        sendKeysClassName("select2-search__field","United States");
        clickClassName("select2-results__option--highlighted");

        Random random = new Random();
        int randomNumber = random.nextInt(1000000000);

        String email = randomNumber + "@gmail.com";

        clickCssSelector("input[name='email']");
        sendKeysCssSelector("input[name='email']",email);

        clickCssSelector("input[name='phone']");
        sendKeysCssSelector("input[name='phone']","+79023455621");

        clickCssSelector("input[name='password']");
        sendKeysCssSelector("input[name='password']","qwe123ASD");

        clickCssSelector("input[name='confirmed_password']");
        sendKeysCssSelector("input[name='confirmed_password']","qwe123ASD");

        clickCssSelector("button[name='create_account']");

        clickCssSelector("div>ul.list-vertical>li:nth-child(4)>a");

        clickCssSelector("input[name='email']");
        sendKeysCssSelector("input[name='email']",email);

        clickCssSelector("input[name='password']");
        sendKeysCssSelector("input[name='password']","qwe123ASD");

        clickCssSelector("button[name='login']");

        clickCssSelector("div>ul.list-vertical>li:nth-child(4)>a");
    }
}
