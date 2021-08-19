package eif.viko.lt.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import eif.viko.lt.firstcomposeapp.ui.theme.FirstcomposeappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
        Image(painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Logo")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstcomposeappTheme {
        Greeting("Android")
    }
}