package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FindTextualAnswer
 *
 * Full name:        System`FindTextualAnswer
 *
 *                   FindTextualAnswer[text, "question"] gives the substring of text that best appears to answer question.
 *                   FindTextualAnswer[text, "question", n] gives a list of up to n answers that appear most probable.
 * Usage:            FindTextualAnswer[text, "question", n, prop] gives the specified property for each answer.
 *
 *                   PerformanceGoal -> Automatic
 * Options:          TargetDevice -> CPU
 *
 * Attributes:
 *
 *                   local: paclet:ref/FindTextualAnswer
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindTextualAnswer.html
 *
 * Definitions:      FindTextualAnswer[NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`args, NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`res}, NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`args = System`Private`Arguments[FindTextualAnswer[NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`expr], {2, 4}, Hold, NaturalLanguageProcessing`PackageScope`$HiddenOptions[FindTextualAnswer]]; NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`res /; NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`res = NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`iFindTextualAnswer @@ Join @@ NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`args) =!= "abort"]
 *
 * Own values:       None
 *
 * Down values:      FindTextualAnswer[NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`args, NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`res}, NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`args = System`Private`Arguments[FindTextualAnswer[NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`expr], {2, 4}, Hold, NaturalLanguageProcessing`PackageScope`$HiddenOptions[FindTextualAnswer]]; NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`res /; NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`res = NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`iFindTextualAnswer @@ Join @@ NaturalLanguageProcessing`FindTextualAnswer`PackagePrivate`args) =!= "abort"]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun findTextualAnswer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindTextualAnswer", arguments.toMutableList(), options)
}
