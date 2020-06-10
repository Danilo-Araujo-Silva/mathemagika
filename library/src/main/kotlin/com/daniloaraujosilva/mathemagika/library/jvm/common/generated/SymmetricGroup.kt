package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SymmetricGroup
 * 
 * Full name:        System`SymmetricGroup
 * 
 * Usage:            SymmetricGroup[n] represents the symmetric group of degree n.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SymmetricGroup
 * Documentation:    web: http://reference.wolfram.com/language/ref/SymmetricGroup.html
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
fun symmetricGroup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SymmetricGroup", arguments.toMutableList(), options)
}
