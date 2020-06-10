package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SpatialMedian
 * 
 * Full name:        System`SpatialMedian
 * 
 *                   SpatialMedian[{x , x , …}] gives the spatial median of the elements x .
 *                                   1   2                                                i
 * Usage:            SpatialMedian[data] gives the spatial median for several different forms of data. 
 * 
 *                   AccuracyGoal -> Automatic
 *                   DistanceFunction -> Automatic
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PrecisionGoal -> Automatic
 * Options:          WorkingPrecision -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SpatialMedian
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpatialMedian.html
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
fun spatialMedian(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpatialMedian", arguments.toMutableList(), options)
}
