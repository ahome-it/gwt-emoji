/*
 Copyright (c) 2015 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
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
