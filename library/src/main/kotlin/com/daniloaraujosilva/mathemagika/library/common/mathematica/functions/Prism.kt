package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Prism
 *
 * Full name:        System`Prism
 *
 *                   Prism[{p , …, p }] represents a filled prism connecting the triangles {p , p , p } and {p , p , p }.
 * Usage:                    1      6                                                        1   2   3        4   5   6
 *
 *                   VertexColors -> Automatic
 * Options:          VertexTextureCoordinates -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Prism
 * Documentation:    web: http://reference.wolfram.com/language/ref/Prism.html
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
fun prism(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Prism", arguments.toMutableList(), options)
}
