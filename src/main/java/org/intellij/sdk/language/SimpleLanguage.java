package org.intellij.sdk.language;

import com.intellij.lang.Language;


public class SimpleLanguage extends Language {

    public static final SimpleLanguage INSTANCE = new SimpleLanguage();

    private SimpleLanguage() {
        super("Simple");
    }

}
