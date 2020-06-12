package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageMarker
 *
 * Full name:        System`ImageMarker
 *
 *                   ImageMarker[pos] is a HighlightImage specification that represents a marker at position pos.
 *                   ImageMarker[pos, marker] represents a custom marker at position pos.
 *                   ImageMarker[{pos , pos , …}, …] represents multiple marker positions pos .
 * Usage:                            1     2                                                 i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageMarker
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageMarker.html
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
fun imageMarker(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageMarker", arguments.toMutableList(), options)
}
