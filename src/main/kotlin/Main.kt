import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.ui.unit.Dp

@Composable
@Preview
fun App() {
    val count = remember { mutableStateOf(0) }

    MaterialTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth().fillMaxHeight()
        ) {
            Text("Count: ${count.value}")
            Spacer(modifier = Modifier.height(Dp(10f)))
            Row {
                Button(
                    shape = RoundedCornerShape(50),
                    onClick = {
                        count.value++
                    }
                ) {
                    Text("Increment")
                }
                Spacer(modifier = Modifier.width(Dp(10f)))
                Button(
                    shape = RoundedCornerShape(50),
                    onClick = {
                        count.value--
                    }
                ) {
                    Text("Decrement")
                }
            }
        }
    }
}

fun main() = application {
    Window(
        title = "Compose for Desktop",
        onCloseRequest = ::exitApplication
    ) {
        App()
    }
}
