package com.example.testwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testwork.ui.theme.TestWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestWorkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFEDEFE3)
                ) {
                    Settings()
                }
            }
        }
    }
}

@Composable
fun Settings(modifier: Modifier = Modifier) {

    Column(
        modifier
            .padding(horizontal = 23.dp)
            .verticalScroll(rememberScrollState())) {
        Spacer(modifier.height(27.dp))
        Row(Modifier.fillMaxWidth(1f), horizontalArrangement = Arrangement.End) {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "",
                modifier = modifier
                    .clip(RoundedCornerShape(50))
                    .width(51.dp)
                    .height(51.dp)
            )
        }
        Spacer(modifier.height(15.dp))
        Text(text = "Settings", fontSize = 36.sp, fontWeight = FontWeight(400))
        Spacer(modifier.height(23.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clip(
                    RoundedCornerShape(25.dp)
                )
                .background(color = Color(0xFFDBEA8D))
                .padding(horizontal = 16.dp, vertical = 22.dp)
        ) {
            Image(painter = painterResource(R.drawable.baseline_app_settings_alt_24), contentDescription = "")
            Spacer(modifier.width(16.dp))
            Column {
                Text(
                    text = "Get to know your Pixel",
                    fontSize = 21.sp,
                    fontWeight = FontWeight(500),
                    lineHeight = 25.03.sp
                )
                Spacer(modifier.height(5.dp))
                Text(
                    text = "Explore what you can do with your phone",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    lineHeight = 16.69.sp
                )
            }
        }
        Spacer(modifier.height(15.dp))
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Search Settings...", fontSize = 20.sp, fontWeight = FontWeight(400))},
            modifier = modifier
                .fillMaxWidth(1f)
                .clip(
                    RoundedCornerShape(25.dp)
                )
        )
        Spacer(modifier.height(40.dp))
        Option(
            heading = "Network & Internet",
            desc = "Wi-Fi, Mobile, Data usage, Hotspot",
            icon = R.drawable.baseline_wifi_24,
            modifier = modifier
        )
        Spacer(modifier.height(41.dp))
        Option(
            heading = "Connected devices",
            desc = "Bluetooth, Cast, NFC",
            icon = R.drawable.baseline_devices_other_24,
            modifier = modifier
        )
        Spacer(modifier.height(41.dp))
        Option(
            heading = "App",
            desc = "Permissions, default apps",
            icon = R.drawable.baseline_apps_24,
            modifier = modifier
        )
        Spacer(modifier.height(41.dp))
        Option(
            heading = "Notifications",
            desc = "Permissions, dafault apps",
            icon = R.drawable.baseline_notifications_24,
            modifier = modifier
        )
        Spacer(modifier.height(41.dp))
        Option(
            heading = "Digital wellbeing",
            desc = "Screen time, app timer, bedtime schedules",
            icon = R.drawable.baseline_man_24,
            modifier = modifier
        )
    }
}

@Composable
fun Option(heading: String, desc: String, icon: Int, modifier: Modifier) {
    Row {
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .width(47.dp)
                .height(47.dp)
                .clip(RoundedCornerShape(50))
                .background(Color(0xFFE2E3D8))
        ) {
            Image(painter = painterResource(id = icon), contentDescription = "")
        }
        Spacer(modifier.width(17.dp))
        Column {
            Text(text = heading, fontSize = 20.sp, fontWeight = FontWeight(500))
            Spacer(modifier.height(4.dp))
            Text(text = desc, fontSize = 14.sp, fontWeight = FontWeight(400))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SettingsPreview() {
    TestWorkTheme() {
        Settings()
    }
}