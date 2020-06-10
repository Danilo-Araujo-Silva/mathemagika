package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TextStructure
 * 
 * Full name:        System`TextStructure
 * 
 *                   TextStructure["text"] generates a nested collection of TextElement objects representing the grammatical structure of natural language text.
 * Usage:            TextStructure["text", form] generates a representation of the type specified by form of the grammatical structure of text.
 * 
 * Options:          PerformanceGoal -> Automatic
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/TextStructure
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextStructure.html
 * 
 * Definitions:      TextStructure[NaturalLanguageProcessing`TextStructure`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`TextStructure`PackagePrivate`args, NaturalLanguageProcessing`TextStructure`PackagePrivate`res}, NaturalLanguageProcessing`TextStructure`PackagePrivate`args = System`Private`Arguments[TextStructure[NaturalLanguageProcessing`TextStructure`PackagePrivate`expr], {1, 2}, Hold, {}]; NaturalLanguageProcessing`TextStructure`PackagePrivate`res /; NaturalLanguageProcessing`TextStructure`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`TextStructure`PackagePrivate`res = NaturalLanguageProcessing`TextStructure`PackagePrivate`mainTextStructure @@ Join @@ NaturalLanguageProcessing`TextStructure`PackagePrivate`args) =!= "abort"]
 * 
 * Own values:       None
 * 
 * Down values:      TextStructure[NaturalLanguageProcessing`TextStructure`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`TextStructure`PackagePrivate`args, NaturalLanguageProcessing`TextStructure`PackagePrivate`res}, NaturalLanguageProcessing`TextStructure`PackagePrivate`args = System`Private`Arguments[TextStructure[NaturalLanguageProcessing`TextStructure`PackagePrivate`expr], {1, 2}, Hold, {}]; NaturalLanguageProcessing`TextStructure`PackagePrivate`res /; NaturalLanguageProcessing`TextStructure`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`TextStructure`PackagePrivate`res = NaturalLanguageProcessing`TextStructure`PackagePrivate`mainTextStructure @@ Join @@ NaturalLanguageProcessing`TextStructure`PackagePrivate`args) =!= "abort"]
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun textStructure(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextStructure", arguments.toMutableList(), options)
}
