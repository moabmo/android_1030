package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.test.ui.theme.TestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("MOABMO 001" +
                            "Duh-duh-duh-duh-do-do-do\n" +
                            "Duh-duh-duh-duh-do-do-do\n" +
                            "Duh-duh-duh-duh-do-do-do-do\n" +
                            "No, I don't say it often\n" +
                            "And I probably should've told you\n" +
                            "I hurt this bad, I know\n" +
                            "And I probably shouldn't want this so bad\n" +
                            "It's weighing, weighing on me\n" +
                            "Don't wanna wake up in the morning\n" +
                            "Cannot undo what we did in this bed\n" +
                            "And I can't get you out\n" +
                            "So I gotta go\n" +
                            "No, I'm not ready for\n" +
                            "You want me all alone\n" +
                            "But I'm undecided, excited, ignited\n" +
                            "And I don't wanna feel the way I do\n" +
                            "But I like it\n" +
                            "Look at all these sparks flying\n" +
                            "But I'm still indecisive\n" +
                            "And she want me to wife it\n" +
                            "But I'm undecided\n" +
                            "I know I shouldn't be doing this, but here we go again\n" +
                            "Girl, you know that pussy is my weakness (weakness, weakness, weakness)\n" +
                            "Girl, you got me addicted when you switching positions\n" +
                            "You tell me, \"Shut up\"\n" +
                            "And you know I listen, I hate it\n" +
                            "Wish I never did it\n" +
                            "I can't keep sinning and pretending (ooh, oh, oh, oh)\n" +
                            "I'm taking off your clothes\n" +
                            "We getting sexual\n" +
                            "Hit it so good, think I'll propose\n" +
                            "I don't know but\n" +
                            "I'm undecided\n" +
                            "Excited (ooh yeah yeah yeah yeah)\n" +
                            "Ignited (ooh yeah yeah yeah yeah)\n" +
                            "And I don't wanna feel the way I do\n" +
                            "But I like it\n" +
                            "Look at all these sparks flying (all these, all these)\n" +
                            "But I'm still indecisive ('cause you want me)\n" +
                            "But she want me to wife it\n" +
                            "But I'm undecided\n" +
                            "Duh-duh-duh-duh-do-do-do\n" +
                            "Duh-duh-duh-duh-do-do-do\n" +
                            "Duh-duh-duh-duh-do-do-do-do\n" +
                            "Oh, no, I'm undecided\n" +
                            "Duh-duh-duh-duh-do-do-do, yeah\n" +
                            "Duh-duh-duh-duh-do-do-do, I said I just don't know\n" +
                            "Duh-duh-duh-duh-do-do-do-do\n" +
                            "Ayy, 'cause I'm undecided\n" +
                            "No, no, baby\n" +
                            "I'm afraid of your love\n" +
                            "Oh, ooh, you got me, baby\n" +
                            "'Cause I can't get enough, ooh\n" +
                            "But I'm undecided\n" +
                            "Excited (ooh yeah yeah yeah yeah)\n" +
                            "Ignited (ooh yeah yeah yeah yeah)\n" +
                            "And I don't wanna feel the way I do\n" +
                            "But I like it\n" +
                            "Look at all these sparks flying\n" +
                            "But I'm still indecisive\n" +
                            "And she want me to wife it\n" +
                            "But I'm undecided\n" +
                            "Duh-duh-duh-duh-do-do-do\n" +
                            "Duh-duh-duh-duh-do-do-do\n" +
                            "Duh-duh-duh-duh-do-do-do-do\n" +
                            "No, no, oh, no, and I want it (I'm undecided)\n" +
                            "Duh-duh-duh-duh-do-do-do (ay)\n" +
                            "Duh-duh-duh-duh-do-do-do (no, no, no, no)\n" +
                            "Duh-duh-duh-duh-do-do-do-do\n" +
                            "Ooh, but I'm undecided")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestTheme {
        Greeting("MOABMO 002")
    }
}