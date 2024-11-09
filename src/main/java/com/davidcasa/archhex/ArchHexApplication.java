package com.davidcasa.archhex;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootApplication
@Slf4j
public class ArchHexApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchHexApplication.class, args);
    }

}
