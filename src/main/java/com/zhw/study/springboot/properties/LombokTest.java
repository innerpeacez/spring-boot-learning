package com.zhw.study.springboot.properties;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.*;

/**
 * @author: innerpeacez
 * @date: 2018/8/24 11:26
 * @Description:
 */
@ConfigurationProperties(prefix = "com.zhw")
//@Getter
//@Setter
//@EqualsAndHashCode(callSuper = false)
//@EqualsAndHashCode.AnyAnnotation
//@Data(staticConstructor = "getLombokTest")
//@NoArgsConstructor(force = true,staticName = "getInit")
//@AllArgsConstructor
@RequiredArgsConstructor
public class LombokTest {
//    @Getter(AccessLevel.MODULE)

    //    public LombokTest(@NonNull String name) {
//    }
    //    private boolean flag;
    //        this.name = name;
//    @Setter
//    @Getter
//    @Setter(AccessLevel.PROTECTED)
//    @NonNull
//    @Setter
//    @Getter
//    @Setter(AccessLevel.PACKAGE)
    private String name;
    private String phone;
    private transient boolean flag;
    private final String finalFiled;
    private static int num;

    /*@Synchronized
    public void hello() {

    }

    @Synchronized
    public static void helloWorld() {

    }

    private final Object world = new Object();

    @Synchronized("world")
    public void world() {

    }

    public static void main(String[] args) throws Exception {
        @Cleanup(value = "available") InputStream is = new FileInputStream(args[0]);
        @Cleanup OutputStream os = new FileOutputStream(args[0]);
    }*/

    /*@SneakyThrows()
    public void testSneakyThrows() {
       throw new IllegalAccessException();
    }

    @SneakyThrows(IllegalAccessException.class)
    public void testSneakyThrows2() {
        throw new IllegalAccessException();
    }*/


}


