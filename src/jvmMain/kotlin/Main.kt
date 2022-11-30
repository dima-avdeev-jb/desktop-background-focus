import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.DrawerValue
import androidx.compose.material.ModalDrawer
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.rememberDrawerState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication

fun main() = singleWindowApplication(WindowState(size = DpSize(300.dp,100.dp))) {
    val drawerState = rememberDrawerState(DrawerValue.Open)
    ModalDrawer(
        drawerState = drawerState,
        drawerContent = {
            TextButton(onClick = {}) {
                Text("Focusable as expected")
            }
        }
    ) {
        Box(Modifier.fillMaxSize()) {
            TextButton(onClick = {}, modifier = Modifier.align(Alignment.TopEnd)) {
                Text("Should not be focusable")
            }
        }
    }
}
