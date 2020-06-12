package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageIdentify
 *
 * Full name:        System`ImageIdentify
 *
 *                   ImageIdentify[image] yields the result of attempting to identify what image is a picture of.
 *                   ImageIdentify[image, category] restricts the identification of image to objects within the specified category.
 *                   ImageIdentify[image, category, n] gives a list of up to n possible identifications.
 * Usage:            ImageIdentify[image, category, n, "prop"] gives the specified property for each identification.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   SpecificityGoal -> Automatic
 * Options:          TargetDevice -> CPU
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageIdentify
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageIdentify.html
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
fun imageIdentify(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageIdentify", arguments.toMutableList(), options)
}
