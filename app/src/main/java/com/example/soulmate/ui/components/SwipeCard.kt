package com.example.soulmate.ui.components



import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.soulmate.model.User

@Composable
fun SwipeCard(
    user: User,
    onSwipeRight: () -> Unit,
    onSwipeLeft: () -> Unit
) {

    var offsetX by remember { mutableStateOf(0f) }

    Card(
        shape = RoundedCornerShape(24.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .offset(x = offsetX.dp)
            .pointerInput(Unit) {
                detectDragGestures(
                    onDragEnd = {
                        when {
                            offsetX > 250f -> onSwipeRight()
                            offsetX < -250f -> onSwipeLeft()
                        }
                        offsetX = 0f
                    }
                ) { change, dragAmount ->
                    offsetX += dragAmount.x
                }
            }
    ) {

        Box {

            AsyncImage(
                model = user.imageUrl,
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(16.dp)
            ) {
                Text(
                    "${user.name}, ${user.age}",
                    style = MaterialTheme.typography.headlineSmall
                )
            }
        }
    }
}