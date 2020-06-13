package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FindFaces
 *
 * Full name:        System`FindFaces
 *
 *                   FindFaces[image] attempts to find human faces in image and returns a list of bounding boxes.
 *                   FindFaces[image, prop] returns the specified property prop for each detected face.
 * Usage:            FindFaces[image, crit, prop] finds faces that satisfy the criterion crit.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   MaxFeatures -> Automatic
 *                   MaxOverlapFraction -> Automatic
 *                   Method -> Automatic
 *                   Padding -> Fixed
 *                   PaddingSize -> None
 *                   PerformanceGoal :> $PerformanceGoal
 * Options:          SortedBy -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindFaces
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindFaces.html
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
fun findFaces(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindFaces", arguments.toMutableList(), options)
}
