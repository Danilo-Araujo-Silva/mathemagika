package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageFocusCombine
 *
 * Full name:        System`ImageFocusCombine
 *
 *                   ImageFocusCombine[{image , image , …}] combines differently focused images image  of the same scene to obtain a single well-focused image.
 * Usage:                                    1       2                                               i
 *
 * Options:          PerformanceGoal -> Quality
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageFocusCombine
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageFocusCombine.html
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
fun imageFocusCombine(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageFocusCombine", arguments.toMutableList(), options)
}
