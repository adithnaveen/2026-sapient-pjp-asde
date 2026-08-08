package com.naveen.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


// Single Line
/* multi line
    comments
 */

/**
 * @author Naveen
 * @see "This is for income tax filing"
 * @since  2025
 */


public class IncomeTaxFiling {
    private static final Logger log = LoggerFactory.getLogger(IncomeTaxFiling.class);

    public static void main(String[] args) {
        Data data = Utils.acceptData();
        try {
            Utils.fileIncomeTax(data);
        }catch(NameTooSmallException ntse) {
            log.info(ntse.toString());
        }
     }

}

record Data(String name, double salary, String compName) {}
