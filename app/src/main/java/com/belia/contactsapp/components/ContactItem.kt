package com.belia.contactsapp.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.belia.contactsapp.Contact
import com.belia.contactsapp.R

@Composable
fun ContactItem(
    modifier: Modifier = Modifier,
    contact: Contact
) {
    val context = LocalContext.current
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(Color.LightGray)
            .clickable {
                val phoneNumber = contact.number
                val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                context.startActivity(intent)
            }
    ) {
        Image(
            painter = painterResource(id = contact.pic),
            contentDescription = contact.name,
        )
        Text(
            text = contact.name,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color.Black,
            fontSize = 18.sp,
            modifier = modifier.padding(top = 8.dp)
        )
        SelectionContainer {
            Text(
                text = contact.number,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                color = Color.DarkGray,
                modifier = modifier.padding(vertical = 4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ContactItemPreview() {
    ContactItem(contact = Contact("Mohamed", "+20123456789", R.drawable.friend_1))
}