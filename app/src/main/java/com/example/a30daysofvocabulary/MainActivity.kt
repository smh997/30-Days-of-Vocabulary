package com.example.a30daysofvocabulary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30daysofvocabulary.ui.theme._30DaysOfVocabularyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DaysOfVocabularyTheme (dynamicColor = false){
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ThirtyDaysOfVocabularyApp()
                }
            }
        }
    }
}

@Composable
fun ThirtyDaysOfVocabularyApp(modifier: Modifier = Modifier) {
    Scaffold (
        topBar = { VocabularyTopAppBar() },
        modifier = modifier
    ){innerPadding ->
        VocabularyList(innerPadding = innerPadding)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VocabularyTopAppBar() {
    TopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.app_name),
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(
                        start = dimensionResource(id = R.dimen.padding_small)
                    )
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    _30DaysOfVocabularyTheme {
        ThirtyDaysOfVocabularyApp()
    }
}

@Preview(showBackground = true)
@Composable
fun DarkThemeAppPreview() {
    _30DaysOfVocabularyTheme (darkTheme = true){
        ThirtyDaysOfVocabularyApp()
    }
}