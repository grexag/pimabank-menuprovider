package com.grexdev.pimabank.menuprovider.parser;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegexParserMenuProviderConfiguration {
    
    private static int DEFAULT_HTTP_FETCHER_READ_TIMOUT = 60000; 
    
    private static int DEFAULT_HTTP_FETCHER_CONNECTION_TIMOUT = 15000; 
    
    private static int DEFAULT_REGEXP_MATCHER_TIMEOUT = 5000; 
    
    private static String DEFAULT_COMMONS_REGEXP_RESOURCE_NAME = "common-definitions.regex";
    
    private int httpFetcherReadTimeout;
    
    private int httpFetcherConnectionTimeout;
    
    private int regexpMatcherTimeout;
    
    private String commonsRegexResourceName;
    
    public static RegexParserMenuProviderConfiguration getDefault() {
        RegexParserMenuProviderConfiguration configuration = new RegexParserMenuProviderConfiguration();
        configuration.httpFetcherConnectionTimeout = DEFAULT_HTTP_FETCHER_CONNECTION_TIMOUT;
        configuration.httpFetcherReadTimeout = DEFAULT_HTTP_FETCHER_READ_TIMOUT;
        configuration.regexpMatcherTimeout = DEFAULT_REGEXP_MATCHER_TIMEOUT;
        configuration.commonsRegexResourceName = DEFAULT_COMMONS_REGEXP_RESOURCE_NAME;
        return configuration;
    }
    
}