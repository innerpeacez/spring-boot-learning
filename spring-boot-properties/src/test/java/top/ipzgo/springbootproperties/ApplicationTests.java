package top.ipzgo.springbootproperties;

import org.junit.Test;
import org.springframework.test.web.servlet.RequestBuilder;
import top.ipzgo.springbootproperties.restapi.UserController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

public class ApplicationTests extends MockMvcTest {

    private RequestBuilder request = null;

    private UserController userController = new UserController();

    @Test
    public void testAddUser() throws Exception {

        request = post("/user")
                .param("id","1")
                .param("name","innerpeacez")
                .param("age","20");

        mvc.perform(request);


        request = get("/user/1");
        mvc.perform(request);

    }



}