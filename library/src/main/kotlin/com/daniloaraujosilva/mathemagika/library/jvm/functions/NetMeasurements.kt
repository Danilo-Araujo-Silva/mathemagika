package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetMeasurements
 *
 * Full name:        System`NetMeasurements
 *
 *                   NetMeasurements[net, data, measurement] computes the requested measurement for the net evaluated on data.
 *                   NetMeasurements[net, data, {mspec , mspec , …}] computes a list of measurements for the net evaluated on data.
 * Usage:                                             1       2
 *
 *                   BatchSize -> Automatic
 *                   LossFunction -> Automatic
 *                   NetEvaluationMode -> Test
 *                   TargetDevice -> CPU
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetMeasurements
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetMeasurements.html
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
fun netMeasurements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetMeasurements", arguments.toMutableList(), options)
}
