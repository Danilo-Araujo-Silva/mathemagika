package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SpeechInterpreter
 *
 * Full name:        System`SpeechInterpreter
 *
 *                   SpeechInterpreter[form] represents an interpreter object that can be applied to a speech input to try to interpret it as an object of the specified form.
 *                   SpeechInterpreter[form, test] returns the interpreted object only if applying test to it yields True; otherwise, it returns a Failure object.
 * Usage:            SpeechInterpreter[form, test, fail] returns the result of applying the function fail if the test fails.
 *
 *                   AmbiguityFunction -> Automatic
 *                   DateFormat -> Automatic
 *                   DigitBlock -> Automatic
 *                   GeoLocation -> Automatic
 *                   ImportOptions -> {}
 *                   Masking -> All
 *                   NumberPoint -> Automatic
 *                   NumberSeparator -> Automatic
 *                   NumberSigns -> Automatic
 *                   TargetDevice -> CPU
 * Options:          TimeZone -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpeechInterpreter
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpeechInterpreter.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun speechInterpreter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpeechInterpreter", arguments.toMutableList(), options)
}
