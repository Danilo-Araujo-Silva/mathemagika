package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WordStem
 *
 * Full name:        System`WordStem
 *
 * Usage:            WordStem["word"] gives a stemmed form of word, removing plurals, inflections, etc.
 *
 * Options:          None
 *
 * Attributes:       Listable
 *
 *                   local: paclet:ref/WordStem
 * Documentation:    web: http://reference.wolfram.com/language/ref/WordStem.html
 *
 * Definitions:      WordStem[NaturalLanguageProcessing`WordStem`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`WordStem`PackagePrivate`args, NaturalLanguageProcessing`WordStem`PackagePrivate`res}, NaturalLanguageProcessing`WordStem`PackagePrivate`args = System`Private`Arguments[WordStem[NaturalLanguageProcessing`WordStem`PackagePrivate`expr], {1, 1}, Hold, {}]; NaturalLanguageProcessing`WordStem`PackagePrivate`res /; NaturalLanguageProcessing`WordStem`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`WordStem`PackagePrivate`res = NaturalLanguageProcessing`WordStem`PackagePrivate`iWordStem @@ Join @@ NaturalLanguageProcessing`WordStem`PackagePrivate`args) =!= "aborted"]
 *
 * Own values:       None
 *
 * Down values:      WordStem[NaturalLanguageProcessing`WordStem`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`WordStem`PackagePrivate`args, NaturalLanguageProcessing`WordStem`PackagePrivate`res}, NaturalLanguageProcessing`WordStem`PackagePrivate`args = System`Private`Arguments[WordStem[NaturalLanguageProcessing`WordStem`PackagePrivate`expr], {1, 1}, Hold, {}]; NaturalLanguageProcessing`WordStem`PackagePrivate`res /; NaturalLanguageProcessing`WordStem`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`WordStem`PackagePrivate`res = NaturalLanguageProcessing`WordStem`PackagePrivate`iWordStem @@ Join @@ NaturalLanguageProcessing`WordStem`PackagePrivate`args) =!= "aborted"]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun wordStem(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WordStem", arguments.toMutableList(), options)
}
