package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             KeyComplement
 * 
 * Full name:        System`KeyComplement
 * 
 *                   KeyComplement[{assoc   , assoc , assoc , …}] generates an association in which only elements whose keys appear in assoc    but not in any of the assoc  are retained.
 * Usage:                                all       1       2                                                                                all                            i
 * 
 * Options:          SameTest -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/KeyComplement
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeyComplement.html
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
fun keyComplement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeyComplement", arguments.toMutableList(), options)
}
