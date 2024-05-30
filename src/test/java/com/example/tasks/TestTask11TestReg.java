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

        click_cssSelector("form[name='login_form'] > table > tbody > tr:nth-child(5) > td > a");

        click_cssSelector("input[name='firstname']");
        sendKeys_cssSelector("input[name='firstname']","1");

        click_cssSelector("input[name='lastname']");
        sendKeys_cssSelector("input[name='lastname']","2");

        click_cssSelector("input[name='address1']");
        sendKeys_cssSelector("input[name='address1']","3");

        click_cssSelector("input[name='postcode']");
        sendKeys_cssSelector("input[name='postcode']","36601");

        click_cssSelector("input[name='city']");
        sendKeys_cssSelector("input[name='city']","4");

        click_classname("selection");

        click_classname("select2-search__field");
        sendKeys_classname("select2-search__field","United States");
        click_classname("select2-results__option--highlighted");

        Random random = new Random();
        int randomNumber = random.nextInt(1000000000);

        String email = randomNumber + "@gmail.com";

        click_cssSelector("input[name='email']");
        sendKeys_cssSelector("input[name='email']",email);

        click_cssSelector("input[name='phone']");
        sendKeys_cssSelector("input[name='phone']","+79023455621");

        click_cssSelector("input[name='password']");
        sendKeys_cssSelector("input[name='password']","qwe123ASD");

        click_cssSelector("input[name='confirmed_password']");
        sendKeys_cssSelector("input[name='confirmed_password']","qwe123ASD");

        click_cssSelector("button[name='create_account']");

        click_cssSelector("div>ul.list-vertical>li:nth-child(4)>a");

        click_cssSelector("input[name='email']");
        sendKeys_cssSelector("input[name='email']",email);

        click_cssSelector("input[name='password']");
        sendKeys_cssSelector("input[name='password']","qwe123ASD");

        click_cssSelector("button[name='login']");

        click_cssSelector("div>ul.list-vertical>li:nth-child(4)>a");
    }
}
