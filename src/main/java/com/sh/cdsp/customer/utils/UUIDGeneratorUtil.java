//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.sh.cdsp.customer.utils;

import java.util.UUID;

public class UUIDGeneratorUtil {
    public UUIDGeneratorUtil() {
    }

    public static String getUUid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void main(String[] args) {
        System.out.println(getUUid());
    }
}
