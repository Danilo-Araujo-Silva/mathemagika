package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StyleData
 * 
 * Full name:        System`StyleData
 * 
 *                   StyleData["style"] is a low-level representation of the contents of a style definition cell.
 * Usage:            StyleData["style", "environment"] represents the contents of a style definition cell in the style environment "environment".
 * 
 * Options:          StyleDefinitions -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/StyleData
 * Documentation:    web: http://reference.wolfram.com/language/ref/StyleData.html
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
fun styleData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StyleData", arguments.toMutableList(), options)
}
