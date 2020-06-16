package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageCases
 *
 * Full name:        System`ImageCases
 *
 *                   ImageCases[image] gives an association of lists of subimages for each identified category of objects in image.
 *                   ImageCases[image, category] gives a list of subimages identified as an instance of the specified category.
 *                   ImageCases[image, category  prop] gives the specified property prop for each identified subimage.
 *                   ImageCases[image, {category , category , …}] gives an association with lists of subimages identified as being instances of each of the category .
 * Usage:                                       1          2                                                                                                        i
 *
 *                   AcceptanceThreshold -> Automatic
 *                   MaxFeatures -> Infinity
 *                   MaxOverlapFraction -> Automatic
 * Options:          TargetDevice -> CPU
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageCases
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageCases.html
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
fun imageCases(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageCases", arguments.toMutableList(), options)
}
