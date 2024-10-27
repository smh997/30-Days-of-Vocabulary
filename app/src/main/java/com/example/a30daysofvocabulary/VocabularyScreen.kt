package com.example.a30daysofvocabulary

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30daysofvocabulary.model.Dictionary
import com.example.a30daysofvocabulary.model.Word
import com.example.a30daysofvocabulary.ui.theme._30DaysOfVocabularyTheme

@Composable
fun VocabularyList(innerPadding: PaddingValues, modifier: Modifier = Modifier) {
    val state = remember {
        MutableTransitionState(false).apply {
            targetState = true
        }
    }
    AnimatedVisibility(
        visibleState = state,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        LazyColumn(
            contentPadding = innerPadding,
            modifier = modifier
                .fillMaxWidth()
        ) {
            itemsIndexed(Dictionary.words) { index, word ->
                VocabularyListItem(word = word, index)
            }
        }
    }
}

@Composable
fun VocabularyListItem(word: Word, index: Int, modifier: Modifier = Modifier) {
    var favorite by remember { mutableStateOf(false) }
    var expanded by remember { mutableStateOf(false) }
    val color by animateColorAsState(
        targetValue = if (expanded) MaterialTheme.colorScheme.tertiaryContainer
        else MaterialTheme.colorScheme.primaryContainer
    )
    Card (
        modifier = modifier
            .fillMaxWidth()
            .clip(MaterialTheme.shapes.medium)
            .padding(dimensionResource(id = R.dimen.padding_medium))
            .clickable { expanded = !expanded }
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
    ){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .background(color)
                .padding(dimensionResource(id = R.dimen.padding_small))
        ){
            VocabCardHeader(index, word.spell, favorite, { favorite = !favorite })
            Image(
                painter = painterResource(id = word.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(
                        start = dimensionResource(id = R.dimen.padding_small),
                        top = dimensionResource(id = R.dimen.padding_small),
                        end = dimensionResource(id = R.dimen.padding_small),
                        bottom = dimensionResource(id = R.dimen.padding_medium)
                    )
                    .clip(MaterialTheme.shapes.small)

            )
            if(expanded){
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = dimensionResource(id = R.dimen.padding_medium)
                        )
                ){
                    Text(
                        text = stringResource(id = word.definition),
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        text = stringResource(id = word.example),
                        style = MaterialTheme.typography.bodyLarge,
                        fontStyle = FontStyle.Italic,
                        modifier = Modifier
                            .padding(dimensionResource(id = R.dimen.padding_small))
                    )
                }
            }
        }
    }

}

@Composable
fun VocabCardHeader(index: Int, spell: Int, favorite: Boolean, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ){
        Column (
            modifier = Modifier
                .padding(
                    start = dimensionResource(id = R.dimen.padding_medium),
                    top = dimensionResource(id = R.dimen.padding_small),
                    end = dimensionResource(id = R.dimen.padding_medium)
                )
        ){
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(Icons.Outlined.DateRange, contentDescription = null)
                Text(
                    text = stringResource(id = R.string.day, index + 1),
                    style = MaterialTheme.typography.titleMedium,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier
                        .padding(start = dimensionResource(id = R.dimen.padding_small))
                )
            }
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.padding_small)))
            Text(
                text = stringResource(id = spell),
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = onClick) {
            Icon(
                imageVector = Icons.Outlined.Favorite,
                contentDescription = null,
                modifier = Modifier
                    .padding(end = dimensionResource(id = R.dimen.padding_small)),
                tint = if (favorite) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.secondary
            )
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
@Preview(showBackground = true)
@Composable
fun DarkThemeVocabularyCardPreview() {
    _30DaysOfVocabularyTheme (darkTheme = true){
        VocabularyListItem(word = Dictionary.words[0], 0)
    }
}
