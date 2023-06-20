package id.co.indocyber.composefirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            )
            {
                Greeting(name = "Office")
                clickButton()

            }
        }
    }
}

@Composable
fun clickButton() {
    val viewModel: MainViewModel = viewModel()
    Button(

        onClick = { viewModel.changeCount() }) {
        Text(
            color = Color.White,
            text = "Click"
        )
    }
}

@Composable
fun Greeting(name: String) {
    val viewModel: MainViewModel = viewModel()

    val data = remember {
        Details.EmployDetailsList
    }
    Box {
        Text(text = "Hello ${viewModel.count.observeAsState().value}")
    }
}

object Details {

    val EmployDetailsList = listOf(
        EmployDetails(
            id = 1,
            title = "Rohan",
            sex = "Male",
            age = 24,
            description = " Don't judge each day by the harvest you reap but by the seeds that you plant.” - ...",
        ),
        EmployDetails(
            id = 2,
            title = "Roy",
            sex = "male",
            age = 25,
            description = " Don't judge each day by the harvest you reap but by the seeds that you plant.” - ...",
        ),
        EmployDetails(
            id = 3,
            title = "Vishal",
            sex = "Male",
            age = 29,
            description = " Don't judge each day by the harvest you reap but by the seeds that you plant.” - ...",
        ),
        EmployDetails(
            id = 4,
            title = "Nikhil",
            sex = "Male",
            age = 27,
            description = " Don't judge each day by the harvest you reap but by the seeds that you plant.” - ...",
        ),
    )
}


data class EmployDetails(
    val id: Int,
    val title: String,
    val sex: String,
    val age: Int,
    val description: String,
    val ImageId: Int = 0
)