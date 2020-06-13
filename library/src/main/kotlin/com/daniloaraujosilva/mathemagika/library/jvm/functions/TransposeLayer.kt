package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TransposeLayer
 *
 * Full name:        System`TransposeLayer
 *
 *                   TransposeLayer[] represents a net layer that transposes the first two levels of its input.
 *                   TransposeLayer[m  n] represents a net layer that transposes levels m and n of its input.
 *                   TransposeLayer[{m   n , m   n , …}] represents a net layer that sequentially transposes levels m  and n  of its input.
 * Usage:                             1    1   2    2                                                                  i      i
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TransposeLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransposeLayer.html
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
fun transposeLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransposeLayer", arguments.toMutableList(), options)
}
