package com.ait.toolkit.emoji.client.core;

public enum ObjectEmoji implements IsEmoji {
    BAMBOO,
    GIFT_HEART,
    DOLLS,
    SCHOOL_SATCHEL,
    MORTAR_BOARD,
    FLAGS,
    FIREWORKS,
    SPARKLER,
    WIND_CHIME,
    RICE_SCENE,
    JACK_O_LANTERN,
    GHOST,
    SANTA,
    CHRISTMAS_TREE,
    GIFT,
    BELL,
    NO_BELL,
    TANABATA_TREE,
    TADA,
    CONFETTI_BALL,
    BALLOON,
    CRYSTAL_BALL,
    CD,
    DVD,
    FLOPPY_DISK,
    CAMERA,
    VIDEO_CAMERA,
    MOVIE_CAMERA,
    COMPUTER,
    TV,
    IPHONE,
    PHONE,
    TELEPHONE,
    TELEPHONE_RECEIVER,
    PAGER,
    FAX,
    MINIDISC,
    VHS,
    SOUND,
    SPEAKER,
    MUTE,
    LOUDSPEAKER,
    MEGA,
    HOURGLASS,
    HOURGLASS_FLOWING_SAND,
    ALARM_CLOCK,
    WATCH,
    RADIO,
    SATELLITE,
    LOOP,
    MAG,
    MAG_RIGHT,
    UNLOCK,
    LOCK,
    LOCK_WITH_INK_PEN,
    CLOSED_LOCK_WITH_KEY,
    KEY,
    BULB,
    FLASHLIGHT,
    HIGH_BRIGHTNESS,
    LOW_BRIGHTNESS,
    ELECTRIC_PLUG,
    BATTERY,
    CALLING,
    EMAIL,
    MAILBOX,
    POSTBOX,
    BATH,
    BATHTUB,
    SHOWER,
    TOILET,
    WRENCH,
    NUT_AND_BOLT,
    HAMMER, SEAT,
    MONEYBAG,
    YEN,
    DOLLAR,
    POUND,
    EURO,
    CREDIT_CARD,
    MONEY_WITH_WINGS,
    E_MAIL,
    INBOX_TRAY,
    OUTBOX_TRAY,
    ENVELOPE,
    INCOMING_ENVELOPE,
    POSTAL_HORN,
    MAILBOX_CLOSED,
    MAILBOX_WITH_MAIL,
    MAILBOX_WITH_NO_MAIL,
    PACKAGE, DOOR,
    SMOKING,
    BOOM,
    GUN,
    HOCHO,
    PILL,
    SYRINGE,
    PAGE_FACING_UP,
    PAGE_WITH_CURL,
    BOOKMARK_TABS,
    BAR_CHART,
    CHART_WITH_UPWARDS_TREND,
    CHART_WITH_DOWNWARDS_TREND,
    SCROLL,
    CLIPBOARD,
    CALENDAR,
    DATE,
    CARD_INDEX,
    FILE_FOLDER,
    OPEN_FILE_FOLDER,
    SCISSORS,
    PUSHPIN,
    PAPERCLIP,
    BLACK_NIB,
    PENCIL2,
    STRAIGHT_RULER,
    TRIANGULAR_RULER,
    CLOSED_BOOK,
    GREEN_BOOK,
    BLUE_BOOK,
    ORANGE_BOOK,
    NOTEBOOK,
    NOTEBOOK_WITH_DECORATIVE_COVER,
    LEDGER,
    BOOKS,
    BOOKMARK,
    NAME_BADGE,
    MICROSCOPE,
    TELESCOPE,
    NEWSPAPER,
    FOOTBALL,
    BASKETBALL,
    SOCCER,
    BASEBALL,
    TENNIS,
    EIGHT_BALL,
    RUGBY_FOOTBALL,
    BOWLING,
    GOLF,
    MOUNTAIN_BICYCLIST,
    BICYCLIST,
    HORSE_RACING,
    SNOWBOARDER,
    SWIMMER,
    SURFER,
    SKI,
    SPADES,
    HEARTS,
    CLUBS,
    DIAMONDS,
    GEM,
    RING,
    TROPHY,
    MUSICAL_SCORE,
    MUSICAL_KEYBOARD,
    VIOLIN,
    SPACE_INVADER,
    VIDEO_GAME,
    BLACK_JOKER,
    FLOWER_PLAYING_CARDS,
    GAME_DIE,
    DART,
    MAHJONG,
    CLAPPER,
    MEMO,
    PENCIL,
    BOOK,
    ART,
    MICROPHONE,
    HEADPHONES,
    TRUMPET,
    SAXOPHONE,
    GUITAR,
    SHOE,
    SANDAL,
    HIGH_HEEL,
    LIPSTICK,
    BOOT,
    SHIRT,
    TSHIRT,
    NECKTIE,
    WOMANS_CLOTHES,
    DRESS,
    RUNNING_SHIRT_WITH_SASH,
    JEANS,
    KIMONO,
    BIKINI,
    RIBBON,
    TOPHAT,
    CROWN,
    WOMANS_HAT,
    MANS_SHOE,
    CLOSED_UMBRELLA,
    BRIEFCASE,
    HANDBAG,
    POUCH,
    PURSE,
    EYEGLASSES,
    FISHING_POLE_AND_FISH,
    COFFEE,
    TEA,
    SAKE,
    BABY_BOTTLE,
    BEER,
    BEERS,
    COCKTAIL,
    TROPICAL_DRINK,
    WINE_GLASS,
    FORK_AND_KNIFE,
    PIZZA,
    HAMBURGER,
    FRIES,
    POULTRY_LEG,
    MEAT_ON_BONE,
    SPAGHETTI,
    CURRY,
    FRIED_SHRIMP,
    BENTO,
    SUSHI,
    FISH_CAKE,
    RICE_BALL,
    RICE_CRACKER,
    RICE,
    RAMEN,
    STEW,
    ODEN,
    DANGO,
    EGG,
    BREAD,
    DOUGHNUT,
    CUSTARD,
    ICECREAM,
    ICE_CREAM,
    SHAVED_ICE,
    BIRTHDAY,
    CAKE,
    COOKIE,
    CHOCOLATE_BAR,
    CANDY,
    LOLLIPOP,
    HONEY_POT,
    APPLE,
    GREEN_APPLE,
    TANGERINE,
    LEMON,
    CHERRIES,
    GRAPES,
    WATERMELON,
    STRAWBERRY,
    PEACH,
    MELON,
    BANANA,
    PEAR,
    PINEAPPLE,
    SWEET_POTATO,
    EGGPLANT,
    TOMATO,
    CORN;

    @Override
    public String getName() {
        if( this.name().equalsIgnoreCase( E_MAIL.name() ) ) {
            return this.name().replace( "_", "-" ).toLowerCase();
        }
        return this.name().toLowerCase();
    }

}
