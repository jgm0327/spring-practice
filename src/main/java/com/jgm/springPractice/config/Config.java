package com.jgm.springPractice.config;

import com.jgm.springPractice.logic.BubbleSort;
import com.jgm.springPractice.logic.service.SortService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@Configuration
@ComponentScan("com.jgm.springPractice")
public class Config {

}
