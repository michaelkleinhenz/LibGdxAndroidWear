# LibGdx Android Waer Example Project

This projects is a template example for running LibGdx on Android Wear. You can just build it using:

    ./gradlew assembleRelease
    
After build, you'll get an APK in mobile/build/outputs/apk that contains the Android app as well as
the Wear app. Currently this will not run out-of-the-box on a real device, because there is no
trigger to run the micro app on the Wear device. If you want to use this in a real setup, you
will need to connect the mobile app to the wear app and create some kind of notification
from which the user can launch the Wear app. See the Wear documentation how to create
a messaging channel between mobile and Wear, it's just standard stuff.

## So how can I play around with it then?

Easy: you can launch the Wear app from Android Studio either in an emulator or on a real watch. Just
launch the "com.goquestor.brainschallenge.BrainsWearActivity" activity.