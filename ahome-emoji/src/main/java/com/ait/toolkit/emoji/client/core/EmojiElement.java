package com.ait.toolkit.emoji.client.core;

import com.ait.toolkit.emoji.client.Emoji;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.user.client.ui.ComplexPanel;

public class EmojiElement extends ComplexPanel {

    private Element domElement;
    private String currentClassName = "";

    protected EmojiElement() {
        domElement = Document.get().createElement( "i" );
        setElement( domElement );
        domElement.getStyle().setProperty( "background", "url('" + Emoji.getBackGroundImageUrl() + "')" );
        domElement.getStyle().setDisplay( Display.INLINE_BLOCK );
        domElement.getStyle().setProperty( "margin", "0 .05em 0 .1em" );

        this.setStylePrimaryName( getEmojiStyleName() );
        this.setSize( EmojiSize.REGULAR );

    }

    private void updateStyleName( String styleName ) {
        this.currentClassName = styleName;
        setStylePrimaryName( currentClassName );
    }

    public EmojiElement setSize( EmojiSize size ) {
        if( !size.getValue().isEmpty() ) {
            this.updateStyleName( size.getValue() + "_" + this.getEmojiStyleName() );
        } else {
            this.updateStyleName( this.getEmojiStyleName() );
        }

        return this;
    }

    protected String getEmojiStyleName() {
        return this.currentClassName;
    }

    public String asString() {
        return "<i style='" + "display:inline-block;margin:0 .05em 0 .1em;background : url(" + Emoji.getBackGroundImageUrl()
                + ")' class='" + this.currentClassName + "'></i>";
    }
}
