package com.belia.contactsapp.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.belia.contactsapp.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    TopAppBar(
        modifier = modifier,
        title = { Text(text = "Contacts App") },
        actions = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Call Home",
                modifier = Modifier
                    .clickable {
                    val phoneNumber = "0236730613"
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                    context.startActivity(intent)
                    }
                    .padding(horizontal = 16.dp)
            )
        }
    )
}