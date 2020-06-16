package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TextContents
 *
 * Full name:        System`TextContents
 *
 *                   TextContents[text] gives a dataset of information about entities, dates, quantities and other content-related elements found in text.
 *                   TextContents[text, form] searches for cases of the type form.
 *                   TextContents[text, {form , form , …}] searches for cases of types form , form , …
 *                                           1      2                                      1      2
 * Usage:            TextContents[text, forms, props] includes the property props for each object in the dataset produced.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/TextContents
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextContents.html
 *
 *                   TextContents[] := Sort[NaturalLanguageProcessing`TextContents`PackagePrivate`$textContentsDefaultTypes]
 * Definitions:      TextContents[NaturalLanguageProcessing`TextContents`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`TextContents`PackagePrivate`args, NaturalLanguageProcessing`TextContents`PackagePrivate`res}, NaturalLanguageProcessing`TextContents`PackagePrivate`args = System`Private`Arguments[TextContents[NaturalLanguageProcessing`TextContents`PackagePrivate`expr], {1, 3}, Hold, NaturalLanguageProcessing`PackageScope`$HiddenOptions[TextContents]]; NaturalLanguageProcessing`TextContents`PackagePrivate`res /; NaturalLanguageProcessing`TextContents`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`TextContents`PackagePrivate`res = NaturalLanguageProcessing`TextContents`PackagePrivate`mainTextContents @@ Join @@ NaturalLanguageProcessing`TextContents`PackagePrivate`args) =!= "abort"]
 *
 * Own values:       None
 *
 *                   TextContents[] := Sort[NaturalLanguageProcessing`TextContents`PackagePrivate`$textContentsDefaultTypes]
 * Down values:      TextContents[NaturalLanguageProcessing`TextContents`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`TextContents`PackagePrivate`args, NaturalLanguageProcessing`TextContents`PackagePrivate`res}, NaturalLanguageProcessing`TextContents`PackagePrivate`args = System`Private`Arguments[TextContents[NaturalLanguageProcessing`TextContents`PackagePrivate`expr], {1, 3}, Hold, NaturalLanguageProcessing`PackageScope`$HiddenOptions[TextContents]]; NaturalLanguageProcessing`TextContents`PackagePrivate`res /; NaturalLanguageProcessing`TextContents`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`TextContents`PackagePrivate`res = NaturalLanguageProcessing`TextContents`PackagePrivate`mainTextContents @@ Join @@ NaturalLanguageProcessing`TextContents`PackagePrivate`args) =!= "abort"]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    Options[TextContents] := Options[TextContents] = Options[TextCases]
 *
 * Numeric values:   None
 */
fun textContents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextContents", arguments.toMutableList(), options)
}
