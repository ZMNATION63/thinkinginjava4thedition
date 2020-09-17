package com.company.chapter20annotations.examples.ex03tablecreator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class ExtractIntenface {
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtractInterface {
        public String value();
    }
}
