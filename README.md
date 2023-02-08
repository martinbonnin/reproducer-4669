To reproduce:

* ./gradlew :module:compileDebugUnitTestKotlin
* build succeeds
* change ExampleUnitTest.kt: `sed -i "" 's/change_me/something_else/g' module/src/test/java/com/example/ExampleUnitTest.kt`
* ./gradlew :module:compileDebugUnitTestKotlin
* build fails

```
> Task :module:compileDebugUnitTestKotlin FAILED
e: /Users/mbonnin/git/apollo-kotlin-template-multi-modules-and-services-android/module/src/test/java/com/example/ExampleUnitTest.kt: (9, 38): Cannot access class 'com.example.fragment.MyFragment'. Check your module classpath for missing or conflicting dependencies

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':module:compileDebugUnitTestKotlin'.
> A failure occurred while executing org.jetbrains.kotlin.compilerRunner.GradleCompilerRunnerWithWorkers$GradleKotlinCompilerWorkAction
   > Compilation error. See log for more details
```