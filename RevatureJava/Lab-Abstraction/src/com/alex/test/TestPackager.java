package com.alex.test;

import com.alex.builders.Assembler;
import com.alex.interfaces.Packager;
import com.alex.model.Package;

public class TestPackager {

    public static void main(String[] args) {
        Packager packager = new Assembler();
        Package myPackage = packager.assemblePackage();

        System.out.println(myPackage);
    }
}