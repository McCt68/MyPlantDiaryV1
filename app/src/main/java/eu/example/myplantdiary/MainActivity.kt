package eu.example.myplantdiary

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import eu.example.myplantdiary.R.string.plantName
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
					modifier = Modifier.fillMaxWidth(),
					color = MaterialTheme.colors.background
				) {
					SpecimenFacts(name = "My Plants")
				}
			}
		}
	}
}

@Composable
fun SpecimenFacts(name: String) {
	var plantName by remember { mutableStateOf("") }
	var location by remember { mutableStateOf("") }
	var description by remember { mutableStateOf("") }
	var datePlanted by remember { mutableStateOf("") }
	val context = LocalContext.current

	Column() {
		OutlinedTextField(
			value = plantName,
			onValueChange = { plantName = it },
			label = { Text(text = stringResource(R.string.plantName)) },
			modifier = Modifier.fillMaxWidth()
		)

		OutlinedTextField(
			value = location,
			onValueChange = { newLocation ->
				location = newLocation },
			label = { Text(text = stringResource(R.string.location)) },
			modifier = Modifier.fillMaxWidth()
		)

		OutlinedTextField(
			value = description,
			onValueChange = { description = it },
			label = { Text(text = stringResource(R.string.description)) },
			modifier = Modifier.fillMaxWidth()
		)

		OutlinedTextField(
			value = datePlanted,
			onValueChange = { datePlanted = it },
			label = { Text(text = stringResource(R.string.datePlanted)) },
			modifier = Modifier.fillMaxWidth()
		)

		Button(
			onClick = {
				Toast.makeText(
					context,
					"$plantName, $location, $description, $datePlanted",
					Toast.LENGTH_LONG
				).show()
			}
		) {
			Text(text = "Save")
		}
	}
}

@Preview(name = "Light Mode", showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark Mode")
@Composable
fun DefaultPreview() {
	MyPlantDiaryTheme {
		// A surface container using the 'background' color from the theme
		Surface(
			modifier = Modifier.fillMaxWidth(),
			color = MaterialTheme.colors.background
		) { SpecimenFacts("Android") }

	}
}