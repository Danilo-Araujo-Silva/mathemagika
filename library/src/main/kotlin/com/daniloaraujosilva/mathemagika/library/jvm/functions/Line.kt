package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Line
 *
 * Full name:        System`Line
 *
 *                   Line[{p , p , …}] represents the line segments joining a sequence for points p .
 *                          1   2                                                                  i
 *                   Line[{{p  , p  , …}, {p  , …}, …}] represents a collection of lines.
 * Usage:                    11   12        21
 *
 *                   VertexColors -> None
 * Options:          VertexNormals -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Line
 * Documentation:    web: http://reference.wolfram.com/language/ref/Line.html
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
fun line(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Line", arguments.toMutableList(), options)
}
