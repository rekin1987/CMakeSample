#include <jni.h>
#include <string>

extern "C" {

JNIEXPORT jstring JNICALL
Java_pl_emget_cpplib_NativeEntrypoint_stringFromJNI(JNIEnv *env, jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

JNIEXPORT jint JNICALL
Java_pl_emget_cpplib_NativeEntrypoint_multiplyIntegersNative(JNIEnv /* *env */, jobject /* this */, jint n1, jint n2) {
    return n1 * n2;
}

} // extern "C"
