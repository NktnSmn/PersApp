object RootProjectParams {
    private const val buildToolsVersion = "4.0.2"
    val deps: List<String> =
        listOf(
            "com.android.tools.build:gradle:$buildToolsVersion",
            "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        )
}