package com.zefrocan.myapp.cucumber;

import com.zefrocan.myapp.JhipsterSampleApplicationApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JhipsterSampleApplicationApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
