package com.summit.springboot.template;

import com.summit.springboot.template.login.LoginController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void loginTest() {
        LoginController loginController = new LoginController();
        assertEquals("Hello Travic CI", loginController.init());
    }

}
