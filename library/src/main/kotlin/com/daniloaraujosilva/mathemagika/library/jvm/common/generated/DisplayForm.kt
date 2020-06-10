package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DisplayForm
 * 
 * Full name:        System`DisplayForm
 * 
 * Usage:            DisplayForm[expr] prints with low-level boxes inside expr shown in explicit two-dimensional or other form. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/DisplayForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/DisplayForm.html
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
fun displayForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DisplayForm", arguments.toMutableList(), options)
}
