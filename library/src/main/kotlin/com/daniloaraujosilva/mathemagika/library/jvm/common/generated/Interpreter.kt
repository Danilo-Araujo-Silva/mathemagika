package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Interpreter
 * 
 * Full name:        System`Interpreter
 * 
 *                   Interpreter[form] represents an interpreter object that can be applied to an input to try to interpret it as an object of the specified form. 
 *                   Interpreter[form, test] returns the interpreted object only if applying test to it yields True; otherwise it returns a Failure object.
 * Usage:            Interpreter[form, test, fail] returns the result of applying the function fail if the test fails.
 * 
 *                   AmbiguityFunction -> Automatic
 *                   DateFormat -> Automatic
 *                   DigitBlock -> Automatic
 *                   GeoLocation -> Automatic
 *                   ImportOptions -> {}
 *                   NumberPoint -> Automatic
 *                   NumberSeparator -> Automatic
 *                   NumberSigns -> Automatic
 * Options:          TimeZone -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Interpreter
 * Documentation:    web: http://reference.wolfram.com/language/ref/Interpreter.html
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
fun interpreter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Interpreter", arguments.toMutableList(), options)
}
