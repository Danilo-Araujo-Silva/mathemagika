package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Parallelepiped
 *
 * Full name:        System`Parallelepiped
 *
 *                   Parallelepiped[p, {v , …, v }] represents a parallelepiped with origin p and directions v .
 * Usage:                                1      k                                                             i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Parallelepiped
 * Documentation:    web: http://reference.wolfram.com/language/ref/Parallelepiped.html
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
fun parallelepiped(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Parallelepiped", arguments.toMutableList(), options)
}
