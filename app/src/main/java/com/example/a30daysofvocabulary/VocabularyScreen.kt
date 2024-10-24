package com.example.a30daysofvocabulary

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysofvocabulary.model.Dictionary
import com.example.a30daysofvocabulary.model.Word
import com.example.a30daysofvocabulary.ui.theme._30DaysOfVocabularyTheme

@Composable
fun VocabularyList(innerPadding: PaddingValues, modifier: Modifier = Modifier) {
    LazyColumn(
        contentPadding = innerPadding,
        modifier = modifier
    ){
        itemsIndexed(Dictionary.words){index, word ->
            VocabularyListItem(word = word, index)
        }
    }
}

@Composable
fun VocabularyListItem(word: Word, index: Int, modifier: Modifier = Modifier) {
    Card (
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .padding(16.dp)
    ){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ){
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 8.dp, end = 16.dp)
            ){
                Text(
                    text = stringResource(id = R.string.day, index + 1),
                    style = MaterialTheme.typography.titleSmall,
                    fontStyle = FontStyle.Italic
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = stringResource(id = word.spell),
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
            }
            Image(
                painter = painterResource(id = word.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(8.dp)
                    .clip(
                        CutCornerShape(
                            0.dp,
                            32.dp,
                            0.dp,
                            32.dp
                        )
                    )


            )
//            Spacer(modifier = Modifier.height(16.dp))
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 8.dp, end = 16.dp)
            ){
                Text(
                    text = stringResource(id = word.definition),
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = stringResource(id = word.example),
                    style = MaterialTheme.typography.bodyMedium,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier
                        .padding(8.dp)
                )
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun VocabularyCardPreview() {
    _30DaysOfVocabularyTheme {
        VocabularyListItem(word = Dictionary.words[0], 0)
    }
}

