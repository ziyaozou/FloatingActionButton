# FloatingActionButton
###Introduction
> This library is used to simulated the floating action button of material design.

###Develope Environment
> Android Studio v1.2


###How to use it
> 1.import the library into your project, add gradle script of below to your `app.gradle` file:
```
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile project(':fablibrary')
}
```
2.add `FloatingActionButton` to your layout file:
```xml
<com.github.ziyao.fablibrary.FloatingActionButton
        android:id="@+id/float_button"
        android:src="@mipmap/fab_ic_add"
        android:layout_width="@dimen/float_button_size"
        android:layout_height="@dimen/float_button_size"/>
```
3.set the background color when button is with normal state or pressed state:
```java
mButton = ( FloatingActionButton ) findViewById(R.id.float_button);
mButton.setColor(Color.BLUE, Color.GRAY);
```

###License
>
The MIT License (MIT)

>Copyright (c) 2014 Oleksandr Melnykov

>Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

>The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

###Demo
>
<img src="https://github.com/ziyaozou/FloatingActionButton/blob/master/sample.jpg?raw=true"/>

