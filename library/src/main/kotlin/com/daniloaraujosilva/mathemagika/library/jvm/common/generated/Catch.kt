package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Catch
 * 
 * Full name:        System`Catch
 * 
 *                   Catch[expr] returns the argument of the first Throw generated in the evaluation of expr. 
 *                   Catch[expr, form] returns value from the first Throw[value, tag] for which form matches tag. 
 * Usage:            Catch[expr, form, f] returns f[value, tag]. 
 * 
 * Options:          None
 * 
 *                   HoldFirst
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Catch
 * Documentation:    web: http://reference.wolfram.com/language/ref/Catch.html
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
fun `catch`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Catch", arguments.toMutableList(), options)
}
