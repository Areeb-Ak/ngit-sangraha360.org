# SG360 - Android Malware Detection

[![Platform](https://img.shields.io/badge/platform-Android-green.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-26%2B-brightgreen.svg)](https://android-arsenal.com/api?level=26)

SG360 is an open-source malware detection application for Android that enhances mobile security while preserving user privacy.

## ✨ Key Features

- **AI-Powered Malware Detection**: Identifies potential threats with high accuracy.
- **Static & Dynamic Analysis**: Scans APKs for suspicious behavior.
- **Minimal Permissions**: Requires only essential access.
- **Offline Functionality**: Works without an internet connection.
- **No Ads**: 100% ad-free experience.

## 🚀 Installation

### Direct APK Installation
1. Download the latest APK from our [GitHub Releases](https://github.com/cyberguard360/ngit-sangraha360.org/releases)
2. Enable installation from unknown sources in your device settings
3. Open the downloaded APK and follow the installation prompts

### Setting Up the Development Environment
If you're setting up this project for the first time, ensure the Android SDK is configured correctly:

1. **Verify Android SDK Path**
    - The project requires a valid Android SDK path.
    - If you encounter an SDK location error, create a `local.properties` file in the project's root directory and add:
      ```
      sdk.dir=C:\\Users\\YourUsername\\AppData\\Local\\Android\\Sdk
      ```
    - Replace `YourUsername` with your actual system username.

2. **Set ANDROID_HOME (Optional, but Recommended)**
    - Add `ANDROID_HOME` as an environment variable pointing to your SDK path.
    - Update the system `Path` variable to include:
      ```
      %ANDROID_HOME%\platform-tools
      %ANDROID_HOME%\emulator
      %ANDROID_HOME%\tools
      %ANDROID_HOME%\tools\bin
      ```

3. **Restart Android Studio**
    - Close and reopen Android Studio.
    - Run `File` → `Invalidate Caches / Restart` → `Invalidate and Restart`.


## 📋 Required Permissions

SG360 is designed to be minimally invasive:
- **Network Access**: For model updates and verification.
- **Storage Access**: For analyzing installed applications.

---

<p align="center">
  <br>
  Developed by the Sangraha360 Team
</p>