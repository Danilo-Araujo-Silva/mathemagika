package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ExpandAll
 * 
 * Full name:        System`ExpandAll
 * 
 *                   ExpandAll[expr] expands out all products and integer powers in any part of expr. 
 * Usage:            ExpandAll[expr, patt] avoids expanding parts of expr that do not contain terms matching the pattern patt. 
 * 
 *                   Modulus -> 0
 * Options:          Trig -> False
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ExpandAll
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExpandAll.html
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
fun expandAll(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExpandAll", arguments.toMutableList(), options)
}
