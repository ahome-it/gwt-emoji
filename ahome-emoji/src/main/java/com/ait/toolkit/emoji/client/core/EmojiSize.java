package com.ait.toolkit.emoji.client.core;

public enum EmojiSize {

    SMALL( "sm" ), MEDIUM( "me" ), STANDARD( "" ), REGULAR( "rg" ), LARGE( "lg" ), BIG( "bg" ), HUGE( "hg" );
    private String value;

    private EmojiSize( String value ) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
