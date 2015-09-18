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

