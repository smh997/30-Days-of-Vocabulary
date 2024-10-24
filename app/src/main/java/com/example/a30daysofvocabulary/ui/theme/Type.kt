package com.example.a30daysofvocabulary.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font
import com.example.a30daysofvocabulary.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val bodyFontFamily = FontFamily(
    Font(
        googleFont = GoogleFont("Open Sans"),
        fontProvider = provider,
    )
)

val displayFontFamily = FontFamily(
    Font(
        googleFont = GoogleFont("Lora"),
        fontProvider = provider,
    )
)

// Default Material 3 typography values
val baseline = Typography()

val Typography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = displayFontFamily),
    displayMedium = baseline.displayMedium.copy(fontFamily = displayFontFamily),
    displaySmall = baseline.displaySmall.copy(fontFamily = displayFontFamily),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = displayFontFamily),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = displayFontFamily),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = displayFontFamily),
    titleLarge = baseline.titleLarge.copy(fontFamily = displayFontFamily),
    titleMedium = baseline.titleMedium.copy(fontFamily = displayFontFamily),
    titleSmall = baseline.titleSmall.copy(fontFamily = displayFontFamily),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFontFamily),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFontFamily),
    bodySmall = baseline.bodySmall.copy(fontFamily = bodyFontFamily),
    labelLarge = baseline.labelLarge.copy(fontFamily = bodyFontFamily),
    labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily),
    labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily),
)


//import androidx.compose.material3.Typography
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.Font
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.sp
//import com.example.a30daysofvocabulary.R
//
//val openSansFontFamily = FontFamily(
//    Font(R.font.opensans_regular),
//    Font(R.font.opensans_lightitalic)
//)
//
//val loraFontFamily = FontFamily(
//    Font(R.font.lora_regular),
//    Font(R.font.lora_bold),
//    Font(R.font.lora_italic)
//)
//
//val Typography = Typography(
//    displayLarge = TextStyle(
//        fontFamily = loraFontFamily,
//        fontWeight = FontWeight.Bold,
//        fontSize = 36.sp
//    ),
//    displayMedium = TextStyle(
//        fontFamily = loraFontFamily,
//        fontStyle = FontStyle.Italic,
//        fontSize = 28.sp
//    ),
//    displaySmall = TextStyle(
//        fontFamily = loraFontFamily,
//        fontWeight = FontWeight.Normal,
//        fontSize = 20.sp
//    ),
//    bodyLarge = TextStyle(
//        fontFamily = openSansFontFamily,
//        fontWeight = FontWeight.Normal,
//        fontSize = 14.sp
//    ),
//    bodyMedium = TextStyle(
//        fontFamily = openSansFontFamily,
//        fontStyle = FontStyle.Italic,
//        fontSize = 14.sp
//    ),
//)
//
