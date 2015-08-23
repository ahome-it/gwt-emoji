package com.ait.toolkit.emoji.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.emoji.client.core.EmojiElement;
import com.ait.toolkit.emoji.client.core.EmojiSize;
import com.ait.toolkit.emoji.client.emojis.FlagsEmoji;
import com.ait.toolkit.emoji.client.emojis.IsEmoji;
import com.ait.toolkit.emoji.client.emojis.NatureEmoji;
import com.ait.toolkit.emoji.client.emojis.ObjectEmoji;
import com.ait.toolkit.emoji.client.emojis.PeopleEmoji;
import com.ait.toolkit.emoji.client.emojis.PlacesEmoji;
import com.ait.toolkit.emoji.client.emojis.SymbolsEmoji;
import com.google.gwt.core.client.GWT;

public final class Emoji {

    private static final String DEFAULT_IMAGE_NAME = "e.png";

    private Emoji() {

    }

    public static EmojiElement get( IsEmoji emoji ) {
        return getEmojiElement( emoji );
    }

    public static String getBackGroundImageUrl() {
        return getBackGroundImageUrl( EmojiSize.REGULAR );
    }

    public static String getBackGroundImageUrl( EmojiSize size ) {
        if( size != EmojiSize.STANDARD ) {
            return GWT.getModuleBaseURL() + size.getValue() + "_" + DEFAULT_IMAGE_NAME;
        }
        return GWT.getModuleBaseURL() + DEFAULT_IMAGE_NAME;
    }

    public static List<PeopleEmoji> getPeopleEmojis() {
        return new ArrayList<PeopleEmoji>( Arrays.asList( PeopleEmoji.values() ) );
    }

    public static List<NatureEmoji> getNatureEmojis() {
        return new ArrayList<NatureEmoji>( Arrays.asList( NatureEmoji.values() ) );
    }

    public static List<ObjectEmoji> getObjectsEmojis() {
        return new ArrayList<ObjectEmoji>( Arrays.asList( ObjectEmoji.values() ) );
    }

    public static List<PlacesEmoji> getPlacesEmojis() {
        return new ArrayList<PlacesEmoji>( Arrays.asList( PlacesEmoji.values() ) );
    }

    public static List<SymbolsEmoji> getSymbolsEmojis() {
        return new ArrayList<SymbolsEmoji>( Arrays.asList( SymbolsEmoji.values() ) );
    }

    public static List<FlagsEmoji> getFlagsEmojis() {
        return new ArrayList<FlagsEmoji>( Arrays.asList( FlagsEmoji.values() ) );
    }

    private static EmojiElement getEmojiElement( final IsEmoji emoji ) {

        EmojiElement element = new EmojiElement() {

            @Override
            public String getEmojiStyleName() {
                this.currentClassName = emoji.getName();
                return this.currentClassName;
            }
        };

        return element;
    }

}
