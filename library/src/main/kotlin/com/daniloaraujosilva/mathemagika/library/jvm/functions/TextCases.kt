package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TextCases
 *
 * Full name:        System`TextCases
 *
 *                   TextCases[text, form] gives a list of all cases of text identified as being of type form that appear in text.
 *                   TextCases[text, {form , form , …}] gives an association of results for all the types form .
 *                                        1      2                                                            i
 *                   TextCases[text, formspec  prop] gives the specified property for each result found.
 *                   TextCases[text, formspec  {prop , prop , …}] gives a list of properties for each result found.
 *                                                   1      2
 * Usage:            TextCases[text, spec, n] gives the first n cases found.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   TargetDevice -> CPU
 * Options:          VerifyInterpretation -> False
 *
 * Attributes:
 *
 *                   local: paclet:ref/TextCases
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextCases.html
 *
 *                   TextCases[] := NaturalLanguageProcessing`PackageScope`$TextCasesTypes
 * Definitions:      TextCases[NaturalLanguageProcessing`TextCases`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`TextCases`PackagePrivate`args, NaturalLanguageProcessing`TextCases`PackagePrivate`res}, NaturalLanguageProcessing`TextCases`PackagePrivate`args = System`Private`Arguments[TextCases[NaturalLanguageProcessing`TextCases`PackagePrivate`expr], {2, 3}, Hold, NaturalLanguageProcessing`PackageScope`$HiddenOptions[TextCases]]; NaturalLanguageProcessing`TextCases`PackagePrivate`res /; NaturalLanguageProcessing`TextCases`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`TextCases`PackagePrivate`res = NaturalLanguageProcessing`TextCases`PackagePrivate`mainTextCases @@ Join @@ NaturalLanguageProcessing`TextCases`PackagePrivate`args) =!= "abort"]
 *
 * Own values:       None
 *
 *                   TextCases[] := NaturalLanguageProcessing`PackageScope`$TextCasesTypes
 * Down values:      TextCases[NaturalLanguageProcessing`TextCases`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`TextCases`PackagePrivate`args, NaturalLanguageProcessing`TextCases`PackagePrivate`res}, NaturalLanguageProcessing`TextCases`PackagePrivate`args = System`Private`Arguments[TextCases[NaturalLanguageProcessing`TextCases`PackagePrivate`expr], {2, 3}, Hold, NaturalLanguageProcessing`PackageScope`$HiddenOptions[TextCases]]; NaturalLanguageProcessing`TextCases`PackagePrivate`res /; NaturalLanguageProcessing`TextCases`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`TextCases`PackagePrivate`res = NaturalLanguageProcessing`TextCases`PackagePrivate`mainTextCases @@ Join @@ NaturalLanguageProcessing`TextCases`PackagePrivate`args) =!= "abort"]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun textCases(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextCases", arguments.toMutableList(), options)
}
