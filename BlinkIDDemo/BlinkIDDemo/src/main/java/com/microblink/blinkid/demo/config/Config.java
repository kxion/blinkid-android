package com.microblink.blinkid.demo.config;

import com.microblink.locale.Language;
import com.microblink.recognizers.ocr.mrtd.MRTDRecognizerSettings;
import com.microblink.recognizers.settings.RecognizerSettings;

public class Config {
    /** Language used in PhotoPay */
    public static final Language LANGUAGE = Language.English;

    /** Flag indicating PhotoPay should be run in landscape */
    public static final boolean IS_LANDSCAPE = false;

    /** Flag indicating Viewfinder should be moveable */
    public static final boolean VIEWFINDER_MOVEABLE = true;

    /** Returns recognizer settings */
    public static RecognizerSettings[] getRecognizerSettings() {
        MRTDRecognizerSettings sett = new MRTDRecognizerSettings();

        return new RecognizerSettings[] {
                sett
        };
    }
}

