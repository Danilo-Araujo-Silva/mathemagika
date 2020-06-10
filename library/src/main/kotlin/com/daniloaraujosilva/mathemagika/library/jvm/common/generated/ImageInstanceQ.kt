package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ImageInstanceQ
 * 
 * Full name:        System`ImageInstanceQ
 * 
 *                   ImageInstanceQ[image, obj] gives True if image appears to be an instance of the object obj, and gives False otherwise.
 * Usage:            ImageInstanceQ[image, obj, cat] assumes that the image is of something in the category cat.
 * 
 *                   AcceptanceThreshold -> 0.5
 *                   PerformanceGoal -> Automatic
 *                   RecognitionPrior -> 0.5
 * Options:          TargetDevice -> CPU
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ImageInstanceQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageInstanceQ.html
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
fun imageInstanceQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageInstanceQ", arguments.toMutableList(), options)
}
