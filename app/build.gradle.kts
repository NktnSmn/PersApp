plugins {
    id("com.android.application")
    Plugins.kotlinPlugins.forEach { id(it) }
}

android {
    compileSdkVersion(AppInfo.compileSdkVersion)

    defaultConfig {
        applicationId = AppInfo.id
        minSdkVersion(AppInfo.minSdkVersion)
        targetSdkVersion(AppInfo.targetSdkVersion)
        versionCode = AppInfo.versionCode
        versionName = AppInfo.versionName
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    sourceSets {
        getByName("main").java.srcDirs(Structure.kotlinSrcDir)
    }
}

dependencies {
    implementation(Libs.kotlinStd)
    implementation(Libs.androidXCore)
    implementation(Libs.androidXAppCompat)
}