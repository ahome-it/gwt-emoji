# gwt-emoji
Easily add emoji icons to your web app

Downloading artifacts

RELEASE:

Maven:
```xml
<dependency>
  <groupId>com.ahome-it</groupId>
  <artifactId>gwt-emoji</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```
Gradle:
```
dependencies {
    compile(group:'com.ahome-it',name:'gwt-emoji',version:'1.0.0-SNAPSHOT')
}
```

Direct Download
```
http://opensource.ahome-it.com/#gwtemoji
```

Once you have downloaded the jar and added to your project,
inherit the gwt-emoji module in your gwt.xml file.

```xml
<inherits name='com.ait.toolkit.emoji.Emoji'/>
```

 Now that everything is set adding a emoji icon to your application is pretty simple.
```java
package com.ait.toolkit.emoji.test.client;

import com.ait.toolkit.emoji.client.Emoji;
import com.ait.toolkit.emoji.client.emojis.PeopleEmoji;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class EmojiTest implements EntryPoint {
    @Override
    public void onModuleLoad() {
        RootPanel.get().add( Emoji.get( PeopleEmoji.SMILE ) );
    }
}
```

There are some use case where you dont want to use the Emoji as a (GWT)Widget, but rather as a string/html.
Think of the editor of a chat application for example. In this each emijo element has a getName() method which returns its String representation

```java
package com.ait.toolkit.emoji.test.client;

import com.ait.toolkit.emoji.client.emojis.FlagsEmoji;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.DOM;

public class EmojiTest implements EntryPoint {
    @Override
    public void onModuleLoad() {
        String country = FlagsEmoji.CAMEROON.getName();

        DOM.getElementById( "placeHolder" ).setInnerHTML( country );
    }
}
```

 


