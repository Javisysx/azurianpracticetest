package com.javieraduran.practiceTest.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    void getUser() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/api/users?pageNumber=1");
        MvcResult result = mvc.perform(request).andReturn();
        String responseString = result.getResponse().getContentAsString();
        JSONObject responseJson = new JSONObject(responseString);
        JSONArray available_pages;
        JSONArray users;
        try{
            available_pages = responseJson.getJSONArray("available_pages");
            users = responseJson.getJSONArray("users");
            Assertions.assertNotEquals(available_pages.length(), 0);

            if (users.length() > 5){
                Assertions.fail("Users length greater than 5");
            }

        }catch(Exception e){
            Assertions.fail("One of the required key doesn't exist");
        }
    }
}