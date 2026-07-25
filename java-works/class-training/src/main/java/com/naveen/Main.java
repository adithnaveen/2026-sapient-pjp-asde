package com.naveen;

import com.naveen.service.BusinessLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        BusinessLogic bl = new BusinessLogic();
        int result = bl.add(100, 200);
        log.info("Result {}", result);
        }
    }
