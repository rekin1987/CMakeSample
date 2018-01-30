package pl.emget.cpplib


class NativeEntrypoint {

    companion object {
        init {
            System.loadLibrary("native-pasu-lib")
        }
    }

    external fun stringFromJNI(): String

    external fun multiplyIntegersNative(n1: Int, n2: Int): Int
}
