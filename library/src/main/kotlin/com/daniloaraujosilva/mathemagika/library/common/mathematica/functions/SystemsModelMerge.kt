package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SystemsModelMerge
 *
 * Full name:        System`SystemsModelMerge
 *
 *                   SystemsModelMerge[{sys , sys , …}] merges the systems models sys .
 * Usage:                                  1     2                                   j
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemsModelMerge
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelMerge.html
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
fun systemsModelMerge(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelMerge", arguments.toMutableList(), options)
}
