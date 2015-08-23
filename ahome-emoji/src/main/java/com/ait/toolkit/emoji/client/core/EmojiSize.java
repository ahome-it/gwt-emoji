package com.ait.toolkit.emoji.client.core;

public enum EmojiSize {

    SMALL( "sm" ), STANDARD( "" ), REGULAR( "rg" );
    private String value;

    private EmojiSize( String value ) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
