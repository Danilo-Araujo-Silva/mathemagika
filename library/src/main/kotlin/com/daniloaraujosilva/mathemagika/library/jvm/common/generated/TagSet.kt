package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TagSet
 * 
 * Full name:        System`TagSet
 * 
 * Usage:            f/:lhs = rhs assigns rhs to be the value of lhs, and associates the assignment with the symbol f. 
 * 
 * Options:          None
 * 
 *                   HoldAll
 *                   Protected
 * Attributes:       SequenceHold
 * 
 *                   local: paclet:ref/TagSet
 * Documentation:    web: http://reference.wolfram.com/language/ref/TagSet.html
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
fun tagSet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TagSet", arguments.toMutableList(), options)
}
