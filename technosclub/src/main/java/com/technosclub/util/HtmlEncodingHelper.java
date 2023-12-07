package com.technosclub.util;

public class HtmlEncodingHelper {

    public static String encodeHtml(String input) {
        return input
                .replaceAll("&", "&amp;")
                .replaceAll("<", "&lt;")
                .replaceAll(">", "&gt;")
                .replaceAll("\"", "&quot;")
                .replaceAll("'", "&#39;");
    }

    public static String decodeHtml(String input) {
        return input
                .replaceAll("&amp;", "&")
                .replaceAll("&lt;", "<")
                .replaceAll("&gt;", ">")
                .replaceAll("&quot;", "\"")
                .replaceAll("&#39;", "'");
    }
}
