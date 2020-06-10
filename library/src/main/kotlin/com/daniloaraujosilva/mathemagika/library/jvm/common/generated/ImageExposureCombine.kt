package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ImageExposureCombine
 * 
 * Full name:        System`ImageExposureCombine
 * 
 *                   ImageExposureCombine[{image , image , …}] combines differently exposed images image  of the same scene into a single image with overall good exposure.
 *                                              1       2                                               i
 *                   ImageExposureCombine[{image , image , …}, mode] creates a low or a high dynamic range image based on the specified mode.
 * Usage:                                       1       2
 * 
 * Options:          PerformanceGoal -> Quality
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ImageExposureCombine
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageExposureCombine.html
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
fun imageExposureCombine(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageExposureCombine", arguments.toMutableList(), options)
}
