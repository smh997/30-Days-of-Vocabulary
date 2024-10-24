package com.example.a30daysofvocabulary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30daysofvocabulary.ui.theme._30DaysOfVocabularyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DaysOfVocabularyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    _30DaysOfVocabularyApp()
                }
            }
        }
    }
}

@Composable
fun _30DaysOfVocabularyApp(modifier: Modifier = Modifier) {
    Scaffold (
        
    ){innerPadding ->
        VocabularyList(innerPadding = innerPadding)
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    _30DaysOfVocabularyTheme {
        _30DaysOfVocabularyApp()
    }
}

@Preview(showBackground = true)
@Composable
fun DarkThemeAppPreview() {
    _30DaysOfVocabularyTheme (darkTheme = true){
        _30DaysOfVocabularyApp()
    }
}