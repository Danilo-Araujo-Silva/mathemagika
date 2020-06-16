package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CharacterNormalize
 *
 * Full name:        System`CharacterNormalize
 *
 * Usage:            CharacterNormalize["text", form] converts the characters in text to the specified normalization form.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/CharacterNormalize
 * Documentation:    web: http://reference.wolfram.com/language/ref/CharacterNormalize.html
 *
 * Definitions:      CharacterNormalize[NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`args, NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`res}, NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`args = System`Private`Arguments[CharacterNormalize[NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`expr], {2, 2}, Hold, {}]; NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`res /; NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`res = NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`iCharacterNormalize @@ Join @@ NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`args) =!= "aborted"]
 *
 * Own values:       None
 *
 * Down values:      CharacterNormalize[NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`expr___] := Module[{NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`args, NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`res}, NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`args = System`Private`Arguments[CharacterNormalize[NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`expr], {2, 2}, Hold, {}]; NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`res /; NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`args =!= {} && (NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`res = NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`iCharacterNormalize @@ Join @@ NaturalLanguageProcessing`CharacterNormalize`PackagePrivate`args) =!= "aborted"]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun characterNormalize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CharacterNormalize", arguments.toMutableList(), options)
}
