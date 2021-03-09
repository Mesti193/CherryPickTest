package pl.almestinio.cherrypicktest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.almestinio.cherrypicktest2.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user = User()
        user.id = 0
        user.firstName = "Test"

    }
}