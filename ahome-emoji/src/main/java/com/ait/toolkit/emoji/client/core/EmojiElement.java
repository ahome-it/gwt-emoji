package com.ait.toolkit.emoji.client.core;

import com.ait.toolkit.emoji.client.Emoji;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.user.client.ui.ComplexPanel;

public abstract class EmojiElement extends ComplexPanel {

    private Element domElement;
    private EmojiSize currentSize;
    protected String currentClassName;

    protected EmojiElement() {
        domElement = Document.get().createElement( "i" );
        setElement( domElement );
        domElement.getStyle().setDisplay( Display.INLINE_BLOCK );
        domElement.getStyle().setProperty( "margin", "0 .05em 0 .1em" );

        this.setSize( EmojiSize.SMALL );

    }

    public EmojiElement setSize( EmojiSize size ) {
        this.currentSize = size;
        domElement.getStyle().setProperty( "background", "url('" + Emoji.getBackGroundImageUrl( this.currentSize ) + "')" );

        if( size != EmojiSize.STANDARD ) {
            this.currentClassName = size.getValue() + "_" + this.getEmojiStyleName();
        } else {
            this.currentClassName = this.getEmojiStyleName();
        }
        this.setStylePrimaryName( currentClassName );
        return this;
    }

    public abstract String getEmojiStyleName();

    public String asString() {
        return "<i style='" + "display:inline-block;margin:0 .05em 0 .1em;background : url("
                + Emoji.getBackGroundImageUrl( this.currentSize )
                + ")' class='" + this.currentClassName + "'></i>";
    }
}
