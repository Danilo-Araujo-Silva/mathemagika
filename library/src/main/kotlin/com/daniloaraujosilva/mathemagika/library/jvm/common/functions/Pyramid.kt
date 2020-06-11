package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Pyramid
 *
 * Full name:        System`Pyramid
 *
 *                   Pyramid[{p , …, p }] represents a filled pyramid with base {p , …, p } and top p .
 * Usage:                      1      5                                           1      4           5
 *
 *                   VertexColors -> Automatic
 * Options:          VertexTextureCoordinates -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Pyramid
 * Documentation:    web: http://reference.wolfram.com/language/ref/Pyramid.html
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
fun pyramid(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Pyramid", arguments.toMutableList(), options)
}
