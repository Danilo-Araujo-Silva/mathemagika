package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TextPosition
 *
 * Full name:        System`TextPosition
 *
 *                   TextPosition[text, form] gives a list of the starting and ending positions at which instances of form occur in text.
 *                   TextPosition[text, {form , form , …}] gives an association of results for all the types form .
 *                                           1      2                                                            i
 * Usage:            TextPosition[text, formspec, n] gives the positions of the first n cases found.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   TargetDevice -> CPU
 * Options:          VerifyInterpretation -> False
 *
 * Attributes:
 *
 *                   local: paclet:ref/TextPosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextPosition.html
 *
 *                   TextPosition[] := NaturalLanguageProcessing`PackageScope`$TextCasesTypes
 * Definitions:      TextPosition[NaturalLanguageProcessing`TextPosition`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`TextPosition`PackagePrivate`args, NaturalLanguageProcessing`TextPosition`PackagePrivate`res}, NaturalLanguageProcessing`TextPosition`PackagePrivate`args = System`Private`Arguments[TextPosition[NaturalLanguageProcessing`TextPosition`PackagePrivate`expr], {2, 3}, Hold, NaturalLanguageProcessing`PackageScope`$HiddenOptions[TextPosition]]; NaturalLanguageProcessing`TextPosition`PackagePrivate`res /; NaturalLanguageProcessing`TextPosition`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`TextPosition`PackagePrivate`res = NaturalLanguageProcessing`TextPosition`PackagePrivate`mainTextPosition @@ Join @@ NaturalLanguageProcessing`TextPosition`PackagePrivate`args) =!= "abort"]
 *
 * Own values:       None
 *
 *                   TextPosition[] := NaturalLanguageProcessing`PackageScope`$TextCasesTypes
 * Down values:      TextPosition[NaturalLanguageProcessing`TextPosition`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`TextPosition`PackagePrivate`args, NaturalLanguageProcessing`TextPosition`PackagePrivate`res}, NaturalLanguageProcessing`TextPosition`PackagePrivate`args = System`Private`Arguments[TextPosition[NaturalLanguageProcessing`TextPosition`PackagePrivate`expr], {2, 3}, Hold, NaturalLanguageProcessing`PackageScope`$HiddenOptions[TextPosition]]; NaturalLanguageProcessing`TextPosition`PackagePrivate`res /; NaturalLanguageProcessing`TextPosition`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`TextPosition`PackagePrivate`res = NaturalLanguageProcessing`TextPosition`PackagePrivate`mainTextPosition @@ Join @@ NaturalLanguageProcessing`TextPosition`PackagePrivate`args) =!= "abort"]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun textPosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextPosition", arguments.toMutableList(), options)
}
