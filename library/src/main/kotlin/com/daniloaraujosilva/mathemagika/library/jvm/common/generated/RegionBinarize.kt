package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RegionBinarize
 * 
 * Full name:        System`RegionBinarize
 * 
 *                   RegionBinarize[image, marker, d] gives a binary version of image that includes the foreground pixels of marker and also connected regions whose pixel values are within a distance d.
 *                   RegionBinarize[image, marker, d, {t , t }] grows regions in marker by adding pixels whose average intensity is also constrained within an interval {t , t }.
 * Usage:                                               1   2                                                                                                             1   2
 * 
 *                   MaxIterations -> 1
 * Options:          Method -> MeanEuclidean
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RegionBinarize
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionBinarize.html
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
fun regionBinarize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionBinarize", arguments.toMutableList(), options)
}
