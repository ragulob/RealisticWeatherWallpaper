# Realistic Weather Wallpaper (Android)

This is a starter Android live-wallpaper project. It draws a stylized lakeside tree scene, switches day/night using the phone clock, and fetches current temperature/weather from Open-Meteo.

## Build on GitHub using only your phone
1. Create a new **public** GitHub repository named `RealisticWeatherWallpaper`.
2. On the repository page choose **Add file → Upload files**.
3. Upload the contents of this ZIP (the folders and files inside it) and commit to `main`.
4. Open the **Actions** tab. If GitHub asks, enable Actions for the repository.
5. Select **Build Android APK** and tap **Run workflow** (or wait for the first push build).
6. When the run finishes green, open it and download the `RealisticWeatherWallpaper-APK` artifact.
7. Extract the downloaded artifact ZIP and install `app-debug.apk`. Android may ask you to allow installs from your browser/files app.
8. Open the app, allow location, then tap **Set live wallpaper**.

## Notes
- Android Studio / a computer is not required; GitHub Actions builds the APK in the cloud.
- Weather uses Open-Meteo's public forecast endpoint; internet is required.
- The app reads the last known GPS/network location after you grant permission. If no location fix is available, it falls back to Chennai coordinates.
- The wallpaper service fetches weather about every 30 minutes while active. Rain is animated when precipitation/weather codes indicate rain.
- This is a starter visual implementation, not a photorealistic 3D renderer. Battery saver may limit refresh behavior.
- For a production release, add a Gradle wrapper and signing configuration. The debug APK is installable for personal testing.
