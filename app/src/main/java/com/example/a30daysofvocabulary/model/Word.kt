package com.example.a30daysofvocabulary.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysofvocabulary.R

data class Word(
    @StringRes val spell: Int,
    val pos: PartOfSpeech,
    @DrawableRes val imageRes: Int,
    @StringRes val definition: Int,
    @StringRes val example: Int
)

object Dictionary{
    val words = listOf(
        Word(
            spell = R.string.spell1,
            pos = PartOfSpeech.ADJECTIVE,
            imageRes = R.drawable.vivacious,
            definition = R.string.definition1,
            example = R.string.example1
        ),
        Word(
            spell = R.string.spell2,
            pos = PartOfSpeech.NOUN,
            imageRes = R.drawable.satisfaction,
            definition = R.string.definition2,
            example = R.string.example2
        ),
        Word(
            spell = R.string.spell3,
            pos = PartOfSpeech.VERB,
            imageRes = R.drawable.giggle,
            definition = R.string.definition3,
            example = R.string.example3
        ),
        Word(
            spell = R.string.spell4,
            pos = PartOfSpeech.VERB,
            imageRes = R.drawable.captivate,
            definition = R.string.definition4,
            example = R.string.example4
        ),
        Word(
            spell = R.string.spell5,
            pos = PartOfSpeech.ADJECTIVE,
            imageRes = R.drawable.witty,
            definition = R.string.definition5,
            example = R.string.example5
        ),
        Word(
            spell = R.string.spell6,
            pos = PartOfSpeech.ADJECTIVE,
            imageRes = R.drawable.inventive,
            definition = R.string.definition6,
            example = R.string.example6
        ),
        Word(
            spell = R.string.spell7,
            pos = PartOfSpeech.NOUN,
            imageRes = R.drawable.determinant,
            definition = R.string.definition7,
            example = R.string.example7
        ),
        Word(
            spell = R.string.spell8,
            pos = PartOfSpeech.NOUN,
            imageRes = R.drawable.gallantry,
            definition = R.string.definition8,
            example = R.string.example8
        ),
        Word(
            spell = R.string.spell9,
            pos = PartOfSpeech.VERB,
            imageRes = R.drawable.hope,
            definition = R.string.definition9,
            example = R.string.example9
        ),
        Word(
            spell = R.string.spell10,
            pos = PartOfSpeech.NOUN,
            imageRes = R.drawable.repose,
            definition = R.string.definition10,
            example = R.string.example10
        ),
        Word(
            spell = R.string.spell11,
            pos = PartOfSpeech.NOUN,
            imageRes = R.drawable.hospitality,
            definition = R.string.definition11,
            example = R.string.example11
        ),
        Word(
            spell = R.string.spell12,
            pos = PartOfSpeech.NOUN,
            imageRes = R.drawable.elation,
            definition = R.string.definition12,
            example = R.string.example12
        ),
        Word(
            spell = R.string.spell13,
            pos = PartOfSpeech.ADJECTIVE,
            imageRes = R.drawable.pleasing,
            definition = R.string.definition13,
            example = R.string.example13
        ),
        Word(
            spell = R.string.spell14,
            pos = PartOfSpeech.ADJECTIVE,
            imageRes = R.drawable.stylish,
            definition = R.string.definition14,
            example = R.string.example14
        ),
        Word(
            spell = R.string.spell15,
            pos = PartOfSpeech.NOUN,
            imageRes = R.drawable.gaiety,
            definition = R.string.definition15,
            example = R.string.example15
        ),
        Word(
            spell = R.string.spell16,
            pos = PartOfSpeech.ADJECTIVE,
            imageRes = R.drawable.elegant,
            definition = R.string.definition16,
            example = R.string.example16
        ),
        Word(
            spell = R.string.spell17,
            pos = PartOfSpeech.VERB,
            imageRes = R.drawable.vote,
            definition = R.string.definition17,
            example = R.string.example17
        ),
        Word(
            spell = R.string.spell18,
            pos = PartOfSpeech.ADJECTIVE,
            imageRes = R.drawable.dirty,
            definition = R.string.definition18,
            example = R.string.example18
        ),
        Word(
            spell = R.string.spell19,
            pos = PartOfSpeech.NOUN,
            imageRes = R.drawable.bottle,
            definition = R.string.definition19,
            example = R.string.example19
        ),
        Word(
            spell = R.string.spell20,
            pos = PartOfSpeech.ADJECTIVE,
            imageRes = R.drawable.resource_private,
            definition = R.string.definition20,
            example = R.string.example20
        ),
        Word(
            spell = R.string.spell21,
            pos = PartOfSpeech.NOUN,
            imageRes = R.drawable.station,
            definition = R.string.definition21,
            example = R.string.example21
        ),
        Word(
            spell = R.string.spell22,
            pos = PartOfSpeech.ADJECTIVE,
            imageRes = R.drawable.modern,
            definition = R.string.definition22,
            example = R.string.example22
        ),
        Word(
            spell = R.string.spell23,
            pos = PartOfSpeech.VERB,
            imageRes = R.drawable.reflect,
            definition = R.string.definition23,
            example = R.string.example23
        ),
        Word(
            spell = R.string.spell24,
            pos = PartOfSpeech.VERB,
            imageRes = R.drawable.divide,
            definition = R.string.definition24,
            example = R.string.example24
        ),
        Word(
            spell = R.string.spell25,
            pos = PartOfSpeech.VERB,
            imageRes = R.drawable.exchange,
            definition = R.string.definition25,
            example = R.string.example25
        ),
        Word(
            spell = R.string.spell26,
            pos = PartOfSpeech.NOUN,
            imageRes = R.drawable.route,
            definition = R.string.definition26,
            example = R.string.example26
        ),
        Word(
            spell = R.string.spell27,
            pos = PartOfSpeech.NOUN,
            imageRes = R.drawable.strategy,
            definition = R.string.definition27,
            example = R.string.example27
        ),
        Word(
            spell = R.string.spell28,
            pos = PartOfSpeech.NOUN,
            imageRes = R.drawable.rush,
            definition = R.string.definition28,
            example = R.string.example28
        ),
        Word(
            spell = R.string.spell29,
            pos = PartOfSpeech.VERB,
            imageRes = R.drawable.wrap,
            definition = R.string.definition29,
            example = R.string.example29
        ),
        Word(
            spell = R.string.spell30,
            pos = PartOfSpeech.ADJECTIVE,
            imageRes = R.drawable.cute,
            definition = R.string.definition30,
            example = R.string.example30
        )

    )
}