package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CloudLoggingData
 *
 * Full name:        System`CloudLoggingData
 *
 *                   CloudLoggingData[] gives summary logging data for all your cloud objects.
 *                   CloudLoggingData[category] gives summary logging data for all your cloud objects of a particular category.
 *                   CloudLoggingData[obj] gives summary logging data for the cloud object obj.
 *                   CloudLoggingData[{obj , …}] gives aggregated summary logging data for all the objects obj .
 *                                        1                                                                   i
 *                   CloudLoggingData[objs, period] gives summary logging data for the specified period.
 * Usage:            CloudLoggingData[objs, period, elems] gives logging data elements specified by elems.
 *
 *                   CloudBase -> Automatic
 *                   MaxItems -> Automatic
 * Options:          TimeSeriesBinSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudLoggingData
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudLoggingData.html
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
fun cloudLoggingData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudLoggingData", arguments.toMutableList(), options)
}
