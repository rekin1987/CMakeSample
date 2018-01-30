package pl.emget.cmakesample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import pl.emget.cpplib.NativeEntrypoint

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        sample_text.text = NativeEntrypoint().stringFromJNI() + " " + NativeEntrypoint().multiplyIntegersNative(5, 5)
    }


}
