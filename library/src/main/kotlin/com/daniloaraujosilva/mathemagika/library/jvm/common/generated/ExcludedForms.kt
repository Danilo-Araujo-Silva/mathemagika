package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ExcludedForms
 * 
 * Full name:        System`ExcludedForms
 * 
 * Usage:            ExcludedForms is an option that gives a list of patterns for expressions that should be excluded from an operation performed by a particular function. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ExcludedForms
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExcludedForms.html
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
fun excludedForms(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExcludedForms", arguments.toMutableList(), options)
}
