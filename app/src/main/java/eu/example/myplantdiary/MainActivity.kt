package eu.example.myplantdiary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import eu.example.myplantdiary.ui.theme.MyPlantDiaryTheme

/*
Following youtuber Brandan Jones Tutorial
https://www.youtube.com/watch?v=2kCokvw6UBI&list=PL73qvSDlAVVjvtc1emNoMTWJPD5S2jeWW&index=4
Will have examples of github implementation, jetpack compose, firebase and more.
Lots of very detailed information about android.
 */

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			MyPlantDiaryTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colors.background
				) {
					Greeting("Android")
				}
			}
		}
	}
}

@Composable
fun Greeting(name: String) {
	Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	MyPlantDiaryTheme {
		Greeting("Android")
	}
}